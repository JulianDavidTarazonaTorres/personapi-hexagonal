/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.rest.adapter;


import java.util.List;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.StudyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 * @author aasanchez
 */

// este utiliza a los mappers
// el controlador utiliza a esta clase
@Component
public class EstudioAppAdapter implements StudyUseCase{
    
    @Autowired
    private StudyUseCase studyUseCase;

    @Override
    public String create(Study study, Integer flag) {
        return studyUseCase.create(study, flag);
    }

    @Override
    public String edit(Person person, Profession profession ,Study study,Integer flag) {
        return studyUseCase.edit(person, profession, study, flag);
    }

    @Override
    public Boolean remove(Person person, Profession profession, Integer flag){
        return studyUseCase.remove(person, profession, flag);
    }

    @Override
    public Study findById(Person person, Profession profession,Integer flag) {
        return studyUseCase.findById(person, profession, flag);
    }

    @Override
    public int count(Integer flag) {
        return studyUseCase.count(flag);
    }

    @Override
    public List<Study> findAll(Integer flag) {
        return studyUseCase.findAll(flag);
    }

    
    
}
