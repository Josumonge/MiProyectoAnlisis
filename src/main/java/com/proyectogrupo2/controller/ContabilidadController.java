package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContabilidadController {

    @GetMapping("/contabilidad")
    public String mostrarContabilidad(Model model) {

        Object[][] movimientos = {
            {"CON-001", "Egreso", "Pago proveedor Carnes", "Proveedores", 45000.00, "2026-04-07", "Javier Goldoni"},
            {"CON-002", "Egreso", "Pago servicio de agua", "Servicios", 12000.00, "2026-04-07", "Lucía Vargas"},
            {"CON-003", "Ingreso", "Ventas del día", "Caja", 325000.00, "2026-04-07", "Carlos Ramírez"},
            {"CON-004", "Egreso", "Pago servicio eléctrico", "Servicios", 18000.00, "2026-04-08", "Andrés Solano"}
        };

        Object[][] cuentasPorPagar = {
            {"FAC-101", "Carnes del Valle", 65000.00, "2026-04-15", "Pendiente"},
            {"FAC-102", "Distribuidora Licores", 98000.00, "2026-04-18", "Pendiente"},
            {"FAC-103", "Servicios Públicos", 22000.00, "2026-04-05", "Pagada"}
        };

        Object[][] bitacora = {
            {"2026-04-07 08:20", "Javier Goldoni", "Creación", "Registro de gasto a proveedor"},
            {"2026-04-07 18:45", "Carlos Ramírez", "Edición", "Ajuste de monto en cierre de caja"},
            {"2026-04-08 09:10", "Lucía Vargas", "Eliminación", "Eliminación de egreso duplicado"}
        };

        double totalIngresos = 325000.00;
        double totalGastos = 75000.00;
        double utilidadNeta = totalIngresos - totalGastos;

        model.addAttribute("movimientos", movimientos);
        model.addAttribute("cuentasPorPagar", cuentasPorPagar);
        model.addAttribute("bitacora", bitacora);
        model.addAttribute("totalIngresos", totalIngresos);
        model.addAttribute("totalGastos", totalGastos);
        model.addAttribute("utilidadNeta", utilidadNeta);
        model.addAttribute("iva", 13);
        model.addAttribute("servicio", 10);

        return "contabilidad";
    }
}