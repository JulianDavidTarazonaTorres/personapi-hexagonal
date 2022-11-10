/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.adapter;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Persona;
import co.edu.javeriana.as.boot.spring.personapp.domain.port.out.PersonaPortOut;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public class PersonaPersistenceAdapter implements PersonaPortOut{

    //implementa los métodos de salida del modelo
    @Override
    public List<Persona> findAll() {
        return null;
    }

    @Override
    public void create(Persona persona) {
        System.out.println("PersonaPersistenceAdapter.create()");
    }

    @Override
    public void edit(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona find(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
