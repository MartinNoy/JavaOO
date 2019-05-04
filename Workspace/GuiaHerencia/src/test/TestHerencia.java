package test;

import java.time.LocalDate;

import modelo.*;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona personas[] = new Persona[3];//Array de personas
		 
		
		
		personas[0] = new Persona(null, null, 0, null);
		personas[1] = new Empleado(null, null, 0, null, 0, 0);
		personas[2] = new Cliente(null, null, 0, null, null, 0);
	}

}
