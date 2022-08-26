package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.TarjetaDao;
import com.Proyectotiendaweb.demo.domain.Carrito;
import com.Proyectotiendaweb.demo.domain.Tarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Warre
 */
@Service
public class TarjetaServiceImpl implements TarjetaService {

    @Autowired
    TarjetaDao tarjetaDao;

    @Override
    public Tarjeta getTarjeta(Tarjeta tarjeta) {
        return tarjetaDao.findById(tarjeta.getIdTarjeta()).orElse(null);
    }

    @Override
    public Tarjeta getTarjetaCliente(long idCliente) {
        var tarjeta = tarjetaDao.findByIdCliente(idCliente).orElse(null);

        if (tarjeta == null) {
            Tarjeta nuevo = new Tarjeta(idCliente);
            tarjeta = tarjetaDao.save(nuevo);
        }
        return tarjeta;
    }
}
