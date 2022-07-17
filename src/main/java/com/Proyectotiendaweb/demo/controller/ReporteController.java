
package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Warre
 */
@Controller
public class ReporteController {
    
    @Autowired ReporteService reporteService;
    
    @GetMapping("/reporte/")
    public String metodoPago(Model model) {
        
        var reportes = reporteService.getReportes();
        model.addAttribute("reportes", reportes);
        return "/reporte/reporte";
    }
}
