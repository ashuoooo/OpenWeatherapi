package com.weather.monitoring.weather_monitoring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex){
    	return new ResponseEntity<>("Error occured:"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}