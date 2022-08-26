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

/**
 *
 * @author Warre
 */
@Data
@Entity
@Table(name="tarjeta_detalle")
public class TarjetaDetalle implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tarjeta_detalle")
    private Long idTarjetaDetalle;
    private Long idTarjeta;
    private String numeroCuenta;
    private String tipo;
    private int codSeguridad;
    
    @JoinColumn(name = "id_metodo_pago", referencedColumnName = "id_metodo_pago")
    @ManyToOne
    private MetodoPago metodoPago;

    public TarjetaDetalle() {
    }
    
    public TarjetaDetalle(Long idTarjeta, String numeroCuenta, String tipo, int codSeguridad, MetodoPago metodoPago) {
        this.idTarjeta = idTarjeta;
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
        this.codSeguridad = codSeguridad;
        this.metodoPago = metodoPago;
    }

}
