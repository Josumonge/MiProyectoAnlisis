package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PuntoVentaController {

    @GetMapping("/punto-venta")
    public String mostrarPuntoVenta(Model model) {

        Object[][] productos = {
            {"1", "Hamburguesa Rock", 4500.00, 15},
            {"2", "Pizza Especial", 5500.00, 8},
            {"3", "Cerveza Imperial", 2000.00, 25},
            {"4", "Refresco", 1500.00, 5},
            {"5", "Papas Fritas", 1800.00, 2}
        };

        model.addAttribute("productos", productos);
        model.addAttribute("subtotal", 8500.00);
        model.addAttribute("iva", 1105.00);
        model.addAttribute("total", 9605.00);

        return "puntoVenta";
    }
}