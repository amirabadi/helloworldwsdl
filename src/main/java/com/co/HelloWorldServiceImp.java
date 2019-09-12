package com.co;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.co.HelloWorldService")
public class HelloWorldServiceImp
        implements HelloWorldService {

    public String sayHelloWorld( String name) {
        return "Hello World ! My name is " + name + ".";
    }

}
