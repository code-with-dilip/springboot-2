package com.springboot2.client;

import com.springboot2.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

public class EmployeeClientWithConstructorInjectionTest {

    EmployeeService employeeService = new EmployeeService();

    @InjectMocks
    EmployeeClientWithConstructorInjection employeeClient = new EmployeeClientWithConstructorInjection(employeeService);

    @Test
    void invokeNameService() {
        //when
        String result = employeeClient.invokeNameService();

        //then
        assert result.equals("Hello");
    }
}
