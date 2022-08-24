package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Favorito;

/**
 *
 * @author Warre
 */
public interface FavoritoService {
    
    public Favorito getFavorito(Favorito favorito);
    
    public Favorito getFavoritoCliente(long idCliente);
    
}
