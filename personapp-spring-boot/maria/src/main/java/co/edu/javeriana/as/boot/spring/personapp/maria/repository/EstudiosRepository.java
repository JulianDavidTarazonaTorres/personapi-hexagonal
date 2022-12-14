/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.repository;

import co.edu.javeriana.as.boot.spring.personapp.maria.entity.EstudiosEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.EstudiosPK;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author aasanchez
 */
// solo cambiar los <>
@Repository
public interface EstudiosRepository extends JpaRepository<EstudiosEntity, EstudiosPK>{
    
    
    
}
