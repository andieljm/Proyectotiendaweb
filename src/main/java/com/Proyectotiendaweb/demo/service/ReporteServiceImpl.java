
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.ReporteDao;
import com.Proyectotiendaweb.demo.domain.Reporte;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Warre
 */
@Service
public class ReporteServiceImpl implements ReporteService{
    
    @Autowired ReporteDao reporteDao;

    @Override
    @Transactional (readOnly = true)
    public List<Reporte> getReportes() {
        return (List<Reporte>)reporteDao.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Reporte getReporte(Reporte reporte) {
        return reporteDao.findById(reporte.getIdReporte()).orElse(null);
    }

    @Override
    public void save(Reporte reporte) {
        
    }

    @Override
    public void delete(Reporte reporte) {
        
    }
    
}
