/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Ejerciciosemana4.Yupanqui.controller;

import com.example.Ejerciciosemana4.Yupanqui.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class AlumnoController {
     @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "formulario";
    }

    @PostMapping("/formulario/exito")
    public String procesarFormulario(@ModelAttribute Alumno alumno, Model model) {
        model.addAttribute("alumno", alumno);
        return "exito";
    }
}

