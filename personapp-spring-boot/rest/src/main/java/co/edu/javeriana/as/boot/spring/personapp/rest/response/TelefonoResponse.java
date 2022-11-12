package co.edu.javeriana.as.boot.spring.personapp.rest.response;

import co.edu.javeriana.as.boot.spring.personapp.domain.model.Study;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class TelefonoResponse {
    
    private String number;
    private String provider;
    private int dueno;
    
}
