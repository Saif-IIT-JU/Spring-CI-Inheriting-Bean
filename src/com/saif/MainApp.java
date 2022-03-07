package com.saif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String []args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	Employee e1 = (Employee)context.getBean("e2");
	e1.display();
	}
}
