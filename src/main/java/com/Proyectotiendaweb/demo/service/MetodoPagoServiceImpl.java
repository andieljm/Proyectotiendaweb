package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.MetodoPagoDao;
import com.Proyectotiendaweb.demo.domain.MetodoPago;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Warre
 */
@Service
public class MetodoPagoServiceImpl implements MetodoPagoService{

    @Autowired
    private MetodoPagoDao metodoPagoDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<MetodoPago> getMetodoPagos() {
        return (List<MetodoPago>) metodoPagoDao.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public MetodoPago getMetodoPago(MetodoPago metodoPago) {
        return metodoPagoDao.findById(metodoPago.getIdMetodoPago()).orElse(null);
    }

    @Override
    @Transactional
    public void save(MetodoPago metodoPago) {
        metodoPagoDao.save(metodoPago);
    }

    @Override
    @Transactional
    public void delete(MetodoPago metodoPago) {
        metodoPagoDao.delete(metodoPago);
    }
}
