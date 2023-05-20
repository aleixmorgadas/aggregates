package dev.aleixmorgadas.aggregates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

public class RunAggregateApplication {

    public static void main(String[] args) {
        SpringApplication.from(AggregatesApplication::main)
            .with(ContainerConfiguration.class)
            .run(args);
    }

    @TestConfiguration
    static class ContainerConfiguration {

        @Bean
        @ServiceConnection
        PostgreSQLContainer<?> postgres() {
            return new PostgreSQLContainer<>("postgres:15-alpine");
        }
    }
}
