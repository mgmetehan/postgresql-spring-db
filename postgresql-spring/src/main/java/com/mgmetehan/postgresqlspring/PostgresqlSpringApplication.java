package com.mgmetehan.postgresqlspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PostgresqlSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostgresqlSpringApplication.class, args);
    }

}
