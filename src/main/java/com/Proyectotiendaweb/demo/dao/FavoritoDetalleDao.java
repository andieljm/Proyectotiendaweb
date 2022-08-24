package com.Proyectotiendaweb.demo.dao;

import com.Proyectotiendaweb.demo.domain.FavoritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Warre
 */
public interface FavoritoDetalleDao extends CrudRepository<FavoritoDetalle, Long> {

    public Optional<FavoritoDetalle> findByIdFavoritoAndProducto(Long idFavorito, Producto producto);

    public List<FavoritoDetalle> findByIdFavorito(Long idFavorito);

    public void deleteByIdFavorito(Long idFavorito);

}
