package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Receiver")
public class Receiver {

    private String id;
    private String name;
    private String sys_id;
    private String system;
    private String system_details;

    //0-1
    private Organization Organization;

    //0-1
    private PrivatePerson PrivatePerson;

    //0-n
    private List<Referred> Referred;


    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @XmlAttribute(name = "sys_id")
    public String getSys_id() {
        return sys_id;
    }

    public void setSys_id(String sys_id) {
        this.sys_id = sys_id;
    }


    @XmlAttribute(name = "system")
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }


    @XmlAttribute(name = "system_details")
    public String getSystem_details() {
        return system_details;
    }

    public void setSystem_details(String system_details) {
        this.system_details = system_details;
    }


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


    @XmlElement(name = "Referred")
    public List<com.example.demo.smdo.entity.Referred> getReferred() {
        return Referred;
    }

    public void setReferred(List<com.example.demo.smdo.entity.Referred> referred) {
        Referred = referred;
    }
}
