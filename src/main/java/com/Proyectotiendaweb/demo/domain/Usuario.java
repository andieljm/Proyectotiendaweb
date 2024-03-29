
package com.Proyectotiendaweb.demo.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    String username;
    String password;
    int idCliente = 2;
    Long idRol;

    public Usuario() {
    }

    public Usuario(String username, String password, long idRol) {
        this.username = username;
        this.password = password;
        this.idRol = idRol;
    }
}
