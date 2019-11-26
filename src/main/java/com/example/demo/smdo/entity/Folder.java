package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Folder")
public class Folder {

    private String contents;
    private String add_type;

    //0-n
    private List<DocTransfer> DocTransfer;

    //0-n
    private List<Note> Note;

    //0-n
    private List<Referred> Referred;


    @XmlAttribute(name = "contents")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    @XmlAttribute(name = "add_type")
    public String getAdd_type() {
        return add_type;
    }

    public void setAdd_type(String add_type) {
        this.add_type = add_type;
    }


    @XmlElement(name = "DocTransfer")
    public List<com.example.demo.smdo.entity.DocTransfer> getDocTransfer() {
        return DocTransfer;
    }

    public void setDocTransfer(List<com.example.demo.smdo.entity.DocTransfer> docTransfer) {
        DocTransfer = docTransfer;
    }


    @XmlElement(name = "Note")
    public List<com.example.demo.smdo.entity.Note> getNote() {
        return Note;
    }

    public void setNote(List<com.example.demo.smdo.entity.Note> note) {
        Note = note;
    }


    @XmlElement(name = "Referred")
    public List<com.example.demo.smdo.entity.Referred> getReferred() {
        return Referred;
    }

    public void setReferred(List<com.example.demo.smdo.entity.Referred> referred) {
        Referred = referred;
    }
}
