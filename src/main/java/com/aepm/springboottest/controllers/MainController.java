package com.aepm.springboottest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String index() {
        logger.info("Entro en el GET del main");
        return "Prueba!!!!!";
    }

}
