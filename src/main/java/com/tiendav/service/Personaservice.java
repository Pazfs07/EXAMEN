/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendav.service;

import com.tiendav.entity.Persona;
import com.tiendav.repository.Personarepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maripazfonseca
 */
@Service
public class Personaservice implements IPersonaservice {

    @Autowired
    private Personarepository personarepository;

    @Override
    public List<Persona> getAllPersona() {
       return (List<Persona>) personarepository. findAll();
    }

    @Override
    public Persona getPersonaById(long id) {
       return personarepository.findById (id) .orElse (null);
    }

    @Override
    public void savePersona(Persona persona) {
        personarepository. save(persona);
    }

    @Override
    public void delete(long id) {
       personarepository.deleteById(id);
    }

}
