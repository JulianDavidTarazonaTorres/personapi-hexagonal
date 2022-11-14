/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import co.edu.javeriana.as.boot.spring.personapp.maria.entity.PersonaEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 *
 * @author aasanchez
 */
@Entity
@Table(catalog = "persona_db", schema = "", name="estudios")
@NamedQueries({
    @NamedQuery(name = "EstudiosEntity.findAll", query = "SELECT e FROM EstudiosEntity e")
    , @NamedQuery(name = "EstudiosEntity.findByIdProf", query = "SELECT e FROM EstudiosEntity e WHERE e.estudiosPK.idProf = :idProf")
    , @NamedQuery(name = "EstudiosEntity.findByCcPer", query = "SELECT e FROM EstudiosEntity e WHERE e.estudiosPK.ccPer = :ccPer")
    , @NamedQuery(name = "EstudiosEntity.findByFecha", query = "SELECT e FROM EstudiosEntity e WHERE e.fecha = :fecha")
    , @NamedQuery(name = "EstudiosEntity.findByUniver", query = "SELECT e FROM EstudiosEntity e WHERE e.univer = :univer")})
@Data
public class EstudiosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstudiosPK estudiosPK;
    @Column(columnDefinition = "DATE")
    private LocalDate fecha; 
    @Column(length = 50)
    private String univer;
    @JoinColumn(name = "cc_per", referencedColumnName = "cc", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PersonaEntity persona;
    @JoinColumn(name = "id_prof", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProfesionEntity profesion;

    public EstudiosEntity() {
    }

    
}
