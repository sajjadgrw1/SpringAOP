package org.sajjad.springAopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("bean.xml");

	       Student student = (Student) context.getBean("student");

	       student.getName();
	       student.getAge();
	       
	       student.ExceptionRaised();
	}

}
