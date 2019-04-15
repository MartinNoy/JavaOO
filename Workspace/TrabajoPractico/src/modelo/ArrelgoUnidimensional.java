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
	
	
	public int[] ordenar() {
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
		
		
		
		return moda;
	}

}
