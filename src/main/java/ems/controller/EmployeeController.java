package ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ems.entities.Employee;
import ems.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	
//	Add the employee
	@RequestMapping(value="/addEmp",method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee)
	{
		long id = employeeService.save(employee);
		return ResponseEntity.ok().body("Added employee");
		
	}

}
