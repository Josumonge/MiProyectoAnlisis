package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReporteController {

    @GetMapping("/reportes")
    public String mostrarReportes(Model model) {

        Object[][] resumenVentas = {
            {"2026-04-07", "Efectivo", 125000.00},
            {"2026-04-07", "Tarjeta", 210500.00},
            {"2026-04-07", "SINPE Móvil", 84500.00}
        };

        Object[][] productosTop = {
            {"Hamburguesa Rock", "Comidas", 120},
            {"Cerveza Imperial", "Licores", 98},
            {"Pizza Especial", "Comidas", 85},
            {"Refresco", "Bebidas", 70},
            {"Papas Fritas", "Snacks", 66}
        };

        Object[][] inventarioAlertas = {
            {"Refresco", 3, "Stock bajo"},
            {"Papas Fritas", 2, "Stock bajo"},
            {"Queso Mozzarella", 5, "Merma"}
        };

        Object[][] rendimientoEmpleados = {
            {"Carlos Ramírez", 325000.00, 48, 2},
            {"Lucía Vargas", 289500.00, 41, 1},
            {"Andrés Solano", 250000.00, 36, 4}
        };

        model.addAttribute("resumenVentas", resumenVentas);
        model.addAttribute("productosTop", productosTop);
        model.addAttribute("inventarioAlertas", inventarioAlertas);
        model.addAttribute("rendimientoEmpleados", rendimientoEmpleados);
        model.addAttribute("montoTotal", 420000.00);

        return "reportes";
    }
}