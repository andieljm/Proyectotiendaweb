package com.Proyectotiendaweb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lenovo
 */
@Controller
public class ProductoController {
    
    @GetMapping("/productos/")
    public String usuarios() {
        return "/producto/listado";
    }
    
}
