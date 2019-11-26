package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Writer")
public class Writer {

    //0-1
    private Organization Organization;

    //0-1
    private PrivatePerson PrivatePerson;


    @XmlElement(name = "Organization")
    public com.example.demo.smdo.entity.Organization getOrganization() {
        return Organization;
    }

    public void setOrganization(com.example.demo.smdo.entity.Organization organization) {
        Organization = organization;
    }


    @XmlElement(name = "PrivatePerson")
    public com.example.demo.smdo.entity.PrivatePerson getPrivatePerson() {
        return PrivatePerson;
    }

    public void setPrivatePerson(com.example.demo.smdo.entity.PrivatePerson privatePerson) {
        PrivatePerson = privatePerson;
    }
}
