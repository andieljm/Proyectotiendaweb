
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Usuario;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
    
}
