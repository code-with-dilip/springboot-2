package com.springboot2;

import com.springboot2.client.EmployeeClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class EmployeeClientIntegrationTest {

    @Autowired
    EmployeeClient employeeClient;

    @Test
    void name() {
        //given

        String result = employeeClient.invokeNameService();

        //then
        assert result.equals("Hello");
    }
}
