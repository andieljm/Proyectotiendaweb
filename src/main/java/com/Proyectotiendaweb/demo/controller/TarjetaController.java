package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.MetodoPago;
import com.Proyectotiendaweb.demo.domain.TarjetaDetalle;
import com.Proyectotiendaweb.demo.service.MetodoPagoService;
import com.Proyectotiendaweb.demo.service.TarjetaDetalleService;
import java.util.List;
import javax.servlet.http.HttpSession;
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
public class TarjetaController {

    @Autowired
    TarjetaDetalleService tarjetaDetalleService;
    
    @Autowired
    MetodoPagoService metodoPagoService;
    
    @GetMapping("/tarjeta/agregar/{idMetodoPago}")
    public String agregarTarjeta(MetodoPago metodoPago, HttpSession session) {
        
        Long idTarjeta = (Long) session.getAttribute("idTarjeta");
        metodoPago = metodoPagoService.getMetodoPago(metodoPago);
        
        TarjetaDetalle tarjetaDetalle = tarjetaDetalleService.getTarjetaDetalle(idTarjeta, metodoPago);
        
        if (tarjetaDetalle != null) {
            
        } else {
            tarjetaDetalle = new TarjetaDetalle(idTarjeta, metodoPago.getNumeroCuenta(), metodoPago.getTipo(), metodoPago.getCodSeguridad(), metodoPago);
        }
        tarjetaDetalleService.save(tarjetaDetalle);
        return "/tarjeta/modificar";
        
    }

    @GetMapping("/tarjeta/listado")
    public String listado(Model model, HttpSession session) {

        Long idTarjeta = (Long) session.getAttribute("idTarjeta");
        
        List<TarjetaDetalle> tarjetaDetalles = tarjetaDetalleService.getTarjetaDetalles(idTarjeta);
        
        //TarjetaDetalle tarjetaDetalles = tarjetaDetalleService.getTarjetaDetalles(idTarjeta);

        model.addAttribute("tarjetaDetalles", tarjetaDetalles);
        return "/tarjeta/listado";
    }
}
