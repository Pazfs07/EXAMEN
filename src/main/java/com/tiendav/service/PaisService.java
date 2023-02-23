/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendav.service;

import com.tiendav.entity.Pais;
import com.tiendav.repository.Paisrepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maripazfonseca
 */
@Service
public class PaisService implements IPaisservice{

@Autowired


private Paisrepository paisrepository;

@Override
public List<Pais> listCountry () {
return (List<Pais>) paisrepository. findAll ();
        }
}


        

