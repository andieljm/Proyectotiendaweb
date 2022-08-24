package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.FavoritoDetalleDao;
import com.Proyectotiendaweb.demo.domain.FavoritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Warre
 */

@Service
public class FavoritoDetalleServiceImpl implements FavoritoDetalleService{
    
    @Autowired
    FavoritoDetalleDao favoritoDetalleDao;

    @Override
    public FavoritoDetalle getFavoritoDetalle(Long idFavorito, Producto producto) {
        return favoritoDetalleDao.findByIdFavoritoAndProducto(idFavorito, producto).orElse(null);
    }

    @Override
    public List<FavoritoDetalle> getFavoritoDetalles(Long idFavorito) {
        return (List<FavoritoDetalle>) favoritoDetalleDao.findByIdFavorito(idFavorito);
    }

    @Override
    public void save(FavoritoDetalle favoritoDetalle) {
        favoritoDetalleDao.save(favoritoDetalle);
    }

    @Override
    public void delete(FavoritoDetalle favoritoDetalle) {
        favoritoDetalleDao.delete(favoritoDetalle);
    }

    @Override
    public void deleteAll(Long idFavorito) {
        favoritoDetalleDao.deleteByIdFavorito(idFavorito);
    }  
}
