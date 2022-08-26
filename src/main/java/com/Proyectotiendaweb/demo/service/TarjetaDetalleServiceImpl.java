package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.TarjetaDetalleDao;
import com.Proyectotiendaweb.demo.domain.MetodoPago;
import com.Proyectotiendaweb.demo.domain.TarjetaDetalle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Warre
 */
@Service
public class TarjetaDetalleServiceImpl implements TarjetaDetalleService {
    
    @Autowired
    TarjetaDetalleDao tarjetaDetalleDao;
    
    @Override
    public TarjetaDetalle getTarjetaDetalle(Long idTarjeta, MetodoPago metodoPago) {
        return tarjetaDetalleDao.findByidTarjetaAndMetodoPago(idTarjeta, metodoPago).orElse(null);
    }
    
    @Override
    public List<TarjetaDetalle> getTarjetaDetalles(Long idTarjeta) {
        return (List<TarjetaDetalle>) tarjetaDetalleDao.findByIdTarjeta(idTarjeta);
    }

    @Override
    public void save(TarjetaDetalle tarjetaDetalle) {
        tarjetaDetalleDao.save(tarjetaDetalle);
    }

    @Override
    public void delete(TarjetaDetalle tarjetaDetalle) {
        tarjetaDetalleDao.delete(tarjetaDetalle);
    }

    
}
