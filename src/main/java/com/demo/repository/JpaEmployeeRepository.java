package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository("employeeRepository")
public class JpaEmployeeRepository implements EmployeeRepository {

	public List<Employee> getAllEmployee() {

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee();
		emp1.setId(300);
		emp1.setName("Ramu Kumar");

		Employee emp2 = new Employee();
		emp2.setId(410);
		emp2.setName("Mohan Singh");

		Employee emp3 = new Employee();
		emp3.setId(310);
		emp3.setName("Raju Kumar");

		Employee emp4 = new Employee();
		emp4.setId(504);
		emp4.setName("Santosh Kumar");

		Employee emp5 = new Employee();
		emp5.setId(500);
		emp5.setName("Ramu Suri");

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		return employees;
	}
}
