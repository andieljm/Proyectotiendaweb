/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyectotiendaweb.demo.domain;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Warre
 */
@Data
@Entity
@Table (name = "reporte")
public class Reporte {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idReporte;
    private String descripcion;
    private String tipoReporte;

    public Reporte() {
    }

    public Reporte(String descripcion, String tipoReporte) {
        this.descripcion = descripcion;
        this.tipoReporte = tipoReporte;
    }
    
    
}
