package com.example.demo.smdo.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Map;

@XmlRootElement(name = "Varset")
public class Varset {
    //??
    //Непонятно что тут делать
    //Но скорее всего структура будет такой
    //Map<String,Map<String,String>>

    private List<VarsetElement> list;

    public List<VarsetElement> getList() {
        return list;
    }

    public void setList(List<VarsetElement> list) {
        this.list = list;
    }
}
