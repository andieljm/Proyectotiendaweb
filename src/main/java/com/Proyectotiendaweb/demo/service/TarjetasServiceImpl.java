package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.ClienteDao;
import com.Proyectotiendaweb.demo.dao.TarjetasDao;
import com.Proyectotiendaweb.demo.domain.Cliente;
import com.Proyectotiendaweb.demo.domain.Tarjetas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Warre
 */
@Service
public class TarjetasServiceImpl implements TarjetasService {

    @Autowired
    TarjetasDao tarjetasDao;
    
    @Autowired
    ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tarjetas> getTarjetass() {
        return (List<Tarjetas>) tarjetasDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tarjetas getTarjetas(Tarjetas tarjetas) {
        return tarjetasDao.findById(tarjetas.getIdTarjeta()).orElse(null);
    }

    @Override
    public void save(Tarjetas tarjetas) {
        Cliente cliente = tarjetas.getCliente();
        cliente = clienteDao.save(cliente);
        tarjetas.setCliente(cliente);
        clienteDao.save(cliente);
    }

    @Override
    public void delete(Tarjetas tarjetas) {

    }
}
