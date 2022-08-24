package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface CarritoDao extends CrudRepository<Carrito, Long> {
    
    Optional<Carrito> findByIdCliente(Long idCliente); //se usa este metodo para buscar 
//si el cliente tiene un carrito y sino tiene, se crea uno nuevo
    
}
