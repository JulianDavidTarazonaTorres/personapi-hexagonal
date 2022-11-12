package co.edu.javeriana.as.boot.spring.personapp.rest.response;


import lombok.Data;

@Data
public class PersonaResponse {
    private Integer id;
    private String name;
    private String lastName;
    private String gender;
    private Integer age;
    
    
}
