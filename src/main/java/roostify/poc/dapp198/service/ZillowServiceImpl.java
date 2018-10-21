package roostify.poc.dapp198.service;

import com.zillow._static.xsd.searchresults.Searchresults;
import com.zillow._static.xsd.zestimate.ZestimateResultType;
import com.zillow._static.xsd.zillowtypes.DetailedProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

import static org.apache.logging.log4j.util.Strings.trimToNull;

@Service
public class ZillowServiceImpl implements ZillowService {

    //http://www.zillow.com/webservice/GetRegionChildren.htm?zws-id=X1-ZWz18buiybkn4b_a6mew&state=wa&city=seattle&childtype=neighborhood

    private final static String REGION_CHILDREN_URL = "http://www.zillow.com/webservice/GetRegionChildren.htm";
    private final static String COMPS_URL = "http://www.zillow.com/webservice/GetDeepComps.htm";
    private final static String ZESTIMATE_URL = "http://www.zillow.com/webservice/GetZestimate.htm";
    private final static String SEARCH_RESULTS = "https://www.zillow.com/webservice/GetSearchResults.htm";

    @Value("${zillow4j.zws-id}")
    private String zwsId;
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public DetailedProperty getZestimate(Integer zpid, Boolean rentzestimate) {

        if (zpid == null)
            throw new IllegalArgumentException("At least zpid is required");
        if (rentzestimate == null)
            rentzestimate = false;

        StringBuilder url = new StringBuilder(ZESTIMATE_URL);
        url.append("?zws-id=").append(zwsId);
        url.append("&zpid=").append(zpid);
        url.append("&rentzestimate=").append(rentzestimate);

        ZestimateResultType response = restTemplate.getForObject(url.toString(), ZestimateResultType.class);

        return response.getResponse();
    }

    @Override
    public Searchresults.Response getSearchResult(String address, String citystatezip, Boolean rentzestimate) {

        address = trimToNull(address);
        citystatezip = trimToNull(citystatezip);

        if (address == null || citystatezip == null) {

            throw new IllegalArgumentException("at least address or citystatezip is required");

        }

        if (citystatezip != null)
            citystatezip = URLEncoder.encode(citystatezip);
        if (address != null)
            address = URLEncoder.encode(address);
        if (rentzestimate == null)
            rentzestimate = false;

        StringBuilder url = new StringBuilder(SEARCH_RESULTS);
        url.append("?zws-id=").append(zwsId);
        if (address != null)
            url.append("&address=").append(address);
        if (citystatezip != null)
            url.append("&citystatezip=").append(citystatezip);
        url.append("&rentzestimate=").append(rentzestimate);

        Searchresults response = restTemplate.getForObject(url.toString(), Searchresults.class);
        return response.getResponse();


    }


}
