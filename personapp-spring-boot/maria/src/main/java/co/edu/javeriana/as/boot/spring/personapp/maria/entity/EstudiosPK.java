/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.as.boot.spring.personapp.maria.entity;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;


/**
 *
 * @author aasanchez
 */

@Embeddable
@Data
public class EstudiosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_prof", nullable = false)
    private int idProf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cc_per", nullable = false)
    private int ccPer;

    public EstudiosPK() {
    }

}
