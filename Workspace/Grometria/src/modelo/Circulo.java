package modelo;

public class Circulo {
	private Punto origen;
	private double radio;
	
	// el constructor se puede sobrecargar 
	public Circulo(Punto origen, Punto radio) {//este debe resibir un punto origen y un punto radio
		super();
		this.origen = origen;
		this.setRadio(radio);
	}
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public void setRadio(Punto radio) {
		this.radio = origen.calcularDistancia(radio);
	}
	
	
	@Override
	public boolean equals(Circulo C) {
		return ((origen==C.getOrigen())&&(radio==C.getRadio()));
	}
	
	
	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}
	
	
	
	
	public double calcularPerimetro();{
		double perimetro=0;
		
		
		return perimetro;
	}
	
	public double calcularArea();{
		double area=0;
		
		return area;
	}
	
	public double calcularDistancia(Circulo c);{
		double distancia=0;
		
		return distancia;
	}
	

}
