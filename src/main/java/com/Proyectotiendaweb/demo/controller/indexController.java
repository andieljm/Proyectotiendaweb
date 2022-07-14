package com.Proyectotiendaweb.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class indexController {
    
    @GetMapping("/")
    public String inicio(){
    
        log.info("Usando arquitectura MVC");
        return "index";
    }
    
    @GetMapping("usuario")
    public String usuarios(){
    
    return "usuario";
    }
    
}
