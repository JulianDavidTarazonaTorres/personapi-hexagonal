package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import java.util.List;
import lombok.Data;

@Data
public class Profession {

	private Integer id;
	private String name;
	private String description;
        private List<Study> studies;
	
}
