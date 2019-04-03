package modelo;

public class Punto {
	
	private double x;
	private double y;
	
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	
	public boolean equals(Punto p) {
		return ((x==p.getX())&&(y==p.getY()));
	}


	@Override
	public String toString() {
		return "("+x+";"+y+")";
	}
	
	
	public double calcularDistancia(Punto p) {
		
		double cateto1 = x - p.getX();
		double cateto2 = y - p.getY();
		double distancia = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		return distancia;
	
	}
	

}