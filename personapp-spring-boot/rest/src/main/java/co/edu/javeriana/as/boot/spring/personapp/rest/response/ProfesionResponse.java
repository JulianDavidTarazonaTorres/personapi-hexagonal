package co.edu.javeriana.as.boot.spring.personapp.rest.response;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import java.util.List;
import lombok.Data;

@Data
public class ProfesionResponse {
    
    private Integer id;
    private String name;
    private String description;
    
}
