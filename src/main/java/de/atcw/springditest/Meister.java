package de.atcw.springditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.beans.factory.BeanFactory;

public class Meister {

	Lehrling l;
	
	
	Meister(){
		System.out.println("Ich bin der Meister...");
		
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("SpringDependencyInjection.xml");
		System.out.println("... und habe Geister, die mir helfen");
		
		System.out.println("Ich, der Meister habe einen Lehrling!");
		
		l = beanFactory.getBean(Lehrling.class); 
		
		//System.out.println("Ich, der Meister habe einen Lehrling!");
		
	}
	
	public void gibAnweisung(){
		System.out.println("Ich, der Meister gebe meinem Lehrling einen Befehl!");
		l.buddelleLoch();
	}
	
}
