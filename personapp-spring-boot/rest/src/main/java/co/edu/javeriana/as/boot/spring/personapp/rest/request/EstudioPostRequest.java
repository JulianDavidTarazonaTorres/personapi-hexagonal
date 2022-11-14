package co.edu.javeriana.as.boot.spring.personapp.rest.request;

import co.edu.javeriana.as.boot.spring.personapp.rest.response.*;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Profession;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Person;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class EstudioPostRequest {
    
    private Profession idProf;
    private Person ccPer;
    private Date date;
    private String univerity;
    
}
