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
                else
                {
                    // logica para mirar cual se creo (en que base de datos)
                    return  "falta";
                }
        }
        
        
    }


    @Override
    public String edit(Integer id, Person person, Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean remove(Integer id, Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Person findById(Integer id, Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int count(Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Person> findAll(Integer flag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
