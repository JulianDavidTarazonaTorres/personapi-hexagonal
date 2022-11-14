/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.mapper;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.EstudiosEntity;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @author aasanchez
 */
@Component
public class EstudioMapper {
    
    
   
    //TODO
    public EstudiosEntity toEstudioEntityFromEstudio(Study study) {
        PersonaMapper personaMapper = new PersonaMapper();
        ProfesionMapper profesionMapper = new ProfesionMapper();
        
        EstudiosEntity st = new EstudiosEntity();
        st.setPersona(personaMapper.toPersonaEntityFromPersona(study.getPerson()));
        st.setProfesion(profesionMapper.toProfesionEntityFromProfesion(study.getPofession()));
        st.setFecha(study.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        st.setUniver(study.getUniverity());
   
        return st;
    }

    // TODO
    public List<Study> toListEstudioFromListEstudioEntity(List<EstudiosEntity> findAll) {
        List<Study> studies = new ArrayList<Study>();
        for (EstudiosEntity estudiosEntity : findAll) {
            studies.add(toEstudioFromEstudioEntity(estudiosEntity));
        }
        return studies;
    }
    
    public List<EstudiosEntity> toListEstudioEntityFromListEstudio(List<Study> findAll){
        List<EstudiosEntity> studies = new ArrayList<EstudiosEntity>();
        for (Study estudio: findAll) {
            studies.add(toEstudioEntityFromEstudio(estudio));
        }
        return studies;
    }

    // TODO
    public Study toEstudioFromEstudioEntity(EstudiosEntity estudiosEntity) {
        PersonaMapper personaMapper = new PersonaMapper();
        ProfesionMapper profesionMapper = new ProfesionMapper();
        
        Study st = new Study();
        st.setUniverity(estudiosEntity.getUniver());
        st.setDate(java.sql.Date.valueOf(estudiosEntity.getFecha()));
        st.setPerson(personaMapper.toPersonFromPersonaEntity(estudiosEntity.getPersona()));
        st.setPofession(profesionMapper.toProfesionFromProfesionEntity(estudiosEntity.getProfesion()));
     
        return st;
    }
}
