package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Executor")
public class Executor {

    private String responsible;
    private String task_specified;
    private String deadline;

    //1
    private Organization Organization;


    @XmlAttribute(name = "responsible")
    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }


    @XmlAttribute(name = "task_specified")
    public String getTask_specified() {
        return task_specified;
    }

    public void setTask_specified(String task_specified) {
        this.task_specified = task_specified;
    }


    @XmlAttribute(name = "deadline")
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }


    @XmlElement(name = "Organization")
    public com.example.demo.smdo.entity.Organization getOrganization() {
        return Organization;
    }

    public void setOrganization(com.example.demo.smdo.entity.Organization organization) {
        Organization = organization;
    }
}
