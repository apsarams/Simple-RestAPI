//To map some columns used in the query to Orders table
package com.rest.mysql.mapper;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderMapper {
	
   @Id
   @GeneratedValue
   @Column(name="ordernumber")
   private int orderNumber;
   
   @Column(name="status")
   private String status;
   
   @Column(name="orderdate")
   private LocalDate orderDate;
   
   
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
}
