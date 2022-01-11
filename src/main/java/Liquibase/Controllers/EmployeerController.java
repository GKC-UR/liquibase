package Liquibase.Controllers;

import Liquibase.Models.Employee;
import Liquibase.Repositoryes.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeerController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> listAll(){
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee save (@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
