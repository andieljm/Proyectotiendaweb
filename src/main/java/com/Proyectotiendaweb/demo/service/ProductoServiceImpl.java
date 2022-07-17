
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.ProductoDao;
import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Warre
 */
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Producto> getProductos() {
        return (List<Producto>)productoDao.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void save(Producto producto) {
        
    }

    @Override
    public void delete(Producto producto) {
        
    }
    
    
    
}
