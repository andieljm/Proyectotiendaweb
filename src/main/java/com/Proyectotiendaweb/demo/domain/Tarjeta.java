package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Warre
 */
@Data
@Entity
@Table (name = "tarjeta")
public class Tarjeta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTarjeta;
    private Long idCliente;

    public Tarjeta() {
    }

    public Tarjeta(Long idCliente) {
        this.idCliente = idCliente;
    }
}
