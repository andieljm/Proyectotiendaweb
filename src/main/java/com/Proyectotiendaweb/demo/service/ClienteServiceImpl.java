package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.ClienteDao;
import com.Proyectotiendaweb.demo.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service 
public class ClienteServiceImpl implements ClienteService{


    
    
    @Autowired
    private ClienteDao clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null); //si el metodo es algo valido, devuelve eso
    }
      
    @Override
    @Transactional
    public void save(Cliente cliente) {
    }
      
    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
    
}
