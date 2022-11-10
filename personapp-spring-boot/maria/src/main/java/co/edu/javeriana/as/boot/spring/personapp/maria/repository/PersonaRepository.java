/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.repository;

import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author aasanchez
 */
public interface PersonaRepository extends CrudRepository<PersonaEntity, Integer>{
    
}
