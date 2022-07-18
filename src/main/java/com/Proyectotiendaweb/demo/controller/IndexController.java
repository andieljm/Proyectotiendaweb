package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    //private ClienteDao clienteDao;
    private ProductoService productoService; // En caso de que se use @Service

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");

        var producto = productoService.getProductos();

        model.addAttribute("producto", producto);

        return "index";
    }
}