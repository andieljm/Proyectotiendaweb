
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
@Table (name = "tarjetas")
public class Tarjetas implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTarjeta;
    private String numeroCuenta;
    private String tipo;
    private int codSeguridad;

    public Tarjetas() {
    }

    public Tarjetas(String numeroCuenta, String tipo, int codSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
        this.codSeguridad = codSeguridad;
    }
    
    
}
