package br.com.hexagonal.architecture.journey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AdapterConsumerCommandsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdapterConsumerCommandsApplication.class, args);
    }

}
