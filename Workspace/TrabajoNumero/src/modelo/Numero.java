package modelo;

public class Numero {
	private int N;

	public Numero(int N) {
		this.N = N;
	}

	public int getN() {
		return N;
	}

	public void setN(int N) {
		this.N = N;
	}
	
	public int sumar(int N1) {
		
		return  N+N1;
	
	}
	
	public int multiplicar(int N1) {

		return N*N1;
		
	}
	
	public boolean esPar() {
		boolean bandera;
		if(N%2==1) {
			bandera= false;
		}else {
			bandera= true;
		}
		
		return bandera;
	}
	
	public boolean esPrimo() {
		int resultado = 1;
		
        for (int i = 1; i <= N; i++) {
            resultado *= i;
        }
 
		 if(resultado%N==0) {
			 return true;
		 }else {
			 return false;
		 }
		
	}
	
	public String convertirAString() {
		
		return String.valueOf(N);
	
	}
	
	public double convertirADouble() {
		
		return Double.parseDouble(convertirAString());
		
	}
	
	public double calcularPotencia(int exp) {
		
		return Math.pow(N, exp);
	}
	
	public String pasarABase2() {
	
		return Integer.toBinaryString(N);
	}

	
	
	public int calcularFactorial () {
		int resultado = 1;
		if(N>0) {
			for (int i = 1; i <= N; i++) {
	            resultado =resultado * i;
	        }
		}else {
			resultado = 0;
		}
		
		return resultado;
	}
	
	//sobrecarga de metodo
	public int calcularFactorial (int n1) {
		int resultado = 1;
		if(n1>0) {
			for (int i = 1; i <= n1; i++) {
	            resultado =resultado * i;
	        }
		}else {
			resultado = 0;
		}
		
		return resultado;
	}
	

	public int numeroCombinatorio(int n1) {
		int combinatorio = -1;
		if(N>n1) {
			combinatorio=calcularFactorial(N)/(calcularFactorial(n1)*(calcularFactorial(N)-calcularFactorial(n1)));
		}
		return combinatorio;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
