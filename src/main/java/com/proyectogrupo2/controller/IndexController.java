package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // 🏠 DASHBOARD / INICIO
    @GetMapping("/")
    public String mostrarInicio(Model model) {

        // Datos quemados (simulación)
        model.addAttribute("ventasHoy", 125000);
        model.addAttribute("ordenesActivas", 8);
        model.addAttribute("productosStockBajo", 5);
        model.addAttribute("reservasHoy", 12);

        return "index";
    }
}