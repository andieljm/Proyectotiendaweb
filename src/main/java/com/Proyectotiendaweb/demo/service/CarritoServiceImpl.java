package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.CarritoDao;
import com.Proyectotiendaweb.demo.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service //etiqueta importante 
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    CarritoDao carritoDao;

    @Override
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findById(carrito.getIdCarrito()).orElse(null); //orElse, si no encuentra nada retorna un null
    }

    @Override
    public Carrito getCarritoCliente(long idCliente) {
        var carrito = carritoDao.findByIdCliente(idCliente).orElse(null);
        
        if (carrito == null) {
            Carrito nuevo = new Carrito(idCliente);
            carrito = carritoDao.save(nuevo); //con este le decimos que cree el nuevo objeto de carrito 
        }
        return carrito;
    }
}
