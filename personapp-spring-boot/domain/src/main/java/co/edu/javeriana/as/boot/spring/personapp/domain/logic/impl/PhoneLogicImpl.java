/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.PhoneUseCase;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.PhonePortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.mongo.PersonPortOutMongo;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.mongo.PhonePortOutMongo;

/**
 *
 * @author aasanchez
 */
@Service
public class PhoneLogicImpl implements PhoneUseCase{
@Autowired
    private PhonePortOutMongo phonePortOutMongo;
    
    
    @Autowired
    private PhonePortOutMaria phonePortOutMaria;
    
    @Override
    public String create(Phone phone, Integer flag) {

        switch (flag) {
            case 0:
                // 0 --> Mongo
                return phonePortOutMongo.create(phone);
                
                
            case 1:
                // 1 --> Maria
                return phonePortOutMaria.create(phone);
                
            default:
                // logica para retornar solo una persona
                String mongo = phonePortOutMongo.create(phone);
                String maria = phonePortOutMaria.create(phone);
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
    public String edit(String id, Phone phone, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return phonePortOutMongo.edit(id, phone);
                
                
            case 1:
                // 1 --> Maria
                return phonePortOutMaria.edit(id, phone);
                
            default:
                // logica para retornar solo una persona
                String mongo = phonePortOutMongo.edit(id, phone);
                String maria = phonePortOutMaria.edit(id, phone);
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
    public Boolean remove(String id, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return phonePortOutMongo.remove(id);
                
                
            case 1:
                // 1 --> Maria
                return phonePortOutMaria.remove(id);
                
            default:
                // logica para retornar solo una persona
                boolean mongo = phonePortOutMongo.remove(id);
                boolean maria = phonePortOutMaria.remove(id);
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
    public Phone findById(String id, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return phonePortOutMongo.findById(id);
                
                
            case 1:
                // 1 --> Maria
                return phonePortOutMaria.findById(id);
                
            default:
                // logica para retornar solo una persona
                Phone mongo = phonePortOutMongo.findById(id);
                Phone maria = phonePortOutMaria.findById(id);
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
                return phonePortOutMongo.count();
                
                
            case 1:
                // 1 --> Maria
                return phonePortOutMaria.count();
                
            default:
                // logica para retornar solo una persona
                int mongo = phonePortOutMongo.count();
                int maria = phonePortOutMaria.count();
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
    public List<Phone> findAll(Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return phonePortOutMongo.findAll();
                
                
            case 1:
                // 1 --> Maria
                return phonePortOutMaria.findAll();
                
            default:
                // logica para retornar solo una persona
                List<Phone> mongo = phonePortOutMongo.findAll();
                List<Phone> maria = phonePortOutMaria.findAll();
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
