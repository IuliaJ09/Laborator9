package com.example.laborator9;

import com.example.laborator9.masini.service.MasinaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Laborator9Application {
    private static final Logger logger = LoggerFactory.getLogger(Laborator9Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Laborator9Application.class, args);
    }

    @Bean
    CommandLineRunner runner(MasinaService service) {
        return args -> {
            service.toateMasinile().forEach(masina -> {
                System.out.println(masina);
                logger.info(masina.toString());
            });
        };
    }

}
