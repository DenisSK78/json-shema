package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TaskList")
public class TaskList {

    //1-n
    private List<Task> Task;


    @XmlElement(name = "Task")
    public List<com.example.demo.smdo.entity.Task> getTask() {
        return Task;
    }

    public void setTask(List<com.example.demo.smdo.entity.Task> task) {
        Task = task;
    }
}
