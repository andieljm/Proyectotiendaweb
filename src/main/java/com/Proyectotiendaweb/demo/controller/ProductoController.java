package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.Producto;
import com.Proyectotiendaweb.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lenovo
 */
@Controller
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/productos/")
    public String usuarios(Model model) {
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        return "/producto/listado";
    }

    @GetMapping("/producto/nuevo")
    public String nuevoProducto(Producto producto) {
        return "/producto/actualizarProductos";
    }

    @PostMapping("/producto/guardar")
    public String guardarProducto(Producto producto) {
        productoService.save(producto);
        return "redirect:/productos/";
    }

    @GetMapping("/producto/modificar/{idProducto}")
    public String modificarProducto(Producto producto, Model model) {
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        return "/producto/actualizarProductos";
    }

    @GetMapping("/producto/eliminar/{idProducto}")
    public String eliminarProducto(Producto producto) {
        productoService.delete(producto);
        return "redirect:/productos/";
    }

}
