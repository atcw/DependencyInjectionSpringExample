package de.atcw.springditest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Lehrling {

	
	IGrabable grabgeraet;
	
	@Autowired
	Lehrling(IGrabable grabgeraet){
		this.grabgeraet = grabgeraet;
		System.out.println("Ich bin der Lehrling und habe die ["+ grabgeraet.getClass() + "]");
	}
	
	public void buddelleLoch() {
		System.out.println("Ich bin der Lehrling gehorche und grabe mit meinem Grabgerät");
		grabgeraet.grab();
		
	}

}
