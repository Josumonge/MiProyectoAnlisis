/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectogrupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

   @Controller
public class UsuariosController {

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {

        model.addAttribute("usuarios", new Object[][]{
            {"Kendal Picado", "kpicado", "ADMIN", "Activo"},
            {"Maria Lopez", "mlopez", "EMPLEADO", "Activo"},
            {"Juan Perez", "jperez", "EMPLEADO", "Inactivo"}
        });

        return "usuarios";
    }
} 
