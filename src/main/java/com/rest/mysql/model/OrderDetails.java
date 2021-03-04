//Model for ordersDetails table of classicmodels database. 
package com.rest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
	
@Entity
@IdClass(CompOrderDetailsKey.class)
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ordernumber;
	
	@Id
	private String productcode;
	
	@Column(name="quantityordered")
	private int quantityordered;
	
	@Column(name="priceeach")
	private float priceeach;
	
	@Column(name="orderlinenumber")
	private int orderlinenumber;

	public int getOrdernumber() {
		return ordernumber;
	}
	//Getters and Setters
	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public int getQuantityordered() {
		return quantityordered;
	}

	public void setQuantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}

	public float getPriceeach() {
		return priceeach;
	}

	public void setPriceeach(float priceeach) {
		this.priceeach = priceeach;
	}

	public int getOrderlinenumber() {
		return orderlinenumber;
	}

	public void setOrderlinenumber(int orderlinenumber) {
		this.orderlinenumber = orderlinenumber;
	}
	
}

