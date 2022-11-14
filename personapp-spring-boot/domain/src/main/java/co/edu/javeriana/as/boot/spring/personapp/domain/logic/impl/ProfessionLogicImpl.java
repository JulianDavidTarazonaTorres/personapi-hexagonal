/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.logic.impl;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.ProfessionUseCase;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.maria.ProfessionPortOutMaria;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.mongo.ProfessionPortOutMongo;


/**
 *
 * @author aasanchez
 */
@Service
public class ProfessionLogicImpl implements ProfessionUseCase{
    
    @Autowired
    private ProfessionPortOutMongo professionPortOutMongo;
    
    
    @Autowired
    private ProfessionPortOutMaria professionPortOutMaria;

    @Override
    public String create(Profession profession, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return professionPortOutMongo.create(profession);
                
                
            case 1:
                // 1 --> Maria
                return professionPortOutMaria.create(profession);
                
           default:
                // logica para retornar solo una persona
                String mongo = professionPortOutMongo.create( profession);
                String maria = professionPortOutMaria.create( profession);
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
    public String edit(Integer id, Profession profession, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return professionPortOutMongo.edit(id,profession);
                
                
            case 1:
                // 1 --> Maria
                return professionPortOutMaria.edit(id,profession);
                
           default:
                // logica para retornar solo una persona
                String mongo = professionPortOutMongo.edit(id,profession);
                String maria = professionPortOutMaria.edit(id,profession);
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
                return professionPortOutMongo.remove(id);
                
                
            case 1:
                // 1 --> Maria
                return professionPortOutMaria.remove(id);
                
           default:
                // logica para retornar solo una persona
                boolean mongo = professionPortOutMongo.remove(id);
                boolean maria = professionPortOutMaria.remove(id);
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
    public Profession findById(Integer id, Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return professionPortOutMongo.findById(id);
                
                
            case 1:
                // 1 --> Maria
                return professionPortOutMaria.findById(id);
                
           default:
                // logica para retornar solo una persona
                Profession mongo = professionPortOutMongo.findById(id);
                Profession maria = professionPortOutMaria.findById(id);
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
                return professionPortOutMongo.count();
                
                
            case 1:
                // 1 --> Maria
                return professionPortOutMaria.count();
                
           default:
                // logica para retornar solo una persona
                int mongo = professionPortOutMongo.count();
                int maria = professionPortOutMaria.count();
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
    public List<Profession> findAll(Integer flag) {
        switch (flag) {
            case 0:
                // 0 --> Mongo
                return professionPortOutMongo.findAll();
                
                
            case 1:
                // 1 --> Maria
                return professionPortOutMaria.findAll();
                
           default:
                // logica para retornar solo una persona
                List<Profession> mongo = professionPortOutMongo.findAll();
                List<Profession> maria = professionPortOutMaria.findAll();
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
