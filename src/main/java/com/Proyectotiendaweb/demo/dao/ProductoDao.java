
package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
