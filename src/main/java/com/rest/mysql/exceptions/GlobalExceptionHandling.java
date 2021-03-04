package com.rest.mysql.exceptions;

import java.time.LocalDate;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class GlobalExceptionHandling extends ResponseEntityExceptionHandler{
   
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> resourceNotFound(ResourceNotFoundException ex){
		ErrorResponse response = new ErrorResponse();
		response.setErrorCode("Not Found");
		response.setErrorMessage(ex.getMessage());
		response.setTimeStamp(LocalDate.now());
		
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ErrorResponse> badRequest(BadRequestException ex){
		ErrorResponse response = new ErrorResponse();
		response.setErrorCode("Check Date or resource not Found");
		response.setErrorMessage(ex.getMessage());
		response.setTimeStamp(LocalDate.now());
		
		return new ResponseEntity<ErrorResponse>(response,HttpStatus.BAD_REQUEST);
	}
}
