/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profesion;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface ProfesionPortOut {
    public List<Profesion> findAll();
    
    public void create(Profesion persona);

    public void edit(Profesion persona);

    public void remove(int id);
    
    public Profesion find(int id);
}
