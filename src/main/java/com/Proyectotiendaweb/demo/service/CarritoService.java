package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Carrito;

/**
 *
 * @author Warre
 */
public interface CarritoService  {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(long idCliente);
    
    //lo que tenemos aca son formas de obtener el carrito nada mas 
}
