package com.radiantsage.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.radiantsage.model.Product;

@WebService(name = "ProductService", targetNamespace = "http://service.radiantsage.com")
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public interface ProductService {

	@WebMethod(action = "http://service.radiantsage.com/registerProduct")
	@WebResult(name = "ProductSoapOut", targetNamespace = "http://model.radiantsage.com", partName = "parameters")
	public Product registerProduct(
			@WebParam(name = "ProductSoapIn", targetNamespace = "http://model.radiantsage.com", partName = "product") Product product);

}
