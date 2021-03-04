//Controller to handle data retrieval with filter by date functionality

package com.rest.mysql.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.rest.mysql.exceptions.BadRequestException;
import com.rest.mysql.mapper.OrderMapper;
import com.rest.mysql.model.OrderDetails;
import com.rest.mysql.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.mysql.service.IOrderDetailService;
import com.rest.mysql.service.IOrdersService;

@RestController
public class OrderController
{	
	@Autowired
	IOrdersService order;
	
	//Get request with parameters startDate and endDate
	@RequestMapping(value="orders")
	public List<OrderMapper> filterByDate(@DateTimeFormat (iso = DateTimeFormat.ISO.DATE) @RequestParam("startDate") LocalDate startDate, 
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("endDate") LocalDate endDate) throws IOException
	{   
	    List<OrderMapper> orders = order.findOrderBetweenDates(startDate, endDate);
	    if(orders.size() == 0) {
	    	throw new BadRequestException("Please provide Valid Dates in format yyyy-mm-dd or Resource not found");
	    }
	    
	    return orders;
	}
}
