package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.Tarjeta;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface TarjetaDao extends CrudRepository<Tarjeta, Long>{
    
    Optional<Tarjeta> findByIdCliente(Long idCliente);
    
}
