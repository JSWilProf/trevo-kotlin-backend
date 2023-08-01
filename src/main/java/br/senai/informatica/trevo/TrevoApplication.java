package br.senai.informatica.trevo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication

public class TrevoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrevoApplication.class, args);
    }

}
