/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.port.out;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Estudios;
import java.util.List;

/**
 *
 * @author aasanchez
 */
public interface EstudiosPortOut {
    public List<Estudios> findAll();
    
    public void create(Estudios persona);

    public void edit(Estudios persona);

    public void remove(int id);
    
    public Estudios find(int id);
}
