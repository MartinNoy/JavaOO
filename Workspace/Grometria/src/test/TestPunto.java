package test;
import modelo.*;
public class TestPunto {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	
	Punto punto1 = new Punto(1,1);
	Punto punto2 = new Punto(4,5);
	Punto punto3 = new Punto(16,17);
	Punto punto4 = new Punto(26,19);
	Punto puntoI = punto4;//es un puntero de el punto4
	
	System.out.println(punto1);
	System.out.println(punto2);
	System.out.println(punto3);
	System.out.println(punto4);
	System.out.println(puntoI);
	
	
	System.out.println(punto1.equals(punto2));
	System.out.println(punto3.equals(punto4));
	
	System.out.println("la distancua es " + punto1.calcularDistancia(punto2));
	}
}
