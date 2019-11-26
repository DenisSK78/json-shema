package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "OrganizationWithSign")
public class OrganizationWithSign {

    private String organization_string;
    private String fullname;
    private String shortname;
    private String ownership;

    //0-1
    private Address Address;

    //0-n
    private List<Econtact> Econtact;

    //Author 1-n
    //Validator 0-n
    //AuthorOrganization 1
    private List<OfficialPersonWithSign> OfficialPersonWithSign;

    @XmlAttribute(name = "organization_string")
    public String getOrganization_string() {
        return organization_string;
    }

    public void setOrganization_string(String organization_string) {
        this.organization_string = organization_string;
    }


    @XmlAttribute(name = "fullname")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    @XmlAttribute(name = "shortname")
    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }


    @XmlAttribute(name = "ownership")
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }


    @XmlElement(name = "Address")
    public com.example.demo.smdo.entity.Address getAddress() {
        return Address;
    }

    public void setAddress(com.example.demo.smdo.entity.Address address) {
        Address = address;
    }


    @XmlElement(name = "Econtact")
    public List<com.example.demo.smdo.entity.Econtact> getEcontact() {
        return Econtact;
    }

    public void setEcontact(List<com.example.demo.smdo.entity.Econtact> econtact) {
        Econtact = econtact;
    }


    @XmlElement(name = "OfficialPersonWithSign")
    public List<com.example.demo.smdo.entity.OfficialPersonWithSign> getOfficialPersonWithSign() {
        return OfficialPersonWithSign;
    }

    public void setOfficialPersonWithSign(List<com.example.demo.smdo.entity.OfficialPersonWithSign> officialPersonWithSign) {
        OfficialPersonWithSign = officialPersonWithSign;
    }
}
