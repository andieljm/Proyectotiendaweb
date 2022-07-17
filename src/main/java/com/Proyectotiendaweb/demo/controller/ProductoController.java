package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired ProductoService productoService; 
    
    @GetMapping("/productos/")
    public String usuarios(Model model) {
        
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        
        return "/producto/listado";
    }
    
}
