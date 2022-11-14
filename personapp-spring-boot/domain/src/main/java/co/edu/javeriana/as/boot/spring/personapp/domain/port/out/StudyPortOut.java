/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.*;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface StudyPortOut {
    

    String create(Study study);

    String edit(Person person, Profession profession ,Study study);

    Boolean remove(Person person, Profession profession);
    
    Study findById(Person person, Profession profession);
    
    int count();

    List<Study> findAll();
    
}
