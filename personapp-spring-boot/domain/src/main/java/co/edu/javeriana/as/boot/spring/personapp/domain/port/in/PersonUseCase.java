/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;

import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonUseCase {

    
    String create(Person person, Integer flag);

    String edit(Integer id,Person person,Integer flag);

    Boolean remove(Integer id,Integer flag);
    
    Person findById(Integer id,Integer flag);
    
    int count(Integer flag);

    List<Person> findAll(Integer flag);
    
}
