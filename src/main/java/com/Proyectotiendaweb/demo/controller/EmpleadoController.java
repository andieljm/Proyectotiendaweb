/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.Empleado;
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

    @GetMapping("/empleado/")
    public String usuarios(Model model) {
        var empleados = empleadoService.getEmpleados();
        model.addAttribute("empleados", empleados);
        return "/empleado/listado";
    }
    
    
     @GetMapping("/empleado/nuevo")
    public String nuevoEmpleado(Empleado empleado) {
        return "/empleado/modificar";
    }

    @PostMapping("/empleado/guardar")
    public String guardarEmpleado(Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleado/";
    }

    @GetMapping("/empleado/modificar/{idEmpleado}")
    public String modificarEmpleado(Empleado empleado, Model model) {
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "/empleado/modificar";
    }

    @GetMapping("/empleado/eliminar/{idEmpleado}")
    public String eliminarEmpleado(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/empleado/";
    }

}
