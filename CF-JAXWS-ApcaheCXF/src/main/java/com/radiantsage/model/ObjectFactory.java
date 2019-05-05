
package com.radiantsage.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.radiantsage.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductSoapIn_QNAME = new QName("http://model.radiantsage.com", "ProductSoapIn");
    private final static QName _ProductSoapOut_QNAME = new QName("http://model.radiantsage.com", "ProductSoapOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.radiantsage.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.radiantsage.com", name = "ProductSoapIn")
    public JAXBElement<Product> createProductSoapIn(Product value) {
        return new JAXBElement<Product>(_ProductSoapIn_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.radiantsage.com", name = "ProductSoapOut")
    public JAXBElement<Product> createProductSoapOut(Product value) {
        return new JAXBElement<Product>(_ProductSoapOut_QNAME, Product.class, null, value);
    }

}
