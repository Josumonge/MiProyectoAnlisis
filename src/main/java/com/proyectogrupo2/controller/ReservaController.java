package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {

    @GetMapping("/reservaciones")
    public String mostrarReservaciones(Model model) {

        Object[][] reservas = {
            {"RES-001", "Andrés Soto", "88887777", "andres@gmail.com", "2026-04-10", "19:00", 4, true},
            {"RES-002", "Lucía Méndez", "89996666", "lucia@gmail.com", "2026-04-10", "20:00", 2, true},
            {"RES-003", "Roberto Chaves", "87775555", "roberto@gmail.com", "2026-04-11", "18:30", 8, false}
        };

        model.addAttribute("reservas", reservas);
        return "reservaciones";
    }
}