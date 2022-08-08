
package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long>{
    
    Usuario findByUsername(String username);
    
}
