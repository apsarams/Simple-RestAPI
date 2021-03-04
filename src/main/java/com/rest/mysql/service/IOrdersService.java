package com.rest.mysql.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.mysql.mapper.OrderMapper;

public interface IOrdersService {
   List<OrderMapper> findOrderBetweenDates(LocalDate startDate,LocalDate endDate);
}
