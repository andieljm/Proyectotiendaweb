package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "favorito_detalle")
public class FavoritoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_favorito_detalle")
    private Long idFavoritoDetalle;
    private Long idFavorito;
    private int cantidad;

    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;

    public FavoritoDetalle() {
    }

    public FavoritoDetalle(Long idFavorito, int cantidad, Producto producto) {
        this.idFavorito = idFavorito;
        this.cantidad = cantidad;
        this.producto = producto;
    }
}
