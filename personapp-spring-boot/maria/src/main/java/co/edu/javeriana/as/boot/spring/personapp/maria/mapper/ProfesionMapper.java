/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.mapper;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;

import co.edu.javeriana.as.boot.spring.personapp.maria.entity.ProfesionEntity;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @author aasanchez
 */
@Component
public class ProfesionMapper {
   
    //TODO
    public ProfesionEntity toProfesionEntityFromProfesion(Profession profession) {
        EstudioMapper estudioMapper = new EstudioMapper();
        
        ProfesionEntity pro = new ProfesionEntity();
        pro.setId(profession.getId());
        pro.setNom(profession.getName());
        pro.setDes(profession.getDescription());
        pro.setEstudiosList(estudioMapper.toListEstudioEntityFromListEstudio(profession.getStudies()));
        
        return pro;
    }

    // TODO
    public List<Profession> toListProfesionFromListProfesionEntity(List<ProfesionEntity> findAll) {
        List<Profession> profesiones = new ArrayList<Profession>();
        for (ProfesionEntity profesionEntity : findAll) {
            profesiones.add(toProfesionFromProfesionEntity(profesionEntity));
        }
        return profesiones;
    }
    
    public List<ProfesionEntity> toListProfesionEntityFromListProfesion( List<Profession>findAll) {
        List<ProfesionEntity> profesiones = new ArrayList<ProfesionEntity>();
        for (Profession profesion : findAll) {
            profesiones.add(toProfesionEntityFromProfesion(profesion));
        }
        return profesiones;
    }

    // TODO
    public Profession toProfesionFromProfesionEntity(ProfesionEntity profesionEntity) {
        EstudioMapper estudioMapper = new EstudioMapper();
        
        Profession pro = new Profession();
        pro.setId(profesionEntity.getId());
        pro.setName(profesionEntity.getNom());
        pro.setDescription(profesionEntity.getDes());
        pro.setStudies(estudioMapper.toListEstudioFromListEstudioEntity(profesionEntity.getEstudiosList()));
        
        return pro;
    }
}
