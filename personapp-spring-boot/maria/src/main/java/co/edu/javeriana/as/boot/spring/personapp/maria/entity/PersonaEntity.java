/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.entity;



import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * @author aasanchez
 */
@Entity
@Table(name= "persona", catalog = "persona_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "PersonaEntity.findAll", query = "SELECT p FROM PersonaEntity p")
    , @NamedQuery(name = "PersonaEntity.findByCc", query = "SELECT p FROM PersonaEntity p WHERE p.cc = :cc")
    , @NamedQuery(name = "PersonaEntity.findByNombre", query = "SELECT p FROM PersonaEntity p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonaEntity.findByApellido", query = "SELECT p FROM PersonaEntity p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "PersonaEntity.findByGenero", query = "SELECT p FROM PersonaEntity p WHERE p.genero = :genero")
    , @NamedQuery(name = "PersonaEntity.findByEdad", query = "SELECT p FROM PersonaEntity p WHERE p.edad = :edad")})
@Data
public class PersonaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer cc;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, length = 45)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, length = 45)
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, length = 1)
    private String genero;
    private Integer edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "duenio")
    private List<TelefonoEntity> telefonoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<EstudiosEntity> estudiosList;

    public PersonaEntity() {
    }

    
}
