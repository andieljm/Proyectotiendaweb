/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyectotiendaweb.demo.service;

import com.Proyectotiendaweb.demo.domain.Usuario;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface UsuarioService {
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
    
}
