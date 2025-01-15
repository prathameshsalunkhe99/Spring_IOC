package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Entity.Employee;
import com.configure.configureClass;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(configureClass.class);
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
		
				
	}

}
