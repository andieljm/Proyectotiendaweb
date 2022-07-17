
package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Warre
 */
@Controller
public class FormularioController {
    
    @Autowired FormularioService formularioService;
    
    @GetMapping("/formulario/")
    public String personas(Model model) {
        
        var formularios = formularioService.getFormularios();
        model.addAttribute("formularios", formularios);
        return "/formulario/formulario";
    }
    
}
