package com.springboot2.client;


import com.springboot2.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeClientTest {

    @Spy
    EmployeeService employeeService;

    @InjectMocks
    EmployeeClient employeeClient;

    @Test
    void name() {
        //when
        String result  = employeeClient.invokeNameService();

        //then
        assert result.equals("Hello");
    }
}
