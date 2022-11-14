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
import javax.persistence.Lob;
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
@Table(catalog = "persona_db", schema = "",name="profesion")
@NamedQueries({
    @NamedQuery(name = "ProfesionEntity.findAll", query = "SELECT p FROM ProfesionEntity p")
    , @NamedQuery(name = "ProfesionEntity.findById", query = "SELECT p FROM ProfesionEntity p WHERE p.id = :id")
    , @NamedQuery(name = "ProfesionEntity.findByNom", query = "SELECT p FROM ProfesionEntity p WHERE p.nom = :nom")})
@Data
public class ProfesionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false, length = 90)
    private String nom;
    @Lob
    @Column(length = 65535)
    private String des;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profesion")
    private List<EstudiosEntity> estudiosList;

    public ProfesionEntity() {
    }

}
