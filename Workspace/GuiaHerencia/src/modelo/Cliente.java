package modelo;

import java.time.LocalDate;

public class Cliente extends Persona {
	private String cuit;
	private float limiteCredito;

	public Cliente(String nombre, String apellido, long dni, LocalDate fechaNacimiento, String cuit, float limiteCredito) {
		// TODO Auto-generated constructor stub
		super(nombre, apellido, dni, fechaNacimiento);
		this.cuit=cuit;
		this.limiteCredito=limiteCredito;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
	public boolean estadoCredito() {
		return false;
	}
	

}
