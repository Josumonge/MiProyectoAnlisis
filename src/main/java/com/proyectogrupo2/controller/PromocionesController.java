package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromocionesController {

    @GetMapping("/promociones")
    public String mostrarPromociones(Model model) {

        Object[][] promociones = {
            {"PROM-001", "Happy Hour", 25, "2026-04-01", "2026-04-30", 101, "Hamburguesa", true},
            {"PROM-002", "Promo Cervezas", 15, "2026-04-05", "2026-04-20", 102, "Cerveza Imperial", true},
            {"PROM-003", "Descuento Papas", 10, "2026-03-01", "2026-03-31", 103, "Papas Fritas", false},
            {"PROM-004", "Combo Refresco", 20, "2026-04-10", "2026-04-25", 104, "Refresco", true}
        };

        model.addAttribute("promociones", promociones);
        return "promociones";
    }
}
