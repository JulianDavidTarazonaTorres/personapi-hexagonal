/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface PersonaPortOut {
    public List<Persona> findAll();
    
    public void create(Persona persona);

    public void edit(Persona persona);

    public void remove(String id);
    
    public Persona find(String id);
}
