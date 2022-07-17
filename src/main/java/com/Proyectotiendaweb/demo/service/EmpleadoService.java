
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Empleado;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface EmpleadoService {
    
    public List<Empleado> getEmpleados();
    
    public Empleado getEmpleado(Empleado empleado);
    
    public void save(Empleado empleado);
    
    public void delete(Empleado empleado);
}
