package com.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int emp_id;
	@Value("Prathamesh")
	private String Emp_name;
	@Value("700")
	private int emp_salary;

	public Employee() {

		super();
	}

	public Employee(int emp_id, String emp_name, int emp_salary) {
		super();
		this.emp_id = emp_id;
		Emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", Emp_name=" + Emp_name + ", emp_salary=" + emp_salary + "]";
	}

}
