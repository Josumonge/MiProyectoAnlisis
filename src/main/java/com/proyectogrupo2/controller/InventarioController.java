package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventarioController {

    @GetMapping("/inventario")
    public String mostrarInventario(Model model) {

        Object[][] productos = {
            {"1", "P001", "Hamburguesa", 3500.00, 15, "Proveedor Central"},
            {"2", "P002", "Pizza", 5000.00, 8, "Distribuidora Italiana"},
            {"3", "P003", "Cerveza", 2000.00, 25, "Bebidas CR"},
            {"4", "P004", "Refresco", 1500.00, 5, "Refrescos del Valle"},
            {"5", "P005", "Papas Fritas", 1800.00, 2, "Snacks del Oeste"}
        };

        model.addAttribute("productos", productos);
        return "inventario";
    }
}