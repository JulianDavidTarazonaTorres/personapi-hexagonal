/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Telefono;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface TelefonoPortOut {
    public List<Telefono> findAll();
    
    public void create(Telefono persona);

    public void edit(Telefono persona);

    public void remove(String id);
    
    public Telefono find(String id);
}
