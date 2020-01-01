package com.springboot2.jpa;

import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers(disabledWithoutDocker = true)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Container
    public static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer<>();

    static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {
            postgreSQLContainer.getPassword();
            postgreSQLContainer.getUsername();
            postgreSQLContainer.getJdbcUrl();
        }
    }
}
