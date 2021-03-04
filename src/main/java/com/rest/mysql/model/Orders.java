//Model for orders table of classicmodels database
package com.rest.mysql.model;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordernumber;
	
	@Column(name="orderdate")
	private LocalDate orderDate;

	@Column(name="requireddate")
	private LocalDate requiredDate;
	
	@Column(name="shippeddate")
	private LocalDate shippedDate;
	
	@Column(name="customernumber")
	private int customerNumber;
	
	@Column(name="status")
	private String status;
	
	@Column(name="comments")
	private String comments;
	
	//Getters and Setters
	public Long getOrderNumber() {
		return this.ordernumber;
	}
	public LocalDate getOrderDate() {
		return this.orderDate;
	}
	public LocalDate getRequiredDate() {
		return this.requiredDate;
	}
	public LocalDate getShippedDate() {
		return this.shippedDate;
	}
	public int getCustomerNumber() {
		return this.customerNumber;
	}
	public String getStatus() {
		return this.status;
	}
	public String getComments() {
		return this.comments;
	}
	public void setOrderNumber(Long order) {
		this.ordernumber = order;
	}
	public void setOrderDate(LocalDate oDate) {
		this.orderDate = oDate;
	}

	public void setRequiredDate(LocalDate reqDate) {
		this.requiredDate = reqDate;
	}
	public void setShippedDate(LocalDate shipDate) {
		this.shippedDate = shipDate;
	}
	public void setShippedDate(int cusNum) {
		this.customerNumber = cusNum;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
