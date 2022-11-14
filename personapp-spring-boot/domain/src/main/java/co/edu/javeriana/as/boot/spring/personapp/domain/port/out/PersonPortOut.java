/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.*;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonPortOut {

    
    String create(Person person);

    String edit(Integer id,Person person);

    Boolean remove(Integer id);
    
    Person findById(Integer id);
    
    int count();

    List<Person> findAll();
    
}
