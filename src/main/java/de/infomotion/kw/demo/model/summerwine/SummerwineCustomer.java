package de.infomotion.kw.demo.model.summerwine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "Kunde")
public class SummerwineCustomer {

    @Id
    @Column(name = "kundennummer", insertable = true, updatable = false, nullable = true)
    private BigInteger customerNumber;

    @Column(name = "kundenname", nullable = true)
    private String customerName;

    @Column(name = "PLZ", nullable = true)
    private Integer zipCode;

    @Column(name = "ort", nullable = true)
    private String city;

    @Column(name = "strasse", nullable = true)
    private String streetName;

    @Column(name = "bundesland_kurz", nullable = true)
    private String federalStateShortCode;

    @Column(name = "staat_kurz", nullable = true)
    private String stateShortCode;

    protected SummerwineCustomer(){}

    public SummerwineCustomer(BigInteger customerNumber, String customerName, Integer zipCode, String city, String streetName, String federalStateShortCode, String stateShortCode) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.zipCode = zipCode;
        this.city = city;
        this.streetName = streetName;
        this.federalStateShortCode = federalStateShortCode;
        this.stateShortCode = stateShortCode;
    }

    public BigInteger getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(BigInteger customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getFederalStateShortCode() {
        return federalStateShortCode;
    }

    public void setFederalStateShortCode(String federalStateShortCode) {
        this.federalStateShortCode = federalStateShortCode;
    }

    public String getStateShortCode() {
        return stateShortCode;
    }

    public void setStateShortCode(String stateShortCode) {
        this.stateShortCode = stateShortCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", federalStateShortCode='" + federalStateShortCode + '\'' +
                ", stateShortCode='" + stateShortCode + '\'' +
                '}';
    }
}

