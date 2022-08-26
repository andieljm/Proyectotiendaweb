package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.MetodoPago;
import com.Proyectotiendaweb.demo.service.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Warre
 */
@Controller
public class MetodoPagoController {
    
    @Autowired
    MetodoPagoService metodoPagoService;
    
    
    @GetMapping("/metodoPago/confirmacion")
    public String listado(Model model) {
        var metodoPagos = metodoPagoService.getMetodoPagos();
        model.addAttribute("metodoPagos", metodoPagos);
        return "/metodoPago/listado";
    }
    
    @GetMapping("/tarjeta/nuevo")
    public String nuevoMetodoPago(MetodoPago metodoPago) {
        return "/tarjeta/modificar";
    }
    
    @PostMapping("/metodoPago/guardar")
    public String guardarMetodoPago(MetodoPago metodoPago) {
        metodoPagoService.save(metodoPago);
        return "redirect:/tarjeta/listado"; 
    }
}
