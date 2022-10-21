/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITiket.repository;

import com.ITiket.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author owenm
 */
@Repository
public interface ConciertoRepository extends CrudRepository <Concierto,Long>{ //consultas en la base de datos
    
}
