package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.CarritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long>{
    
    public Optional<CarritoDetalle> findByIdCarritoAndProducto(Long idCarrito, Producto producto); //trae el producto relacionado  
    //dice producto porque debe hacer match con la entidad definida en domain.CarritoDetalle //al ser un objeto de tipo articulo, impicitamente trae todas las cosas del articulo
    
    public List<CarritoDetalle> findByIdCarrito(Long idCarrito);
    
    public void deleteByIdCarrito(Long idCarrito);
    
}
