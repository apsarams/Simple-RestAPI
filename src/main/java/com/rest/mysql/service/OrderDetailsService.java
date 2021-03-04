//Service that implements fetching all order details
package com.rest.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.mysql.model.OrderDetails;
import com.rest.mysql.repositories.OrdDetRepository;


@Service
public class OrderDetailsService implements IOrderDetailService{
   
    @Autowired
    private OrdDetRepository rep;

	@Override
	public List<OrderDetails> findAllById(int id) {
		List<OrderDetails> orderDetails = (List<OrderDetails>)rep.findByOrderNumber(id);
		return orderDetails;
	}
}
