package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BitacoraController {

    @GetMapping("/bitacora")
    public String mostrarBitacora(Model model) {

        String[][] bitacora = {
            {"1", "Kendal", "Inventario", "CREAR", "Se agregó el producto Hamburguesa Clásica", "2026-04-08", "10:30 AM"},
            {"2", "María", "Usuarios", "EDITAR", "Se actualizó el rol de un usuario", "2026-04-08", "11:15 AM"},
            {"3", "Kendal", "Ventas", "ANULAR", "Se anuló una venta registrada en caja", "2026-04-08", "12:00 PM"},
            {"4", "Juan", "Reservaciones", "CREAR", "Se registró una nueva reservación", "2026-04-08", "01:20 PM"},
            {"5", "Juan", "Inventario", "EDITAR", "Se actualizó el stock del producto Cerveza", "2026-04-08", "02:10 PM"},
            {"6", "Kendal", "Contabilidad", "CREAR", "Se registró un movimiento contable", "2026-04-08", "03:05 PM"},
            {"7", "María", "Usuarios", "ELIMINAR", "Se inactivó un usuario del sistema", "2026-04-08", "04:00 PM"}
        };

        model.addAttribute("bitacora", bitacora);

        return "bitacora";
    }
}
