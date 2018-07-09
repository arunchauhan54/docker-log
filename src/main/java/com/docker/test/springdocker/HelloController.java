package com.docker.test.springdocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${logging.file}")
    String logFile;

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "user") String str) {
        logger.info("Hello Arun");
        return "HelloWorld !" + str + "  logFile:" + logFile;
    }
}
