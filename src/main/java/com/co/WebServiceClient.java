/*
package com.co;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;


public class WebServiceClient  {
    private String serviceUrl;

    public WebServiceClient(String serviceUrl) {
        super();
        this.serviceUrl = serviceUrl;
    }

    public EmployeeInfoWrapper employeeLookup(EmployeeIdWrapper employeeIdList) throws UserDefinedException {

        try {
            URL url = new URL(serviceUrl);
            HelloWorldServiceImp empService = new HelloWorldServiceImp(url);

            EmployeeLookupService eSrc = empService.getEmployeeLookupServiceImplWSDLPort();

            return eSrc.employeeLookup(employeeIdList);
        } catch (MalformedURLException e) {
            UserDefinedFault fault = new UserDefinedFault();
            fault.setMessage(e.getMessage());
            throw new UserDefinedException("caught MalformedURLException. ", fault);
        }

    }
}
*/
