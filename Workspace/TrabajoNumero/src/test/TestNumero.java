package test;
import modelo.*;

public class TestNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numero n1 = new Numero(7);
		
		System.out.println(n1.sumar(2));
		System.out.println(n1.multiplicar(4));
		System.out.println(n1.esPar());
		System.out.println(n1.esPrimo());
		System.out.println(n1.convertirAString());
		System.out.println(n1.convertirADouble());
		System.out.println(n1.calcularPotencia(4));
		System.out.println(n1.pasarABase2());
		System.out.println(n1.calcularFactorial());
		
		System.out.println("------Objeto impreso sin ToString sobreescrito------");
		System.out.println(n1);
		

	}

}
