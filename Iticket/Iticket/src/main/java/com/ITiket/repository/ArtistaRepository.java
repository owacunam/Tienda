/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITiket.repository;

import com.ITiket.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author owenm
 */
@Repository
public interface ArtistaRepository extends CrudRepository <Artista,Long>{//consultas en la base de datos
    
}
