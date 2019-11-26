package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Body")
public class Body {

    private Document Document;
    private TaskList TaskList;
    private AddDocuments AddDocuments;
    private Expansion Expansion;
    private Acknowledgement Acknowledgement;

    //1
    private Datadir Datadir;


    @XmlElement(name = "Document")
    public com.example.demo.smdo.entity.Document getDocument() {
        return Document;
    }

    public void setDocument(com.example.demo.smdo.entity.Document document) {
        Document = document;
    }


    @XmlElement(name = "TaskList")
    public com.example.demo.smdo.entity.TaskList getTaskList() {
        return TaskList;
    }

    public void setTaskList(com.example.demo.smdo.entity.TaskList taskList) {
        TaskList = taskList;
    }


    @XmlElement(name = "AddDocuments")
    public com.example.demo.smdo.entity.AddDocuments getAddDocuments() {
        return AddDocuments;
    }

    public void setAddDocuments(com.example.demo.smdo.entity.AddDocuments addDocuments) {
        AddDocuments = addDocuments;
    }


    @XmlElement(name = "Expansion")
    public com.example.demo.smdo.entity.Expansion getExpansion() {
        return Expansion;
    }

    public void setExpansion(com.example.demo.smdo.entity.Expansion expansion) {
        Expansion = expansion;
    }


    @XmlElement(name = "Acknowledgement")
    public com.example.demo.smdo.entity.Acknowledgement getAcknowledgement() {
        return Acknowledgement;
    }

    public void setAcknowledgement(com.example.demo.smdo.entity.Acknowledgement acknowledgement) {
        Acknowledgement = acknowledgement;
    }


    @XmlElement(name = "Datadir")
    public com.example.demo.smdo.entity.Datadir getDatadir() {
        return Datadir;
    }

    public void setDatadir(com.example.demo.smdo.entity.Datadir datadir) {
        Datadir = datadir;
    }
}
