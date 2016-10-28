package net.slavus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SlavusServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlavusServiceApplication.class, args);
    }
}
