package roostify.poc.dapp198.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import roostify.poc.dapp198.dto.Property;
import roostify.poc.dapp198.service.PropertyService;

import java.util.List;

@RestController
@RequestMapping("/api/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping()
    List<Property> getPropertDetails(@RequestParam(value = "zipcode") String zipcode) {

        List<Property> properties = propertyService.getPropertyDetails(zipcode);
        return properties;
    }

}
