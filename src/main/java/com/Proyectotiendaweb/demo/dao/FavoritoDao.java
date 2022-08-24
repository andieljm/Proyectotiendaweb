package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.Favorito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface FavoritoDao extends CrudRepository<Favorito, Long> {
    
    Optional<Favorito> findByIdCliente(Long idCliente);
    
}
