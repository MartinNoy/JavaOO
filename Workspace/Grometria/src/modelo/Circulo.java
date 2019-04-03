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
	//metodo sobreescrito
	public void setRadio(Punto radio) {
		this.radio = origen.calcularDistancia(radio);
	}

	public boolean equals(Circulo C) {
		return ((origen==C.getOrigen())&&(radio==C.getRadio()));
	}
	
	
	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}
	
	
	
	
	public double calcularPerimetro(){
		double perimetro;
		
		perimetro = (2*Math.PI)*radio;
		
		return perimetro;
	}
	
	public double calcularArea(){
		double area;
		
		area = Math.PI * (Math.pow(radio, 2));
		
		return area;
	}
	
	public double calcularDistancia(Circulo c){
		double distancia;
		
		double x1 = origen.getX();
		double x2 = c.getOrigen().getX();
		double y1 = origen.getY();
		double y2 = c.getOrigen().getY();
		
		distancia = Math.sqrt((Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)));
		
		return distancia;
	}
	

}
