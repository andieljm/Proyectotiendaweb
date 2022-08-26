package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;



/**
 *
 * @author Warre
 */
@Data
@Entity
@Table(name="metodo_pago")
public class MetodoPago implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_metodo_pago")
    private Long idMetodoPago;
    private String numeroCuenta;
    private String tipo;
    private int codSeguridad;

    public MetodoPago() {
    }

    public MetodoPago(String numeroCuenta, String tipo, int codSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
        this.codSeguridad = codSeguridad;
    }
}
