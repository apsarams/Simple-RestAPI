package com.rest.mysql.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rest.mysql.model.OrderDetails;

@Repository
public interface OrdDetRepository extends JpaRepository<OrderDetails,Integer>{
	
    @Query(value = "select o from OrderDetails o where o.ordernumber = :id")
	List<OrderDetails> findByOrderNumber(@Param("id")int id);
}
