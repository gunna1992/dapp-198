package roostify.poc.dapp198.service;

import com.zillow._static.xsd.searchresults.Searchresults;
import com.zillow._static.xsd.zillowtypes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roostify.poc.dapp198.dto.Property;
import roostify.poc.dapp198.exception.EntityNotFoundException;
import roostify.poc.dapp198.exception.InvalidParameterValueException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("PropertyServiceImpl")
public class PropertyServiceImpl implements PropertyService {

    private static final String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
    Pattern pattern = Pattern.compile(regex);

    @Autowired
    private ZillowService zillowService;

    @Override
    public List<Property> getPropertyDetails(String zipcode) {


        Matcher matcher = pattern.matcher(zipcode);
        if (!matcher.matches()) {
            throw new InvalidParameterValueException("invalid zipcode ");
        }

        //fetch the address details against zipcode and then fetch zpid from this
        String address = "2114 Bigelow Ave";

        Searchresults.Response response = zillowService.getSearchResult(address, zipcode, null);
        List<Property> properties = new ArrayList<>();

        if (response == null) {

            throw new EntityNotFoundException("no property found for respective zipcode");
        }
        Searchresults.Response.Results results = response.getResults();
        List<SimpleProperty> props = results.getResult();
        props.forEach(simpleProperty -> {
            Zestimate zestimate = simpleProperty.getZestimate();
            Long zpid = simpleProperty.getZpid();
            Zestimate rentzestimate = simpleProperty.getRentzestimate();
            LocalRealEstate localrealestate = simpleProperty.getLocalRealEstate();
            Address address1 = simpleProperty.getAddress();
            Links links = simpleProperty.getLinks();

            Property property = new Property();
            properties.add(property);
            Map<String, String> linkMap = new HashMap<>();
            Map<String, String> addressMap = new HashMap<>();
            linkMap.put("homedetails", links.getHomedetails());
            linkMap.put("graphsanddata", links.getGraphsanddata());
            linkMap.put("comparables", links.getComparables());
            linkMap.put("mapthishome", links.getMapthishome());
            property.setZillowLink(linkMap);
            addressMap.put("city", address1.getCity());
            addressMap.put("state", address1.getState());
            addressMap.put("street", address1.getStreet());
            addressMap.put("zipcode", address1.getZipcode());
            property.setCompleteAddress(addressMap);
            //Zestimate zestimate1 = new Zestimate();
            property.setZestimate(zestimate);
            property.setLocalRealEstate(localrealestate);
            property.setRentZestimateData(rentzestimate);


        });

        return properties;
    }
}
