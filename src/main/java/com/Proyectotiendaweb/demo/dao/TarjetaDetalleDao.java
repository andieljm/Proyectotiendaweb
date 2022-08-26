package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.MetodoPago;
import com.Proyectotiendaweb.demo.domain.TarjetaDetalle;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface TarjetaDetalleDao extends CrudRepository<TarjetaDetalle, Long>{
    
    public Optional<TarjetaDetalle> findByidTarjetaAndMetodoPago(Long idTarjeta, MetodoPago metodoPago);
    
    public List<TarjetaDetalle> findByIdTarjeta(Long idTarjeta);
    
    public void deleteByIdTarjeta(Long idTarjeta);
}
