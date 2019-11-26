package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DocNumber")
public class DocNumber {

    private String kind;

    //1
    private OrganizationOnly OrganizationOnly;
    //1
    private RegNumber RegNumber;


    @XmlAttribute(name = "kind")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    @XmlElement(name = "OrganizationOnly")
    public com.example.demo.smdo.entity.OrganizationOnly getOrganizationOnly() {
        return OrganizationOnly;
    }

    public void setOrganizationOnly(com.example.demo.smdo.entity.OrganizationOnly organizationOnly) {
        OrganizationOnly = organizationOnly;
    }


    @XmlElement(name = "RegNumber")
    public com.example.demo.smdo.entity.RegNumber getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(com.example.demo.smdo.entity.RegNumber regNumber) {
        RegNumber = regNumber;
    }
}
