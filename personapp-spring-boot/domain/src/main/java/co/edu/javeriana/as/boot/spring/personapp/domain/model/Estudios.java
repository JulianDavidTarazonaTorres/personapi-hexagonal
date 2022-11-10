package co.edu.javeriana.as.boot.spring.personapp.domain.model;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Estudios {

	private Persona id_prof;
	private Profesion cc_per;
	private Date fecha;
	private String univer;
	private List<Estudios> estudios;
	
	
	
}
