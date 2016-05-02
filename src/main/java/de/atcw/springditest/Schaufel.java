package de.atcw.springditest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Schaufel implements IGrabable{

	public Schaufel(){
		System.out.println("Ich bin die Schaufel");
	}
	
	public void grab() {
		System.out.println("Grab grab grab ... (Schaufeln können eigentlich garnicht sprechen.)");
		
	}

}
