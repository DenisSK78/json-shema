package com.example.demo.services;

import com.example.demo.entity.Book;

public interface ServiceBook {

    void createXmlFile(Book book);
    Boolean checkXsdSchema(String pathXml, String pathXsd);

}
