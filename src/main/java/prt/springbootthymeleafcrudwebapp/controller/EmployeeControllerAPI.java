/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prt.springbootthymeleafcrudwebapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prt.springbootthymeleafcrudwebapp.model.Employee;
import prt.springbootthymeleafcrudwebapp.service.EmployeeService;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/v1")
public class EmployeeControllerAPI {
    private EmployeeService employeeService; 
    
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employeelist", method=GET)
    public List<Employee> displayAllEmployees(Model model){
        return employeeService.getAllEmployees();
}
        
}
