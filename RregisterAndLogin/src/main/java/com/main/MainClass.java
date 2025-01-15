package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Login;
import com.Entity.Register;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Register r=context.getBean("reg",Register.class);
		
		
		System.out.println(r);
	}

}
