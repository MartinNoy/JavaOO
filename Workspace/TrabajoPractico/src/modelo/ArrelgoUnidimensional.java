package modelo;

public class ArrelgoUnidimensional {
	private int[] vector;

	public ArrelgoUnidimensional(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	
	public int traerMayor() {
		int mayor = 0;
		for (int i = 0; i <= vector.length ; i++) {
			if (vector[i]>mayor) {
				mayor = vector[i];
			}
		}
		return mayor;
	}
	
	
	public int traerMenor() {
		int menor = vector[0];
		for (int i = 0; i <= vector.length ; i++) {
			if (vector[i]<menor) {
				menor = vector[i];
			}
		}
		return menor;
	}
	
	
	
	public double calcularPromedio() {
		double promedio=0;
		double sumatoria=0;
		
		for (int i = 0; i <= vector.length ; i++) {
			sumatoria=sumatoria+vector[i];
		}
		promedio = sumatoria/vector.length;
		
		return promedio;
	}
	
	public int[] ordenarAscendente() {
		int aux = 0;
		for (int i = 0; i <= vector.length ; i++) {
			if (vector[i] > vector[i+1]) {
				aux = vector[i];
				vector[i] = vector[i+1];
				vector[i+1] = aux;
			}
		}
		
		return vector;
		
	}
	
	
	public int[] ordenarDescendente() {
		int aux = 0;
		for (int i = 0; i <= vector.length ; i++) {
			if (vector[i] > vector[i+1]) {
				aux = vector[i];
				vector[i] = vector[i+1];
				vector[i+1] = aux;
			}
		}
		
		return vector;
		
	}
	
	
	
	
	
	
	public double traerFrecuencia(int numero) {
		double frecuencia = 0;
		int cont=0;
		
		for (int i = 0; i <= vector.length ; i++) {
			if (numero == vector[i]) {
				cont = cont++;
			}
			
		}
		
		frecuencia = cont/vector.length;
		
		return frecuencia;
	}
	
	
	public int traerModa() {
		int moda = 0;
		int contador = 0;
		
		for (int i=0 ; i <= vector.length ; i++) {
			
			for (int j=0 ; j <= vector.length ; i++) {
				
			}
		}
		
		
		
		return moda;
	}

}
