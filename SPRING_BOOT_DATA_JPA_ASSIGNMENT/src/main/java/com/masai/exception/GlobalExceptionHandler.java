package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorDetails> ProExpHandler(ProductException pe, WebRequest req) {
		
        ErrorDetails err=new ErrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMsg(pe.getMessage());
		err.setDesc(req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> Otherhandler(Exception pe,WebRequest req){
		
		ErrorDetails err=new ErrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMsg(pe.getMessage());
		err.setDesc(req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_GATEWAY);
		
	}
}
