/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendav.controller;


import com.tiendav.entity.Pais;
import com.tiendav.entity.Persona;
import com.tiendav.service.IPaisservice;
import com.tiendav.service.IPersonaservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author maripazfonseca
 */
@Controller
public class Personacontroller {

    @Autowired
    private IPersonaservice personaservice;

    @Autowired
    private IPaisservice paisService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaservice.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";

    }
    @GetMapping("delete/{id}")
    public String eliminarPersona(@PathVariable("id")Long idpersona) {
        personaservice.delete(idpersona);
        return "redirect:/persona";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaservice.savePersona(persona);
        return "redirect:/persona";
    }
    
     @GetMapping("/editpersona/{id}")
    public String editarPersona(@PathVariable("id")Long idpersona,Model model) {
        Persona persona = personaservice.getPersonaById(idpersona);
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
}
}
