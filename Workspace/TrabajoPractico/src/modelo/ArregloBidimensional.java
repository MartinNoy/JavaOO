package modelo;

public class ArregloBidimensional {
	private double[][] matrizA;

	public ArregloBidimensional(double[][] matrizA) {
		super();
		this.matrizA = matrizA;
	}

	public double[][] getmatrizA() {
		return matrizA;
	}

	public void setmatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}
	
	public sumar(double[][] matrizB) {
		double[][] resultado;
		for (int i=0; i<matrizA.length;i++) {
			for(int j=0; j<matrizB[0].length;i++) {
				resultado[i][j]=matrizA[i][j]+matrizB[i][j];
			}
		}
		return resultado;
	}
	
	
	

}
