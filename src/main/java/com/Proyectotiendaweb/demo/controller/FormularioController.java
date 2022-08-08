package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.Formulario;
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

    @Autowired
    FormularioService formularioService;

    @GetMapping("/formulario/")
    public String personas(Model model) {

        var formularios = formularioService.getFormularios();
        model.addAttribute("formularios", formularios);
        return "/formulario/formulario";
    }

    @GetMapping("/formulario/nuevo")
    public String nuevoFormulario(Formulario formulario) {
        return "/formulario/modificar";
    }

    @PostMapping("/formulario/guardar")
    public String guardarFormulario(Formulario formulario) {
        formularioService.save(formulario);
        return "redirect:/formulario/";
    }

    @GetMapping("/formulario/modificar/{idPersona}")
    public String modificarFormulario(Formulario formulario, Model model) {
        formulario = formularioService.getFormulario(formulario);
        model.addAttribute("formulario", formulario);
        return "/formulario/modificar";
    }

    @GetMapping("/formulario/eliminar/{idPersona}")
    public String eliminarFormulario(Formulario formulario) {
        formularioService.delete(formulario);
        return "redirect:/formulario/modificar";
    }
}
