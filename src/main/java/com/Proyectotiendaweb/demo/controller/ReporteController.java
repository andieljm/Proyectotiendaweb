
package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.domain.Reporte;
import com.Proyectotiendaweb.demo.service.ReporteService;
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
public class ReporteController {
    
    @Autowired ReporteService reporteService;
    
    @GetMapping("/reporte/listado")
    public String metodoPago(Model model) {
        
        var reportes = reporteService.getReportes();
        model.addAttribute("reportes", reportes);
        return "/reporte/listado";
    }
    
    @GetMapping("/reporte/nuevo")
    public String nuevoReporte(Reporte reporte) {
        return "/reporte/modificar";
    }
    
    @PostMapping("/reporte/guardar")
    public String guadarReporte(Reporte reporte) {
        reporteService.save(reporte);
        return "redirect:/reporte/listado";
    } 
    
    
    @GetMapping("/reporte/modificar/{idReporte}") 
    public String modificarReporte(Reporte reporte, Model model) {
        reporte = reporteService.getReporte(reporte);
        model.addAttribute("cliente", reporte);
        return "/reporte/modificar";
    }
    
    @GetMapping("/reporte/eliminar/{idReporte}")
    public String eliminarReporte(Reporte reporte) {
        reporteService.delete(reporte);
        return "redirect:/reporte/listado";
    }
    
}
