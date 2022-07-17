
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface ProductoService {
    
    public List<Producto> getProductos();
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
}
