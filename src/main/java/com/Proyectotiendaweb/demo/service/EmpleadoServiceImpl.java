
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.EmpleadoDao;
import com.Proyectotiendaweb.demo.domain.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Warre
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired EmpleadoDao empleadoDao;

    @Override
    @Transactional (readOnly = true)
    public List<Empleado> getEmpleados() {
        return (List<Empleado>)empleadoDao.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    public void save(Empleado empleado) {
        
    }

    @Override
    public void delete(Empleado empleado) {
        
    }
    
}
