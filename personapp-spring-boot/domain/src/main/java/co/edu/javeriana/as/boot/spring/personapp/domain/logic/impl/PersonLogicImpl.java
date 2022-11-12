/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.PersonUseCase;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PersonPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.mongo.PersonPortOutMongo;

/**
 *
 * @author aasanchez
 */
@Service
public class PersonLogicImpl implements PersonUseCase{

    @Autowired
    private PersonPortOutMongo personPortOutMongo;
    
    
    @Autowired
    private PersonPortOutMaria personPortOutMaria;
    
    @Override
    public String create(Person person, Integer flag) {

        switch (flag) {
            case 0:
                // 0 --> Mongo
                return personPortOutMongo.create(person);
                
                
            case 1:
                // 1 --> Maria
                return personPortOutMaria.create(person);
                
            default:
                // logica para retornar solo una persona
                String mongo = personPortOutMongo.create(person);
                String maria = personPortOutMaria.create(person);
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
    public String edit(Integer id, Person person, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return personPortOutMongo.edit(id, person);
                
                
            case 1:
                // 1 --> Maria
                return personPortOutMaria.edit(id, person);
                
            default:
                // logica para retornar solo una persona
                String mongo = personPortOutMongo.edit(id, person);
                String maria = personPortOutMaria.edit(id, person);
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
    public Boolean remove(Integer id, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return personPortOutMongo.remove(id);
                
                
            case 1:
                // 1 --> Maria
                return personPortOutMaria.remove(id);
                
            default:
                // logica para retornar solo una persona
                boolean mongo = personPortOutMongo.remove(id);
                boolean maria = personPortOutMaria.remove(id);
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
    public Person findById(Integer id, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return personPortOutMongo.findById(id);
                
                
            case 1:
                // 1 --> Maria
                return personPortOutMaria.findById(id);
                
            default:
                // logica para retornar solo una persona
                Person mongo = personPortOutMongo.findById(id);
                Person maria = personPortOutMaria.findById(id);
                if(mongo!= null && maria!= null)
                {
                   return mongo;
                }
                if(mongo== null && maria!= null)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo!= null && maria== null)
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
                return personPortOutMongo.count();
                
                
            case 1:
                // 1 --> Maria
                return personPortOutMaria.count();
                
            default:
                // logica para retornar solo una persona
                int mongo = personPortOutMongo.count();
                int maria = personPortOutMaria.count();
                if(mongo!= -1 && maria!=-1)
                {
                   return mongo;
                }
                if(mongo==-1 && maria!= -1)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo!= -1 && maria== -1)
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
    public List<Person> findAll(Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return personPortOutMongo.findAll();
                
                
            case 1:
                // 1 --> Maria
                return personPortOutMaria.findAll();
                
            default:
                // logica para retornar solo una persona
                List<Person> mongo = personPortOutMongo.findAll();
                List<Person> maria = personPortOutMaria.findAll();
                if(mongo!= null && maria!= null)
                {
                   return mongo;
                }
                if(mongo== null && maria!= null)
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  maria;
                }
                if(mongo!= null && maria== null)
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
