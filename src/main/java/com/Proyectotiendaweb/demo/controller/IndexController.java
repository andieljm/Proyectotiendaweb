package com.Proyectotiendaweb.demo.controller;

import com.Proyectotiendaweb.demo.dao.UsuarioDao;
import com.Proyectotiendaweb.demo.domain.Carrito;
import com.Proyectotiendaweb.demo.domain.CarritoDetalle;
import com.Proyectotiendaweb.demo.domain.Favorito;
import com.Proyectotiendaweb.demo.domain.FavoritoDetalle;
import com.Proyectotiendaweb.demo.domain.Tarjeta;
import com.Proyectotiendaweb.demo.domain.TarjetaDetalle;
import com.Proyectotiendaweb.demo.domain.Usuario;
import com.Proyectotiendaweb.demo.service.CarritoDetalleService;
import com.Proyectotiendaweb.demo.service.CarritoService;
import com.Proyectotiendaweb.demo.service.FavoritoDetalleService;
import com.Proyectotiendaweb.demo.service.FavoritoService;
import com.Proyectotiendaweb.demo.service.TarjetaDetalleService;
import com.Proyectotiendaweb.demo.service.TarjetaService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private CarritoService carritoService;

    @Autowired
    private CarritoDetalleService carritoDetalleService;

    @Autowired
    private FavoritoService favoritoService;

    @Autowired
    private FavoritoDetalleService favoritoDetalleService;

    @Autowired
    private TarjetaService tarjetaService;

    @Autowired
    private TarjetaDetalleService tarjetaDetalleService;

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping("/")
    public String inicio(Model model, HttpSession session, HttpServletRequest request) {

        //paerte necesaria para leer un usuario $$
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails user = null;

        if (principal instanceof UserDetails) {
            user = (UserDetails) principal;
        }
        //$$

        //validamos que es cliente ##
        boolean esCliente = false;

        if (user.getAuthorities().size() == 1) {
            for (var rol : user.getAuthorities()) {
                if (rol.getAuthority().equals("ROLE_USER")) {
                    esCliente = true;
                }
            }
        }
        //##

        //para Carrito
        if (esCliente) {
            Usuario usuario = usuarioDao.findByUsername(user.getUsername());
            Carrito carrito = carritoService.getCarritoCliente(usuario.getIdCliente());

            request.getSession().setAttribute("idCliente", usuario.getIdCliente());
            request.getSession().setAttribute("idCarrito", carrito.getIdCarrito());

            List<CarritoDetalle> carritoDetalle = carritoDetalleService.getCarritoDetalles(carrito.getIdCarrito());
            int cantidadProductoCarrito = carritoDetalle.size();

            model.addAttribute("cantidadProductoCarrito", cantidadProductoCarrito);

        }

        //Para Favorito
        if (esCliente) {
            Usuario usuario = usuarioDao.findByUsername(user.getUsername());
            Favorito favorito = favoritoService.getFavoritoCliente(usuario.getIdCliente());

            request.getSession().setAttribute("idCliente", usuario.getIdCliente());
            request.getSession().setAttribute("idFavorito", favorito.getIdFavorito());

            List<FavoritoDetalle> favoritoDetalle = favoritoDetalleService.getFavoritoDetalles(favorito.getIdFavorito());
            int cantidadProductoFavorito = favoritoDetalle.size();

            model.addAttribute("cantidadProductoFavorito", cantidadProductoFavorito);

        }

        if (esCliente) {
            Usuario usuario = usuarioDao.findByUsername(user.getUsername());
            Tarjeta tarjeta = tarjetaService.getTarjetaCliente(usuario.getIdCliente());

            request.getSession().setAttribute("idCliente", usuario.getIdCliente());
            request.getSession().setAttribute("idTarjeta", tarjeta.getIdTarjeta());

            List<TarjetaDetalle> tarjetaDetalle = tarjetaDetalleService.getTarjetaDetalles(tarjeta.getIdTarjeta());
            int cantidadTarjetas = tarjetaDetalle.size();

            model.addAttribute("cantidadTarjetas", cantidadTarjetas);

        }

        return "index";
    }
}
