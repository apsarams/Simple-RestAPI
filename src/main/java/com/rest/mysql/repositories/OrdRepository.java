package com.rest.mysql.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rest.mysql.mapper.OrderMapper;
import com.rest.mysql.model.Orders;

@Repository
public interface OrdRepository extends JpaRepository<OrderMapper, Long>{

	@Query(value="select ordernumber,orderdate, status from Orders where orderdate between :startDate and :endDate", nativeQuery = true)
	List<OrderMapper> findOrderBetweenDates(@Param("startDate")LocalDate startDate, @Param("endDate")LocalDate endDate);
}
