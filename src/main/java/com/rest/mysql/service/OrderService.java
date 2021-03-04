//Service that implements the filter by date functionality
package com.rest.mysql.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.mysql.mapper.OrderMapper;
import com.rest.mysql.repositories.OrdRepository;

@Service
public class OrderService implements IOrdersService{
	
	@Autowired
	private OrdRepository rep;
	
	@Override
	public List<OrderMapper> findOrderBetweenDates(LocalDate startDate, LocalDate endDate) {
		List<OrderMapper> orders = (List<OrderMapper>)rep.findOrderBetweenDates(startDate, endDate);
		return orders;
	}
   
}
