package co.edu.javeriana.as.boot.spring.personapp.rest;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={

"co.edu.javeriana.as.boot.spring.personapp.domain.port.in.PersonUseCase"})

public class RestSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSpringBootApplication.class, args);
    }

}
