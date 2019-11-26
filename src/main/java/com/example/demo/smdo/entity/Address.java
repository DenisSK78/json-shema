package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Address")
public class Address {

    private String street;
    private String house;
    private String building;
    private String flat;
    private String settlement;
    private String district;
    private String region;
    private String country;
    private String postcode;
    private String postbox;
    private String nontypical;

    private String value;

    @XmlAttribute(name="street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    @XmlAttribute(name="house")
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }


    @XmlAttribute(name="building")
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }


    @XmlAttribute(name="flat")
    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }


    @XmlAttribute(name="settlement")
    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }


    @XmlAttribute(name="district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    @XmlAttribute(name="region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    @XmlAttribute(name="country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @XmlAttribute(name="postсode")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    @XmlAttribute(name="postbox")
    public String getPostbox() {
        return postbox;
    }

    public void setPostbox(String postbox) {
        this.postbox = postbox;
    }


    @XmlAttribute(name="nontypical")
    public String getNontypical() {
        return nontypical;
    }

    public void setNontypical(String nontypical) {
        this.nontypical = nontypical;
    }


    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
