/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendav.repository;

import com.tiendav.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maripazfonseca
 */
@Repository
public interface Paisrepository extends CrudRepository<Pais,Long> {
    
}