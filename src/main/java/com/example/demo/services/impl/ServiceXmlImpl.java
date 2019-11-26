package com.example.demo.services.impl;

import com.example.demo.entity.Book;
import com.example.demo.services.ServiceXml;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ServiceXmlImpl implements ServiceXml {

    @Override
    public  Map<String, String> createXmlAndXsdFile(Object o) {
        try {
            Map<String, String> mapPathFiles = new HashMap<String, String>();
            Date date = new Date();
            String xmlPathFile = "C:\\newXML_"+ date.getTime() +".xml";
            JAXBContext context = JAXBContext.newInstance(o.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(o, new File(xmlPathFile));
            mapPathFiles.put("XML",xmlPathFile);

            context.generateSchema(new SchemaOutputResolver() {

                @Override
                public Result createOutput(String namespaceURI, String suggestedFileName)
                        throws IOException {
                    suggestedFileName = "C:\\newXSD_"+ date.getTime() +".xsd";
                    mapPathFiles.put("XSD",suggestedFileName);
                    File file = new File(suggestedFileName);
                    return new StreamResult(file);
                }
            });
            return mapPathFiles;
        } catch (JAXBException | IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean compareXmlXsd(String pathXml, String pathXsd) {
        try {
            File xml = new File(pathXml);
            File xsd = new File(pathXsd);

            if (!xml.exists()) {
                System.out.println("Не найден XML " + pathXml);
            }

            if (!xsd.exists()) {
                System.out.println("Не найден XSD " + pathXsd);
            }

            if (!xml.exists() || !xsd.exists()) {
                return false;
            }

            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
                    .newSchema(xsd)
                    .newValidator()
                    .validate(new StreamSource(xml));
            return true;
        } catch (SAXException | IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
