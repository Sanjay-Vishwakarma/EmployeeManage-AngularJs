package ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ems.dao.EmployeDao;
import ems.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeDao employeDao;

	@Transactional
	@Override
	public long save(Employee employee) {
		return employeDao.save(employee);
	}
}
