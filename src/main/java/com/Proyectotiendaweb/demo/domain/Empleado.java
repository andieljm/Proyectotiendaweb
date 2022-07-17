/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public Empleado(String nombre, String apellido, String residencia, String cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.residencia = residencia;
        this.cedula = cedula;
        this.correo = correo;
    }
}
