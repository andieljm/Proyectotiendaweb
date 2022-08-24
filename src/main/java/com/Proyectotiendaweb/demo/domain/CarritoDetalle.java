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
@Table(name = "carrito_detalle")
public class CarritoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_carrito_detalle")
    private Long idCarritoDetalle;
    private Long idCarrito;
    private double precio;
    private int cantidad;
    
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;

    public CarritoDetalle() {
    }

    public CarritoDetalle(Long idCarrito, double precio, int cantidad, Producto producto) {
        this.idCarrito = idCarrito;
        this.precio = precio;
        this.cantidad = cantidad;
        this.producto = producto;
    }
}
