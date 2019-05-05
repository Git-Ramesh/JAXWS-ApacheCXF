package com.radiantsage.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "Product",
		 namespace = "http://model.radiantsage.com", 
		 propOrder = { "id", "name", "price" })
public class Product implements Serializable {
	private static final long serialVersionUID = -934187947191528302L;
	
	@XmlElement(required = true, nillable = false)
	private long id;
	@XmlElement(required = true, nillable = false)
	private String name;
	@XmlElement(required = true, nillable = false)
	private float price;

	public Product() {
		/* No Operations */
	}

	public Product(long id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
