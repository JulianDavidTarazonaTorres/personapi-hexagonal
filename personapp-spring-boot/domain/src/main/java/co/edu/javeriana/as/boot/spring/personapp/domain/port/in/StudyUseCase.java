/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface StudyUseCase {
    

    String create(Study study, Integer flag);

    String edit(Person person, Profession profession ,Study study,Integer flag);

    Boolean remove(Person person, Profession profession, Integer flag);
    
    Study findById(Person person, Profession profession,Integer flag);
    
    int count(Integer flag);

    List<Study> findAll(Integer flag);
    
}
