package roostify.poc.dapp198.service;

import roostify.poc.dapp198.dto.Property;

import java.util.List;

public interface PropertyService {


    List<Property> getPropertyDetails(String zipcode);
}
