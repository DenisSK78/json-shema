package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Sender")
public class Sender {

    private String id;
    private String name;
    private String sys_id;
    private String system;
    private String system_details;


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
}
