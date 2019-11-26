package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "AddDocuments")
public class AddDocuments {

    //??? описания полей нет

    //0-n 1-n ???
    private List<Folder> Folder;

    @XmlElement(name="Folder")
    public List<com.example.demo.smdo.entity.Folder> getFolder() {
        return Folder;
    }

    public void setFolder(List<com.example.demo.smdo.entity.Folder> folder) {
        Folder = folder;
    }
}
