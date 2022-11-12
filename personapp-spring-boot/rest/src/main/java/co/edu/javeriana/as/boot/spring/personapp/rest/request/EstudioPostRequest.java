package co.edu.javeriana.as.boot.spring.personapp.rest.request;

import co.edu.javeriana.as.boot.spring.personapp.rest.response.*;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class EstudioPostRequest {
    
    private int idProf;
    private int ccPer;
    private Date date;
    private String univerity;
    
}
