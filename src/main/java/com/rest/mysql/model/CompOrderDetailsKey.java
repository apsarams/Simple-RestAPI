//Model to handle composite keys in orderDetails table. 
package com.rest.mysql.model;

import java.io.Serializable;

public class CompOrderDetailsKey implements Serializable{
	//Primary key #1
	private int ordernumber;
	//Primary key #2
	private String productcode;

	//Getters and setters
	public int getOrderNumber() {
		return ordernumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.ordernumber = orderNumber;
	}
	public String getProductCode() {
		return productcode;
	}
	public void setProductCode(String productCode) {
		this.productcode = productCode;
	}

}
