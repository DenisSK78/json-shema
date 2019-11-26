package com.example.demo.services;

import java.util.Map;

public interface ServiceXml {
    Map<String, String> createXmlAndXsdFile(Object o);

    Boolean compareXmlXsd(String pathXml, String pathXsd);
}
