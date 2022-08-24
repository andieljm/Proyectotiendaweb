package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.dao.FavoritoDao;
import com.Proyectotiendaweb.demo.domain.Favorito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Warre
 */
@Service //etiqueta importante 
public class FavoritoServiceImpl implements FavoritoService {

    @Autowired
    FavoritoDao favoritoDao;

    @Override
    public Favorito getFavorito(Favorito favorito) {
        return favoritoDao.findById(favorito.getIdFavorito()).orElse(null);
    }

    @Override
    public Favorito getFavoritoCliente(long idCliente) {
        var favorito = favoritoDao.findByIdCliente(idCliente).orElse(null);

        if (favorito == null) {
            Favorito nuevo = new Favorito(idCliente);
            favorito = favoritoDao.save(nuevo);
        }
        return favorito;
    }
}
