package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "OfficialPerson")
public class OfficialPerson {

    //1
    private Name Name;

    //0-n
    private List<Official> Official;

    //0-n
    private List<Rank> Rank;

    //0-1
    private Address Address;

    //0-n
    private List<Econtact> Econtact;


    @XmlElement(name = "Name")
    public com.example.demo.smdo.entity.Name getName() {
        return Name;
    }

    public void setName(com.example.demo.smdo.entity.Name name) {
        Name = name;
    }


    @XmlElement(name = "Official")
    public List<com.example.demo.smdo.entity.Official> getOfficial() {
        return Official;
    }

    public void setOfficial(List<com.example.demo.smdo.entity.Official> official) {
        Official = official;
    }


    @XmlElement(name = "Rank")
    public List<com.example.demo.smdo.entity.Rank> getRank() {
        return Rank;
    }

    public void setRank(List<com.example.demo.smdo.entity.Rank> rank) {
        Rank = rank;
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
}
