/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.ProfessionPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.maria.entity.ProfesionEntity;
import co.edu.javeriana.as.boot.spring.personapp.maria.mapper.ProfesionMapper;
import co.edu.javeriana.as.boot.spring.personapp.maria.repository.ProfesionRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author aasanchez
 */
public class ProfesionPersistenceAdapter implements ProfessionPortOutMaria{

    @Autowired
    private ProfesionRepository profesionRepository;
    
    @Autowired
    private ProfesionMapper profesionMapper;

    @Override
    public String create(Profession profession) {
        ProfesionEntity profesion = profesionMapper.toProfesionEntityFromProfesion(profession);
        
        if(profesionRepository.save(profesion)== null)
        {
            return "no se creo";
        }
        else
        {
            return "se creo";
        }
    }

    @Override
    public String edit(Integer id, Profession profession) {
        ProfesionEntity profesionEntity = profesionMapper.toProfesionEntityFromProfesion(profession);
        ProfesionEntity result = profesionRepository.findById(id).get();

        if(result != null){
            result.setDes(profesionEntity.getDes());
            result.setEstudiosList(profesionEntity.getEstudiosList());
            result.setId(profesionEntity.getId());
            result.setNom(profesionEntity.getNom());
            return "se creo";
        }
        else{
            return "no se creo";
        }
    }

    @Override
    public Boolean remove(Integer id) {
        profesionRepository.deleteById(id);
        return true;
    }

    @Override
    public Profession findById(Integer id) {
        return profesionMapper.toProfesionFromProfesionEntity(profesionRepository.findById(id).get());
    }

    @Override
    public int count() {
        return (int) profesionRepository.count();
    }

    @Override
    public List<Profession> findAll() {
        return profesionMapper.toListProfesionFromListProfesionEntity(profesionRepository.findAll());
    }
    
    

    
}
