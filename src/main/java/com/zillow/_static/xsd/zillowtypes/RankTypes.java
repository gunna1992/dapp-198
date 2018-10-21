//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.21 at 10:42:41 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RankTypes.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="RankTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="priceHighToLow"/>
 *     &lt;enumeration value="priceLowToHigh"/>
 *     &lt;enumeration value="featured"/>
 *     &lt;enumeration value="dateSold"/>
 *     &lt;enumeration value="daysOnZillow"/>
 *     &lt;enumeration value="bedrooms"/>
 *     &lt;enumeration value="bathrooms"/>
 *     &lt;enumeration value="livingArea"/>
 *     &lt;enumeration value="yearBuilt"/>
 *     &lt;enumeration value="lotArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "RankTypes")
@XmlEnum
public enum RankTypes {

    @XmlEnumValue("priceHighToLow")
    PRICE_HIGH_TO_LOW("priceHighToLow"),
    @XmlEnumValue("priceLowToHigh")
    PRICE_LOW_TO_HIGH("priceLowToHigh"),
    @XmlEnumValue("featured")
    FEATURED("featured"),
    @XmlEnumValue("dateSold")
    DATE_SOLD("dateSold"),
    @XmlEnumValue("daysOnZillow")
    DAYS_ON_ZILLOW("daysOnZillow"),
    @XmlEnumValue("bedrooms")
    BEDROOMS("bedrooms"),
    @XmlEnumValue("bathrooms")
    BATHROOMS("bathrooms"),
    @XmlEnumValue("livingArea")
    LIVING_AREA("livingArea"),
    @XmlEnumValue("yearBuilt")
    YEAR_BUILT("yearBuilt"),
    @XmlEnumValue("lotArea")
    LOT_AREA("lotArea");
    private final String value;

    RankTypes(String v) {
        value = v;
    }

    public static RankTypes fromValue(String v) {
        for (RankTypes c : RankTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
