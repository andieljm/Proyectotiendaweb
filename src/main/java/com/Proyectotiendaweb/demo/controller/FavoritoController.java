package com.Proyectotiendaweb.demo.controller;


import com.Proyectotiendaweb.demo.domain.FavoritoDetalle;
import com.Proyectotiendaweb.demo.domain.Producto;
import com.Proyectotiendaweb.demo.service.FavoritoDetalleService;
import com.Proyectotiendaweb.demo.service.ProductoService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Lenovo
 */
@Controller
public class FavoritoController {

    @Autowired
    private FavoritoDetalleService favoritoDetalleService;

    @Autowired
    private ProductoService productoService;

    @GetMapping("favorito/agregar/{idProducto}")
    public String agregar(Producto producto, HttpSession session) {

        Long idFavorito = (Long) session.getAttribute("idFavorito");
        producto = productoService.getProducto(producto);

        FavoritoDetalle favoritoDetalle = favoritoDetalleService.getFavoritoDetalle(idFavorito, producto);

        if (favoritoDetalle != null) {
            favoritoDetalle.setCantidad(favoritoDetalle.getCantidad() + 1);
        } else {
            favoritoDetalle = new FavoritoDetalle(idFavorito, 1, producto);
        }
        favoritoDetalleService.save(favoritoDetalle);

        return "redirect:/productos/";
    }

    @GetMapping("/favoritos/")
    public String listado(Model model, Producto producto, HttpSession session) {

        Long idFavorito = (Long) session.getAttribute("idFavorito");
        List<FavoritoDetalle> favoritoDetalles = favoritoDetalleService.getFavoritoDetalles(idFavorito);
        model.addAttribute("favoritoDetalle", favoritoDetalles);
        return "/favorito/listado";
    }

    @GetMapping("/favorito/eliminar/{idFavorito}")
    public String eliminarFavoritoAll(Long idFavorito) {
        favoritoDetalleService.deleteAll(idFavorito);
        return "redirect:/favoritos/";
    }

    @GetMapping("/favorito/eliminarSolo/{idFavoritoDetalle}")
    public String eliminarFavorito(FavoritoDetalle favoritoDetalle) {
        favoritoDetalleService.delete(favoritoDetalle);
        return "redirect:/favoritos/";
    }
    
}
