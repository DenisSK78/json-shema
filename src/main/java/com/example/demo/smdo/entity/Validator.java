package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Validator")
public class Validator {

    private String attestation;

    //0-1
    private OrganizationWithSign OrganizationWithSign;

    //0-1
    private PrivatePersonWithSign PrivatePersonWithSign;

    //0-1
    private DocNumber DocNumber;


    @XmlAttribute(name = "attestation")
    public String getAttestation() {
        return attestation;
    }

    public void setAttestation(String attestation) {
        this.attestation = attestation;
    }


    @XmlElement(name = "OrganizationWithSign")
    public com.example.demo.smdo.entity.OrganizationWithSign getOrganizationWithSign() {
        return OrganizationWithSign;
    }

    public void setOrganizationWithSign(com.example.demo.smdo.entity.OrganizationWithSign organizationWithSign) {
        OrganizationWithSign = organizationWithSign;
    }


    @XmlElement(name = "PrivatePersonWithSign")
    public com.example.demo.smdo.entity.PrivatePersonWithSign getPrivatePersonWithSign() {
        return PrivatePersonWithSign;
    }

    public void setPrivatePersonWithSign(com.example.demo.smdo.entity.PrivatePersonWithSign privatePersonWithSign) {
        PrivatePersonWithSign = privatePersonWithSign;
    }


    @XmlElement(name = "DocNumber")
    public com.example.demo.smdo.entity.DocNumber getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(com.example.demo.smdo.entity.DocNumber docNumber) {
        DocNumber = docNumber;
    }
}
