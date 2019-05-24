package com.logging.loggingmdc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class LoggingService {
    public String welcome(){
        log.info("welcome service is called" + new Date());
        return "Service is running";
    }
}
