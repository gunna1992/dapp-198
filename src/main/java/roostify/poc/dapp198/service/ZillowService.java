package roostify.poc.dapp198.service;

import com.zillow._static.xsd.searchresults.Searchresults;
import com.zillow._static.xsd.zillowtypes.DetailedProperty;

public interface ZillowService {

    /**
     * For a specified Zillow property identifier (zpid), the GetZestimate API returns:
     * <p>
     * The most recent property Zestimate
     * <p>
     * The date the Zestimate was computed
     * <p>
     * The valuation range
     * <p>
     * The Zestimate ranking within the property's ZIP code.
     * <p>
     * The full property address and geographic location (latitude/longitude) and a set of identifiers that uniquely represent the region (ZIP code, city, county & state) in which the property exists.
     * <p>
     * The GetZestimate API will only surface properties for which a Zestimate exists. If a request is made for a property that has no Zestimate, an error code is returned. Zillow doesn't have Zestimates for all the homes in its database. For such properties, we do have tax assessment data, but that is not provided through the API. For more information, see our Zestimate coverage.
     * <p>
     * The GetZestimate Web Service is located at:
     * http://www.zillow.com/webservice/GetZestimate.html
     *
     * @param zpid          The Zillow Property ID for the property for which to obtain information. The parameter type is an integer.
     * @param rentzestimate Return Rent Zestimate information if available (boolean true/false, default: false)
     * @return
     */

    DetailedProperty getZestimate(Integer zpid, Boolean rentzestimate);

    /**
     * @param address
     * @param citystatezip
     * @param rentzestimate
     * @return
     */
    Searchresults.Response getSearchResult(String address, String citystatezip, Boolean rentzestimate);

}
