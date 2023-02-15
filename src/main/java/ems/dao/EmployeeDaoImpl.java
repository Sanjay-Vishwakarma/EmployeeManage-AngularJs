package ems.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ems.entities.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeDao {

	
	   @Autowired
	   private SessionFactory sessionFactory;

	  @Override
	   public long save(Employee employee) {
	      sessionFactory.getCurrentSession().save(employee);
	      return employee.getId();
	   }
	
}
