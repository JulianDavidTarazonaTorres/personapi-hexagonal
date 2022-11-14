/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.StudyPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.EstudiosEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.EstudiosPK;
import co.edu.javeriana.as.boot.spring.personapp.maria.mapper.EstudioMapper;
import co.edu.javeriana.as.boot.spring.personapp.maria.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author aasanchez
 */
public class EstudioPersistenceAdapter implements StudyPortOutMaria{

    @Autowired
    private EstudiosRepository estudioRepository;
    
    @Autowired
    private EstudioMapper estudioMapper;

    @Override
    public String create(Study study) {
        EstudiosEntity estudio = estudioMapper.toEstudioEntityFromEstudio(study);
        
        if(estudioRepository.save(estudio)== null)
        {
            return "no se creo";
        }
        else
        {
            return "se creo";
        }
    }

    @Override
    public String edit(Person person, Profession profession, Study study) {
        EstudiosEntity estudio = estudioMapper.toEstudioEntityFromEstudio(study);
        
        EstudiosPK estudiosPK = new EstudiosPK();
        estudiosPK.setCcPer(person.getId());
        estudiosPK.setIdProf(profession.getId());
        EstudiosEntity result = estudioRepository.findById(estudiosPK).get();

        if(result != null){
            result.setEstudiosPK(estudio.getEstudiosPK());
            result.setFecha(estudio.getFecha());
            result.setPersona(estudio.getPersona());
            result.setProfesion(estudio.getProfesion());
            result.setUniver(estudio.getUniver());
            return "se creo";
        }
        else{
            return "no se creo";
        }
    }

    @Override
    public Boolean remove(Person person, Profession profession) {
        EstudiosPK estudiosPK = new EstudiosPK();
        estudiosPK.setCcPer(person.getId());
        estudiosPK.setIdProf(profession.getId());
        estudioRepository.deleteById(estudiosPK);
        return true;
    }

    @Override
    public Study findById(Person person, Profession profession) {
        EstudiosPK estudiosPK = new EstudiosPK();
        estudiosPK.setCcPer(person.getId());
        estudiosPK.setIdProf(profession.getId());
        return estudioMapper.toEstudioFromEstudioEntity(estudioRepository.findById(estudiosPK).get());
    }

    @Override
    public int count() {
        return (int) estudioRepository.count();
    }

    @Override
    public List<Study> findAll() {
        return estudioMapper.toListEstudioFromListEstudioEntity(estudioRepository.findAll());
    }
    
    

    
}
