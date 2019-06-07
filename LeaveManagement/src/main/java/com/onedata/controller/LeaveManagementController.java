package com.onedata.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onedata.exception.ResourceNotFoundException;
import com.onedata.model.Employee;
import com.onedata.repository.EmployeeRepository;

@RestController
public class LeaveManagementController {
	@Autowired
    private EmployeeRepository employeeRepository;
	
//	@GetMapping("/login/{id}")
//    public ResponseEntity<Employee> loginById(@PathVariable(value = "id") Long employeeId)
//        throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//          .orElseThrow(() -> new ResourceNotFoundException("INVALID EMPLOYEE ID:: " + employeeId));
//        return ResponseEntity.ok().body(employee);
//    }
	
	
	@GetMapping("/getEmployees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
	
	@GetMapping("/findEmployees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
        throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }
	
	 @PostMapping("/insertEmployee")
	    public Employee createEmployee(@Valid @RequestBody Employee employee) {
		 
	        return employeeRepository.save(employee);
	    }
	 
	 @PostMapping("/login")
	    public Optional<Employee> login(@Valid @RequestBody Employee employee) {
		 //String name=employee.getUserName();
		if(employee.getUserName().toLowerCase().equals("abinesh")) {
			Optional<Employee> employee1 = employeeRepository.findById(employee.getId());
	        return employee1;
	    }
	 
	 	 return null;
	 }
}
