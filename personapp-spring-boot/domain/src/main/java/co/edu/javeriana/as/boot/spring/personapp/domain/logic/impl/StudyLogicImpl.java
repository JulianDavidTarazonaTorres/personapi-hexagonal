/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;


import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.StudyUseCase;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.StudyPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.mongo.StudyPortOutMongo;

/**
 *
 * @author aasanchez
 */
@Service
public class StudyLogicImpl implements StudyUseCase{

    @Autowired
    private StudyPortOutMongo studyPortOutMongo;
    
    
    @Autowired
    private StudyPortOutMaria studyPortOutMaria;
    
    @Override
    public String create(Study study, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return studyPortOutMongo.create(study);
                
                
            case 1:
                // 1 --> Maria
                return studyPortOutMaria.create(study);
                
           default:
                // logica para retornar solo una persona
                String mongo = studyPortOutMongo.create( study);
                String maria = studyPortOutMaria.create( study);
                if(mongo.equals(maria) && mongo.equals("se creo"))
                {
                   return mongo;
                }
                if(!mongo.equals("se creo") && maria.equals("se creo"))
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo.equals("se creo") && !maria.equals("se creo"))
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  mongo;
                }
                else
                {
                    return "no se creo";
                }
        }
    }

    @Override
    public String edit(Person person,Profession profession, Study study, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return studyPortOutMongo.edit(person,profession,study);
                
                
            case 1:
                // 1 --> Maria
                return studyPortOutMaria.edit(person,profession,study);
                
           default:
                // logica para retornar solo una persona
                String mongo = studyPortOutMongo.edit(person,profession,study);
                String maria = studyPortOutMaria.edit(person,profession,study);
                if(mongo.equals(maria) && mongo.equals("se creo"))
                {
                   return mongo;
                }
                if(!mongo.equals("se creo") && maria.equals("se creo"))
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo.equals("se creo") && !maria.equals("se creo"))
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  mongo;
                }
                else
                {
                    return "no se creo";
                }
        }
    }

    @Override
    public Boolean remove(Person person,Profession profession, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return studyPortOutMongo.remove(person,profession);
                
                
            case 1:
                // 1 --> Maria
                return studyPortOutMaria.remove(person,profession);
                
           default:
                // logica para retornar solo una persona
                boolean mongo = studyPortOutMongo.remove(person,profession);
                boolean maria = studyPortOutMaria.remove(person,profession);
                if(mongo && maria)
                {
                   return mongo;
                }
                if(!mongo && maria)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo && !maria)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  mongo;
                }
                else
                {
                    return false;
                }
        }
    }

    @Override
    public Study findById(Person person,Profession profession, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return studyPortOutMongo.findById(person,profession);
                
                
            case 1:
                // 1 --> Maria
                return studyPortOutMaria.findById(person,profession);
                
           default:
                // logica para retornar solo una persona
                Study mongo = studyPortOutMongo.findById(person,profession);
                Study maria = studyPortOutMaria.findById(person,profession);
                if(mongo != null && maria != null)
                {
                   return mongo;
                }
                if(mongo == null  && maria != null)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo != null && maria == null)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  mongo;
                }
                else
                {
                    return null;
                }
        }
    }

    @Override
    public int count(Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return studyPortOutMongo.count();
                
                
            case 1:
                // 1 --> Maria
                return studyPortOutMaria.count();
                
           default:
                // logica para retornar solo una persona
                int mongo = studyPortOutMongo.count();
                int maria = studyPortOutMaria.count();
                if(mongo != -1 && maria != -1)
                {
                   return mongo;
                }
                if(mongo == -1  && maria != -1)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo != -1 && maria == -1)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  mongo;
                }
                else
                {
                    return -1;
                }
        }
    }

    @Override
    public List<Study> findAll(Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return studyPortOutMongo.findAll();
                
                
            case 1:
                // 1 --> Maria
                return studyPortOutMaria.findAll();
                
           default:
                // logica para retornar solo una persona
                List<Study> mongo = studyPortOutMongo.findAll();
                List<Study> maria = studyPortOutMaria.findAll();
                if(mongo != null && maria != null)
                {
                   return mongo;
                }
                if(mongo == null  && maria != null)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo != null && maria == null)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  mongo;
                }
                else
                {
                    return null;
                }
        }
    }
   
       
}
