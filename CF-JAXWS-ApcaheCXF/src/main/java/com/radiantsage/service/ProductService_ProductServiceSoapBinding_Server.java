
package com.radiantsage.service;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2019-05-05T23:31:18.408+05:30
 * Generated source version: 3.2.0
 * 
 */
 
public class ProductService_ProductServiceSoapBinding_Server{

    protected ProductService_ProductServiceSoapBinding_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new ProductServiceSoapBindingImpl();
        String address = "http://www.example.org/";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new ProductService_ProductServiceSoapBinding_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
