package com.rest.mysql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.mysql.model.OrderDetails;

public interface IOrderDetailService {
	List<OrderDetails> findAllById(int id);

}
