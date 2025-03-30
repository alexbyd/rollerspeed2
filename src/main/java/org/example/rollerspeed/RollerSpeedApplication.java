package org.example.rollerspeed;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info=@Info(title = "API de Roller Speed", version = "1.0",description = "Documentación de la API de Roller Speed"))
@SpringBootApplication
@ComponentScan(basePackages = {"org.example"})
public class RollerSpeedApplication {

    public static void main(String[] args) {
        SpringApplication.run(RollerSpeedApplication.class, args);
        System.out.println("aplicacion ejecutandose");
    }

}
