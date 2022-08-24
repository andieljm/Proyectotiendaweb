package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.CarritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import com.Proyectotiendaweb.demo.service.CarritoDetalleService;
import com.Proyectotiendaweb.demo.service.ProductoService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarritoController {

    @Autowired
    private CarritoDetalleService carritoDetalleService; //sirve para meter los nuevos articulos 
    @Autowired
    private ProductoService productoService;

    @GetMapping("/carrito/agregar/{idProducto}")
    public String agregar(Producto producto, HttpSession session) { //con la seccion nos ahorramos pasos, dondela definimos anteriormente
        
        Long idCarrito = (Long) session.getAttribute("idCarrito"); //este lo hicimos en el index controller 
        producto = productoService.getProducto(producto); //traemos todo el detalle 
        
        //Verificar si ya existe Para solo poner existencias, sumar en la cantidad y no agregar otro articulo nuevo        
        CarritoDetalle carritoDetalle = carritoDetalleService.getCarritoDetalle(idCarrito, producto);
        
        if (carritoDetalle != null) { //al ver que es nulo el agrega todo, porque es la primera vez que se agrega el articulo, cuando no tiene el ID agrega los demas elementos 
            carritoDetalle.setCantidad(carritoDetalle.getCantidad() + 1); //quitar en favoritos 
        } else {
            carritoDetalle = new CarritoDetalle(idCarrito, producto.getPrecio(), 1, producto);
        }
        carritoDetalleService.save(carritoDetalle);
        
        return "redirect:/";
    }

    @GetMapping("/carrito/listado")
    public String listado(Model model, Producto producto, HttpSession session) {
        
        Long idCarrito = (Long) session.getAttribute("idCarrito");
        List<CarritoDetalle> carritoDetalles = carritoDetalleService.getCarritoDetalles(idCarrito);
        //int cantidadArticulosCarrito = carritoDetalles.size(); //se puede usar segun se necesite, no es ta´n importante 
        
        var montoTotal = 0;
        //var montoImpuestos = 0.0;
        for (var c : carritoDetalles) {
            montoTotal += c.getCantidad() * c.getPrecio();
        }
        //montoImpuestos = montoTotal * 0.15;
        model.addAttribute("carritoDetalles", carritoDetalles);
        //model.addAttribute("cantidadProductosCarrito", cantidadProductosCarrito);
        //model.addAttribute("montoImpuestos", montoImpuestos);
        model.addAttribute("montoTotal", montoTotal);
        return "/carrito/listado";
    }
}

