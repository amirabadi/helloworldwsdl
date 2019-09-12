package com.co.action;

import com.co.HelloWorldService;
import com.co.HelloWorldServiceImp;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

@SessionScoped
@Named

public class TestWeb implements Serializable {

    public void begin() throws MalformedURLException {
        URL url = new URL("http://localhost:8080/mytestws/HelloWorldServiceImp?wsdl");

        QName qname = new QName("http://co.com/", "HelloWorldServiceImpService");

        Service service = Service.create(url, qname);

        HelloWorldService hello = service.getPort(HelloWorldService.class);

        System.out.println(hello.sayHelloWorld("hossein;)"));
    }
}
