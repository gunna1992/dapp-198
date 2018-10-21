//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.21 at 10:42:41 PM IST 
//


package com.zillow._static.xsd.zillowtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for buyingBlock complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="buyingBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buying" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mortgagePayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="hoaFees" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="propertyTaxes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="utilities" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="renovations" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="maintainCosts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="homeOwnerInsurance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="opportunityCostInitial" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="opportunityCostYearly" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="totalBenefit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buyingBlock", propOrder = {
        "buying"
})
public class BuyingBlock {

    protected List<BuyingBlock.Buying> buying;

    /**
     * Gets the value of the buying property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buying property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuying().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyingBlock.Buying }
     */
    public List<BuyingBlock.Buying> getBuying() {
        if (buying == null) {
            buying = new ArrayList<BuyingBlock.Buying>();
        }
        return this.buying;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mortgagePayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="hoaFees" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="propertyTaxes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="utilities" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="renovations" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="maintainCosts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="homeOwnerInsurance" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="opportunityCostInitial" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="opportunityCostYearly" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="totalBenefit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "mortgagePayment",
            "principal",
            "interest",
            "hoaFees",
            "propertyTaxes",
            "utilities",
            "renovations",
            "maintainCosts",
            "homeOwnerInsurance",
            "opportunityCostInitial",
            "opportunityCostYearly",
            "totalBenefit",
            "totalCost"
    })
    public static class Buying {

        @XmlElement(required = true)
        protected BigInteger mortgagePayment;
        @XmlElement(required = true)
        protected BigInteger principal;
        @XmlElement(required = true)
        protected BigInteger interest;
        @XmlElement(required = true)
        protected BigInteger hoaFees;
        @XmlElement(required = true)
        protected BigInteger propertyTaxes;
        @XmlElement(required = true)
        protected BigInteger utilities;
        @XmlElement(required = true)
        protected BigInteger renovations;
        @XmlElement(required = true)
        protected BigInteger maintainCosts;
        @XmlElement(required = true)
        protected BigInteger homeOwnerInsurance;
        @XmlElement(required = true)
        protected BigInteger opportunityCostInitial;
        @XmlElement(required = true)
        protected BigInteger opportunityCostYearly;
        @XmlElement(required = true)
        protected BigInteger totalBenefit;
        @XmlElement(required = true)
        protected BigInteger totalCost;

        /**
         * Gets the value of the mortgagePayment property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMortgagePayment() {
            return mortgagePayment;
        }

        /**
         * Sets the value of the mortgagePayment property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMortgagePayment(BigInteger value) {
            this.mortgagePayment = value;
        }

        /**
         * Gets the value of the principal property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPrincipal() {
            return principal;
        }

        /**
         * Sets the value of the principal property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPrincipal(BigInteger value) {
            this.principal = value;
        }

        /**
         * Gets the value of the interest property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getInterest() {
            return interest;
        }

        /**
         * Sets the value of the interest property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setInterest(BigInteger value) {
            this.interest = value;
        }

        /**
         * Gets the value of the hoaFees property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getHoaFees() {
            return hoaFees;
        }

        /**
         * Sets the value of the hoaFees property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setHoaFees(BigInteger value) {
            this.hoaFees = value;
        }

        /**
         * Gets the value of the propertyTaxes property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getPropertyTaxes() {
            return propertyTaxes;
        }

        /**
         * Sets the value of the propertyTaxes property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setPropertyTaxes(BigInteger value) {
            this.propertyTaxes = value;
        }

        /**
         * Gets the value of the utilities property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getUtilities() {
            return utilities;
        }

        /**
         * Sets the value of the utilities property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setUtilities(BigInteger value) {
            this.utilities = value;
        }

        /**
         * Gets the value of the renovations property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getRenovations() {
            return renovations;
        }

        /**
         * Sets the value of the renovations property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setRenovations(BigInteger value) {
            this.renovations = value;
        }

        /**
         * Gets the value of the maintainCosts property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getMaintainCosts() {
            return maintainCosts;
        }

        /**
         * Sets the value of the maintainCosts property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setMaintainCosts(BigInteger value) {
            this.maintainCosts = value;
        }

        /**
         * Gets the value of the homeOwnerInsurance property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getHomeOwnerInsurance() {
            return homeOwnerInsurance;
        }

        /**
         * Sets the value of the homeOwnerInsurance property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setHomeOwnerInsurance(BigInteger value) {
            this.homeOwnerInsurance = value;
        }

        /**
         * Gets the value of the opportunityCostInitial property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOpportunityCostInitial() {
            return opportunityCostInitial;
        }

        /**
         * Sets the value of the opportunityCostInitial property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOpportunityCostInitial(BigInteger value) {
            this.opportunityCostInitial = value;
        }

        /**
         * Gets the value of the opportunityCostYearly property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getOpportunityCostYearly() {
            return opportunityCostYearly;
        }

        /**
         * Sets the value of the opportunityCostYearly property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setOpportunityCostYearly(BigInteger value) {
            this.opportunityCostYearly = value;
        }

        /**
         * Gets the value of the totalBenefit property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getTotalBenefit() {
            return totalBenefit;
        }

        /**
         * Sets the value of the totalBenefit property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setTotalBenefit(BigInteger value) {
            this.totalBenefit = value;
        }

        /**
         * Gets the value of the totalCost property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getTotalCost() {
            return totalCost;
        }

        /**
         * Sets the value of the totalCost property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setTotalCost(BigInteger value) {
            this.totalCost = value;
        }

    }

}
