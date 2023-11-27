package vn.edu.iuh.fit.frontend.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.services.EmployeeService;

import java.util.List;

@Component
public class EmployeeModel {
    @Autowired
    private EmployeeService employeeService;
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
