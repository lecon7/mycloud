package com.mycloud.provider.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author YanHao [yanhao@tiemavi.com]
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        LOGGER.info("Global exception - message:{}", ex.getMessage(), ex);
        return ResponseEntity.ok("ERROR");
    }
}
