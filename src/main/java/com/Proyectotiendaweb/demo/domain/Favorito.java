package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "favorito")
public class Favorito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFavorito;
    private Long idCliente;

    public Favorito() {
    }

    public Favorito(Long idCliente) {
        this.idCliente = idCliente;
    }
}


