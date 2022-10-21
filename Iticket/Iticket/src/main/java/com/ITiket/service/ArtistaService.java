/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITiket.service;

import com.ITiket.entity.Artista;
import com.ITiket.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author owen
 */

@Service
public class ArtistaService implements IArtistaService{
    
    @Autowired
    private ArtistaRepository artistaRepository;
    
    @Override
    public List<Artista> listCountry() {
        return (List<Artista>) artistaRepository.findAll();
    }
    
}
