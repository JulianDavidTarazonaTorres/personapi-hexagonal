/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.in;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PhoneUseCase {
   
    String create(Phone phone, Integer flag);

    String edit(String number,Phone phone,Integer flag);

    Boolean remove(String number,Integer flag);
    
    Phone findById(String number,Integer flag);
    
    int count(Integer flag);

    List<Phone> findAll(Integer flag);
    
}
