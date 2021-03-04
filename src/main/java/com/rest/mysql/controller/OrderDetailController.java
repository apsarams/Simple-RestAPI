//Controller to handle data retrieval with order ID 
package com.rest.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.mysql.exceptions.ResourceNotFoundException;
import com.rest.mysql.model.OrderDetails;
import com.rest.mysql.service.IOrderDetailService;


@RestController
public class OrderDetailController{
	
	@Autowired
	IOrderDetailService orderDetails;
	
	//Get request with parameters id i.e., order number
	@RequestMapping("orders/{id}")
	public List<OrderDetails> filterByOrderId(@PathVariable("id") String orderId) {
		int id = Integer.parseInt(orderId);
		List<OrderDetails> details = orderDetails.findAllById(id);
		if(details.size()==0) {
			throw new ResourceNotFoundException("Resource not found");
		}
		return details;    
	}
}
