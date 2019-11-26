package com.example.demo.smdo.entity;

import java.util.HashMap;
import java.util.Map;

public class VarsetElement {
    private String name;
    private String value;
    private Map<String, String> mapAttr = new HashMap<>();

    public VarsetElement(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<String, String> getMapAttr() {
        return mapAttr;
    }

    public void setMapAttr(Map<String, String> mapAttr) {
        this.mapAttr = mapAttr;
    }
}
