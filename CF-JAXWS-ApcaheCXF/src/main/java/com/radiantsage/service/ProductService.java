package com.radiantsage.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2019-05-05T23:31:18.352+05:30
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://service.radiantsage.com", name = "ProductService")
@XmlSeeAlso({com.radiantsage.model.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProductService {

    @WebMethod(action = "http://service.radiantsage.com/registerProduct")
    @WebResult(name = "ProductSoapOut", targetNamespace = "http://model.radiantsage.com", partName = "parameters")
    public com.radiantsage.model.Product registerProduct(
        @WebParam(partName = "product", name = "ProductSoapIn", targetNamespace = "http://model.radiantsage.com")
        com.radiantsage.model.Product product
    );
}