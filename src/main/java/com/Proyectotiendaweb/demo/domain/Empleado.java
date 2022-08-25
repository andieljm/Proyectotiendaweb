
package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "empleado")
public class Empleado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    private String nombre;
    private String apellido;
    private String residencia;
    private String cedula;
    private String correo;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, String nombre, String apellido, String residencia, String cedula, String correo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.residencia = residencia;
        this.cedula = cedula;
        this.correo = correo;
    }
    
    
}
