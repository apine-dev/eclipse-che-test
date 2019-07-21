package com.aepm.springboottest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
//@RequestMapping("/") //Aqui definimos un prefijo para las requests que va a manejar este controlador
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/saludo")
    public String index(@RequestParam (name="name", required=false, defaultValue="World") String name, Model model) {
        logger.debug("Valor de 'name' enviado al servidor es: " + name);
        model.addAttribute("valor", name);
        return "value";
    }

}
