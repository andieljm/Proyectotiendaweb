
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
@Table (name = "producto") 
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_producto")
    private Long idProducto;
    private String nombreProducto;
    private double precio;
    private String color;
    private int stock;
    private String tipo;
    private String descripcion;
    private int codigoProducto;

    public Producto() {
    }
    
    public Producto(String nombreProducto, double precio, String color, int stock, String tipo, String descripcion, int codigoProducto) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.color = color;
        this.stock = stock;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.codigoProducto = codigoProducto;
    }
    
    
}
