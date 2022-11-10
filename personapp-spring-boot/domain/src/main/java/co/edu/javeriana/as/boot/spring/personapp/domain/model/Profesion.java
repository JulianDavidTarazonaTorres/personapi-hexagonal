package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import java.util.List;
import lombok.Data;

@Data
public class Profesion {

	private int id;
	private String nom;
	private String des;
        private List<Estudios> estudiosList;
	
}
