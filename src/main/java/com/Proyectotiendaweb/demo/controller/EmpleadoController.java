/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Lenovo
 */
@Controller
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleados/")
    public String usuarios(Model model) {

        var empleados = empleadoService.getEmpleados();
        model.addAttribute("empleados", empleados);
        return "/empleado/listado";
    }

}
