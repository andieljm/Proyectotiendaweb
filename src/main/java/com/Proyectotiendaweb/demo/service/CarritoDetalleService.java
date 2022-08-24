package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.CarritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface CarritoDetalleService {
    
    CarritoDetalle getCarritoDetalle(Long idCarrito, Producto Producto);

    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);

    public void save(CarritoDetalle carritoDetalle);

    public void delete(CarritoDetalle carritoDetalle);

    public void deleteAll(Long idCarrito);
    
}
