/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.port.in.*;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PhonePortOut {
   
    String create(Phone phone);

    String edit(String number,Phone phone);

    Boolean remove(String number);
    
    Phone findById(String number);
    
    int count();

    List<Phone> findAll();
    
}
