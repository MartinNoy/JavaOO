package modelo;

import java.util.Arrays;

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
	
	public void imprimirMatriz(double[][]Matriz) {
		for (int i=0 ; i<Matriz.length;i++) {
			for (int j=0 ; j<Matriz.length ; j++) {
				System.out.println(Matriz[i][j]);
			}
		}
	}
	

	public double[][] sumar(double[][] matrizB) {
		double[][] resultado = new double [matrizB.length][matrizB[0].length];
		for (int i=0; i<matrizB.length;i++) {
			for(int j=0; j<matrizB[0].length;i++) {
				resultado[i][j]=matrizA[i][j]+matrizB[i][j];
			}
		}
		return resultado;
	}
	
	public double[][] restar(double[][] matrizB) {
		double[][] resultado = new double [matrizB.length][matrizB[0].length];
		for (int i=0; i<matrizB.length;i++) {
			for(int j=0; j<matrizB[0].length;i++) {
				resultado[i][j]=matrizA[i][j]-matrizB[i][j];
			}
		}
		return resultado;
	}
	
	
	public double[][] traspuesta(){
		double[][] transpuesta = new double [matrizA[0].length][matrizA.length];
		
		for (int i = 0; i<=matrizA[0].length;i++) {
			for (int j = 0; j<=matrizA.length; j++) {
				transpuesta[i][j] = matrizA[j][i];
			}
		}
		return transpuesta;
	}
 	
	

}
