package de.atcw.springditest;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIDemoApplication {

	public static void main(String[] args) {
		
		System.out.println("DI-Test-Programm");
		
		Meister m = new Meister();
		
		m.gibAnweisung();
		
		
		
		
	}
	
	
	
	
}
