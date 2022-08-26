package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.MetodoPago;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface MetodoPagoService {
    
    public List<MetodoPago> getMetodoPagos();
    
    public MetodoPago getMetodoPago(MetodoPago metodoPago);
    
    public void save(MetodoPago metodoPago);
    
    public void delete(MetodoPago metodoPago);
    
}
