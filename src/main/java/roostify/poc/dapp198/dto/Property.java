package roostify.poc.dapp198.dto;

import com.zillow._static.xsd.zillowtypes.LocalRealEstate;
import com.zillow._static.xsd.zillowtypes.Zestimate;

import java.util.Map;

public class Property {

    private Map<String, String> zillowLink;
    private Map<String, String> completeAddress;

    private Zestimate zestimate;


    private Zestimate rentZestimateData;
    private LocalRealEstate localRealEstate;
    private Boolean limit_warning;

    public Map<String, String> getZillowLink() {
        return zillowLink;
    }

    public void setZillowLink(Map<String, String> zillowLink) {
        this.zillowLink = zillowLink;
    }

    public Map<String, String> getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(Map<String, String> completeAddress) {
        this.completeAddress = completeAddress;
    }

    public Zestimate getZestimate() {
        return zestimate;
    }

    public void setZestimate(Zestimate zestimate) {
        this.zestimate = zestimate;
    }


    public Zestimate getRentZestimateData() {
        return rentZestimateData;
    }

    public void setRentZestimateData(Zestimate rentZestimateData) {
        this.rentZestimateData = rentZestimateData;
    }

    public LocalRealEstate getLocalRealEstate() {
        return localRealEstate;
    }

    public void setLocalRealEstate(LocalRealEstate localRealEstate) {
        this.localRealEstate = localRealEstate;
    }

    public Boolean getLimit_warning() {
        return limit_warning;
    }

    public void setLimit_warning(Boolean limit_warning) {
        this.limit_warning = limit_warning;
    }
}
