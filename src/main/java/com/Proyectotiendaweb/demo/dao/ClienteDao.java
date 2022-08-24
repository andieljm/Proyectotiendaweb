package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
