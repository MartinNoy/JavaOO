package modelo;

import java.time.LocalDate;

public class Empleado extends Persona {
	private long legajo;
	private float sueldoMensual;
	
	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo, float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.legajo=legajo;
		this.sueldoMensual=sueldoMensual;
	}

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	
	public float calcularSueldo(int diasAusente) {
		float sueldo;
		float sueldoXDia;
		sueldoXDia=sueldoMensual/20;
		sueldo = sueldoMensual-(sueldoXDia*diasAusente);
		
		return sueldo;
	}
	
	

}
