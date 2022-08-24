package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
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
@Table (name = "carrito")
public class Carrito implements Serializable{
    
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCarrito; 
    private Long idCliente; //se debe asociar cob el cliente, no con el usuario, porque el usuario solo sirve para manejar los roles de login

    public Carrito() {
    }

    public Carrito(Long idCliente) {
        this.idCliente = idCliente;
    }
}
