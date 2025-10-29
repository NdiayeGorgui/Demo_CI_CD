package com.gogo.democicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoCiCdApplication extends SpringBootServletInitializer {

    @GetMapping("/")
    public String getMessage() {
        return "Déploiement réussi : Docker → DockerHub et Tomcat";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoCiCdApplication.class, args);
    }
}
