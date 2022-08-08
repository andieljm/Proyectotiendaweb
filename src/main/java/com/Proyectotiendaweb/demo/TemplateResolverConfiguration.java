package com.Proyectotiendaweb.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {

    @Bean
    public SpringResourceTemplateResolver templetaResolver_0() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("classpath:/templates");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(0);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templetaResolver_1() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/usuario");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(1);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templetaResolver_2() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/producto");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(2);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
     @Bean
    public SpringResourceTemplateResolver templetaResolver_3() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/favoritos");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(3);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
     @Bean
    public SpringResourceTemplateResolver templetaResolver_4() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/trabajo");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(4);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
     @Bean
    public SpringResourceTemplateResolver templetaResolver_5() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/perfil");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(5);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
     @Bean
    public SpringResourceTemplateResolver templetaResolver_6() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/carrito");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(6);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templetaResolver_7() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/empleado");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(7);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
}
