
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Reporte;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface ReporteService {
    
    public List<Reporte> getReportes();
    
    public Reporte getReporte(Reporte reporte);
    
    public void save(Reporte reporte);
    
    public void delete(Reporte reporte);
    
}
