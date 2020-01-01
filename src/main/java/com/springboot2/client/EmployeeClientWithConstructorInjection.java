package com.springboot2.client;

import com.springboot2.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeClientWithConstructorInjection {

    private EmployeeService employeeService;

    public EmployeeClientWithConstructorInjection(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String invokeNameService(){
        return employeeService.nameService();
    }
}
