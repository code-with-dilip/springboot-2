package com.springboot2.client;

import com.springboot2.entity.Employee;
import com.springboot2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeClient {

    @Autowired
    EmployeeService employeeService;

    public String invokeNameService(){

        return employeeService.nameService();
    }


}
