
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.FormularioDao;
import com.Proyectotiendaweb.demo.domain.Formulario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Warre
 */
@Service
public class FormularioServiceImpl implements FormularioService{

    @Autowired FormularioDao formularioDao;
    
    @Override
    public List<Formulario> getFormularios() {
        return (List<Formulario>)formularioDao.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Formulario getFormulario(Formulario formulario) {
        return formularioDao.findById(formulario.getIdPersona()).orElse(null);
    }

    @Override
    @Transactional (readOnly = true)
    public void save(Formulario formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void delete(Formulario formulario) {
        formularioDao.delete(formulario);
    }
    
}
