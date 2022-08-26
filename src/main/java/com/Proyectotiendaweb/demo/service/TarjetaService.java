
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Tarjeta;

/**
 *
 * @author Warre
 */
public interface TarjetaService {
    
    public Tarjeta getTarjeta(Tarjeta tarjeta);
    
    public Tarjeta getTarjetaCliente(long idCliente);
    
}
