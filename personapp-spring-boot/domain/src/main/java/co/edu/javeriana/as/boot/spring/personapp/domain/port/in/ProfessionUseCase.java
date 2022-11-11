/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface ProfessionUseCase {
    

    String create(Profession profession, Integer flag);

    String edit(Integer id,Profession profession,Integer flag);

    Boolean remove(Integer id,Integer flag);
    
    Profession findById(Integer id,Integer flag);
    
    int count(Integer flag);

    List<Profession> findAll(Integer flag);
    
    
}
