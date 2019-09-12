package com.co;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorldService {

    @WebMethod
    String sayHelloWorld(@WebParam(name = "name")String name);
}
