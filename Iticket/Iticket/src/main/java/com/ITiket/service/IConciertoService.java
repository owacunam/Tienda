/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITiket.service;

import com.ITiket.entity.Concierto;
import java.util.List;

/**
 *
 * @author owen
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto(); 
    public Concierto getPersonaById(long id);
    public void saveConcierto(Concierto concierto);
    public void delete(long id);
}

