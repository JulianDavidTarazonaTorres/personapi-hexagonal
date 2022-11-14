/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.boot.spring.personapp.domain.model;

import java.util.List;

import lombok.Data;

/**
 *
 * @author aasanchez
 */
@Data
public class Person {
    
    private Integer id;
    private String name;
    private String lastName;
    private String gender;
    private Integer age;
    
    private List<Phone> phones;
    private List<Study> studies;
}
