package co.edu.javeriana.as.boot.spring.personapp.domain.model;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Study {

	private Profession pofession;
	private Person person;
	private Date date;
	private String univerity;
        
	
	
	
}
