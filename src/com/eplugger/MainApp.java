package com.eplugger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * mainApp¿‡
 * @author Administrator
 *
 */
public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean(HelloWorld.class);
		helloWorld.getMessage();
		helloWorld.print();
	}
}
