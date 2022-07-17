
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Tarjetas;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface TarjetasService {
    
    public List<Tarjetas> getTarjetass();
    
    public Tarjetas getTarjetas(Tarjetas tarjetas);
    
    public void save(Tarjetas tarjetas);
    
    public void delete(Tarjetas tarjetas);
    
}
