
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Formulario;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface FormularioService {
    
    public List<Formulario> getFormularios();
    
    public Formulario getFormulario(Formulario formulario);
    
    public void save(Formulario formulario);
    
    public void delete(Formulario formulario);
    
}
