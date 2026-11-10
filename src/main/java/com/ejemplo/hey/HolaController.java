/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.hey;
  

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")


/**
 *
 * @author Usuario
 */
public class HolaController {
 


    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "¡API REST de prueba ejecutándose correctamente desde Spring Boot!";
    }
}
