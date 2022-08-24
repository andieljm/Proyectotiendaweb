package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.FavoritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;

/**
 *
 * @author Warre
 */
public interface FavoritoDetalleService {
    
    FavoritoDetalle getFavoritoDetalle (Long idFavorito, Producto producto);
    
    public List<FavoritoDetalle> getFavoritoDetalles (Long idFavorito); //detalles en plural porque es una lista de objetos
    
    public void save(FavoritoDetalle favoritoDetalle);

    public void delete(FavoritoDetalle favoritoDetalle);

    public void deleteAll(Long idFavorito);
    
}
