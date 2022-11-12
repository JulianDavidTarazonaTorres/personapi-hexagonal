package co.edu.javeriana.as.boot.spring.personapp.rest.response;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Phone;
import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import java.util.List;
import lombok.Data;

@Data
public class PersonaResponse {
    private Integer id;
    private String name;
    private String lastName;
    private String gender;
    private Integer age;
    
    private List<Phone> phones;
    private List<Study> studies;
}
