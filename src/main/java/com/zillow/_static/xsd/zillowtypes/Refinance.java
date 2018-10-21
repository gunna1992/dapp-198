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
 * <p>Java class for Refinance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Refinance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalMonthlySavings" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="currentMonthlyPayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="newMonthlyPayment" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="breakEven" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="lifetimeSavings" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="savingsTableSchedule" type="{http://www.zillow.com/static/xsd/ZillowTypes.xsd}SavingsTableSchedule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Refinance", propOrder = {
        "totalMonthlySavings",
        "currentMonthlyPayment",
        "newMonthlyPayment",
        "breakEven",
        "lifetimeSavings",
        "savingsTableSchedule"
})
public class Refinance {

    @XmlElement(required = true)
    protected BigInteger totalMonthlySavings;
    @XmlElement(required = true)
    protected BigInteger currentMonthlyPayment;
    @XmlElement(required = true)
    protected BigInteger newMonthlyPayment;
    @XmlElement(required = true)
    protected BigInteger breakEven;
    @XmlElement(required = true)
    protected BigInteger lifetimeSavings;
    @XmlElement(required = true)
    protected List<SavingsTableSchedule> savingsTableSchedule;

    /**
     * Gets the value of the totalMonthlySavings property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getTotalMonthlySavings() {
        return totalMonthlySavings;
    }

    /**
     * Sets the value of the totalMonthlySavings property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setTotalMonthlySavings(BigInteger value) {
        this.totalMonthlySavings = value;
    }

    /**
     * Gets the value of the currentMonthlyPayment property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getCurrentMonthlyPayment() {
        return currentMonthlyPayment;
    }

    /**
     * Sets the value of the currentMonthlyPayment property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCurrentMonthlyPayment(BigInteger value) {
        this.currentMonthlyPayment = value;
    }

    /**
     * Gets the value of the newMonthlyPayment property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNewMonthlyPayment() {
        return newMonthlyPayment;
    }

    /**
     * Sets the value of the newMonthlyPayment property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNewMonthlyPayment(BigInteger value) {
        this.newMonthlyPayment = value;
    }

    /**
     * Gets the value of the breakEven property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getBreakEven() {
        return breakEven;
    }

    /**
     * Sets the value of the breakEven property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setBreakEven(BigInteger value) {
        this.breakEven = value;
    }

    /**
     * Gets the value of the lifetimeSavings property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLifetimeSavings() {
        return lifetimeSavings;
    }

    /**
     * Sets the value of the lifetimeSavings property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLifetimeSavings(BigInteger value) {
        this.lifetimeSavings = value;
    }

    /**
     * Gets the value of the savingsTableSchedule property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savingsTableSchedule property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavingsTableSchedule().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavingsTableSchedule }
     */
    public List<SavingsTableSchedule> getSavingsTableSchedule() {
        if (savingsTableSchedule == null) {
            savingsTableSchedule = new ArrayList<SavingsTableSchedule>();
        }
        return this.savingsTableSchedule;
    }

}