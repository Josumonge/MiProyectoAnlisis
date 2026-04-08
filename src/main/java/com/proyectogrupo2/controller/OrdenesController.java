package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdenesController {

    @GetMapping("/ordenes")
    public String mostrarOrdenes(Model model) {

        Object[][] ordenes = {
            {"ORD-001", "Hamburguesa", 20, "Proveedor Central", "Pendiente"},
            {"ORD-002", "Cerveza Imperial", 50, "Bebidas CR", "En proceso"},
            {"ORD-003", "Papas Fritas", 30, "Snacks del Oeste", "Completada"},
            {"ORD-004", "Refresco", 15, "Refrescos del Valle", "Pendiente"}
        };

        model.addAttribute("ordenes", ordenes);
        return "ordenes";
    }
}