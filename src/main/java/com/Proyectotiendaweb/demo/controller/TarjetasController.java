package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.Tarjetas;
import com.Proyectotiendaweb.demo.service.TarjetasService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Warre
 */
@Controller
public class TarjetasController {

    @Autowired
    TarjetasService tarjetasService;

    @GetMapping("/perfil/metodoPago")
    public String metodoPago(Model model) {
        var tarjetass = tarjetasService.getTarjetass();
        model.addAttribute("tarjetass", tarjetass);
        return "/metodoPago/MetodoPago";
    }
    
    

    @GetMapping("/perfil/metodoPago/nuevo")
    public String nuevoTarjeta(Tarjetas Tarjetas) {
        return "/perfil/metodoPago/modificar";
    }
}
