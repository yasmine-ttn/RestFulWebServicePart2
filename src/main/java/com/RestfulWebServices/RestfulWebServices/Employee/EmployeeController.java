package com.RestfulWebServices.RestfulWebServices.Employee;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDaoService service;

    //GET REQUEST {for  particular employee}

    @GetMapping("/employees/{id}")
    public Employee retrieveUser(@PathVariable int id) {
        Employee employee=service.findOne(id);
        if(employee==null)
            throw new ResourceNotFoundException("id:"+id);
        return employee;
    }
    //GET REQUEST
    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees()
    {
        return service.findAll();
    }
    //PUT MAPPING
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id,
                                   @RequestBody Employee employee){
        return EmployeeDaoService.updateEmployee(id, employee);
    }


    //DELETE
    @DeleteMapping("/employees/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteById(id);
    }

    //POST REQUEST
    @PostMapping("/employees")
    public void createEmployee(@Valid @RequestBody Employee employee)
    {
        service.save(employee);
    }

}
