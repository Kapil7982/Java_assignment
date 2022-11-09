package com.evaluationquesiton2.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(AccountException.class)
	public ResponseEntity<ErrorDetails> EmpException(AccountException ee,WebRequest req) {
		 ErrorDetails err=new ErrorDetails();
		 
		 err.setTime(LocalDateTime.now());
		 err.setMsg(ee.getMessage());
		 err.setDesc(req.getDescription(false));
		 
		 return new ResponseEntity<>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(InstantiationException.class)
	public ResponseEntity<ErrorDetails> EmpException(InsufficientBalanceException ee,WebRequest req) {
		 ErrorDetails err=new ErrorDetails();
		 
		 err.setTime(LocalDateTime.now());
		 err.setMsg(ee.getMessage());
		 err.setDesc(req.getDescription(false));
		 
		 return new ResponseEntity<>(err,HttpStatus.BAD_GATEWAY);
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> EmpException(Exception ee,WebRequest req) {
		 ErrorDetails err=new ErrorDetails();
		 
		 err.setTime(LocalDateTime.now());
		 err.setMsg(ee.getMessage());
		 err.setDesc(req.getDescription(false));
		 
		 return new ResponseEntity<>(err,HttpStatus.BAD_GATEWAY);
	}

}
