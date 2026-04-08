package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarketingController {

    @GetMapping("/marketing")
    public String mostrarMarketing(Model model) {

        model.addAttribute("publicaciones", new Object[][]{
            {"Promo Viernes", "Promoción", "Descuento en cervezas para atraer clientes", "2026-04-07 18:00", "2026-04-07 23:00", true, null},
            {"Evento en vivo", "Evento", "Banda invitada este sábado", "2026-04-10 20:00", "2026-04-10 23:59", true, null},
            {"Nueva carta", "Menú", "Se agregaron nuevos platillos al menú", "2026-04-01 12:00", "2026-04-30 22:00", true, 8500.00},
            {"Happy Hour", "Promoción", "Promoción especial de 6 a 8pm", "2026-04-08 18:00", "2026-04-08 20:00", false, null}
        });

        return "marketing";
    }
}