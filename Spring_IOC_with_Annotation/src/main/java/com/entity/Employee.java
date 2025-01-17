package com.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	@Value("1")
	private int emp_id;
	@Value("Prathamesh")
	private String emp_name;
	@Value("700000")
	private long emp_salary;

	

	public Employee() {

	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public long getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(long emp_salary) {
		this.emp_salary = emp_salary;
	}


	public Employee(int emp_id, String emp_name, long emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ",]";
	}

}