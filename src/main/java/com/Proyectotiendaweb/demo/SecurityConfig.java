package com.Proyectotiendaweb.demo;

import com.Proyectotiendaweb.demo.service.UsuarioDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UsuarioDetailsServiceImpl userDetailsService;
// método para hacer autenticación de usuario

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // usuarios de base de datos
        auth.userDetailsService(userDetailsService);
    }
}
