/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.*;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface ProfessionPortOut {
    

    String create(Profession profession);

    String edit(Integer id,Profession profession);

    Boolean remove(Integer id);
    
    Profession findById(Integer id);
    
    int count();

    List<Profession> findAll();
    
    
}
