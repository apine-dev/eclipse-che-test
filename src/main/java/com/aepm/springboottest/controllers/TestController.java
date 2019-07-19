package com.aepm.springboottest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello-world")
    public ResponseEntity<String> get() {
        logger.info("Entro en el GET /api/prueba/hello-world");
        return ResponseEntity.ok("Hola Mundo!");
    }

}
