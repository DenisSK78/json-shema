package com.example.demo.services.impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.services.ServiceUser;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

@Service
public class ServiceUserImpl implements ServiceUser {

    @Override
    public void createXmlFile(Object object) {
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(object, new File("C:\\user1.xml"));
            System.out.println("user1.xml Save");

            context.generateSchema(new SchemaOutputResolver() {

                @Override
                public Result createOutput(String namespaceURI, String suggestedFileName)
                        throws IOException {
                    suggestedFileName = "C:\\user.xsd";
                    File file = new File(suggestedFileName);
                    return new StreamResult(file);
                }

            });

        } catch (JAXBException | IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void checkXsdSchema() {

    }
}
