package matrices;

import java.util.Scanner;

public class Vertices {
	// Crear una matriz de n * m filas (cargar n y m por teclado)
	// Imprimir los cuatro valores que se encuentran en los vértices
	// de la misma (mat[0][0] etc.)

	private Scanner s = new Scanner(System.in);
	private int fila;
	private int columna;
	private int mat[][];

	public void carga() {
		int x = 1;
		System.out.println("Carga");

		System.out.print("Fila: ");
		fila = s.nextInt();
		System.out.print("Columna: ");
		columna = s.nextInt();
		mat = new int[fila][columna];

		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				mat[f][c] = x++;
			}
		}
	}
	public void imprimirOriginal(){
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print(mat[f][c] + " | ");
			}
			System.out.println();
		}
	}
	public void imprimirVertices(){
				
		System.out.println("Vertice 1: " + mat[0][0]);
		System.out.println("Vertice 2: " + mat[0][mat[0].length-1]);
		System.out.println("Vertice 3: " + mat[mat.length-1][mat[0].length-1]);
		System.out.println("Vertice 4: " + mat[mat.length-1][0]);
	}
}
