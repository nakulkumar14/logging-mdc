package com.logging.loggingmdc.controller;

import com.logging.loggingmdc.service.LoggingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoggingController {

    @Autowired
    private LoggingService loggingService;

    @GetMapping("/welcome")
    public String welcome(){
        log.info("[welcome] Service is running.");
        return loggingService.welcome();
    }
}
