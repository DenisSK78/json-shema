package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Task")
public class Task {

    private String idnumber;
    private String task_reg;
    private String task_copy;
    private String kind;
    private String task_text;
    private String deadline;

    //1
    private TaskNumber TaskNumber;

    //1
    private Confident Confident;

    //1-n *0-n ????????
    private List<Referred> Referred;

    //1-n
    private List<AuthorOrganization> AuthorOrganization;

    //0-n
    private List<DocTransfer> DocTransfer;

    //0-n
    private List<Executor> Executor;


    @XmlAttribute(name = "idnumber")
    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }


    @XmlAttribute(name = "task_reg")
    public String getTask_reg() {
        return task_reg;
    }

    public void setTask_reg(String task_reg) {
        this.task_reg = task_reg;
    }


    @XmlAttribute(name = "task_copy")
    public String getTask_copy() {
        return task_copy;
    }

    public void setTask_copy(String task_copy) {
        this.task_copy = task_copy;
    }


    @XmlAttribute(name = "kind")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    @XmlAttribute(name = "task_text")
    public String getTask_text() {
        return task_text;
    }

    public void setTask_text(String task_text) {
        this.task_text = task_text;
    }


    @XmlAttribute(name = "deadline")
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }


    @XmlElement(name = "TaskNumber")
    public com.example.demo.smdo.entity.TaskNumber getTaskNumber() {
        return TaskNumber;
    }

    public void setTaskNumber(com.example.demo.smdo.entity.TaskNumber taskNumber) {
        TaskNumber = taskNumber;
    }


    @XmlElement(name = "Confident")
    public com.example.demo.smdo.entity.Confident getConfident() {
        return Confident;
    }

    public void setConfident(com.example.demo.smdo.entity.Confident confident) {
        Confident = confident;
    }


    @XmlElement(name = "Referred")
    public List<com.example.demo.smdo.entity.Referred> getReferred() {
        return Referred;
    }

    public void setReferred(List<com.example.demo.smdo.entity.Referred> referred) {
        Referred = referred;
    }


    @XmlElement(name = "AuthorOrganization")
    public List<com.example.demo.smdo.entity.AuthorOrganization> getAuthorOrganization() {
        return AuthorOrganization;
    }

    public void setAuthorOrganization(List<com.example.demo.smdo.entity.AuthorOrganization> authorOrganization) {
        AuthorOrganization = authorOrganization;
    }


    @XmlElement(name = "DocTransfer")
    public List<com.example.demo.smdo.entity.DocTransfer> getDocTransfer() {
        return DocTransfer;
    }

    public void setDocTransfer(List<com.example.demo.smdo.entity.DocTransfer> docTransfer) {
        DocTransfer = docTransfer;
    }


    @XmlElement(name = "Executor")
    public List<com.example.demo.smdo.entity.Executor> getExecutor() {
        return Executor;
    }

    public void setExecutor(List<com.example.demo.smdo.entity.Executor> executor) {
        Executor = executor;
    }
}
