package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.MetodoPago;
import com.Proyectotiendaweb.demo.domain.TarjetaDetalle;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface TarjetaDetalleService {
    
    TarjetaDetalle getTarjetaDetalle(Long idTarjeta, MetodoPago metodoPago);
    
    public List<TarjetaDetalle> getTarjetaDetalles(Long idTarjeta);
    
    //public TarjetaDetalle getTarjetaDetalles (Long idTarjeta);
    
    public void save(TarjetaDetalle tarjetaDetalle);
    
    public void delete(TarjetaDetalle tarjetaDetalle);
}
