package matrices;

import java.util.Scanner;

//Crear una matriz de n * m filas (cargar n y m por teclado)
//Imprimir el mayor elemento y la fila y columna donde se almacena.
public class MayorUbicacion {

	private Scanner s = new Scanner(System.in);
	private int fila;
	private int columna;
	private int mat[][];
	

	public void carga() {
		System.out.println("Carga Valores");
		System.out.print("Fila: ");
		fila = s.nextInt();
		System.out.print("Columna: ");
		columna = s.nextInt();
		mat = new int[fila][columna];
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				mat[f][c] = (int)(Math.random()*10);
			}
		}
	}

	public void imprimirOriginal() {
		System.out.println("Original");
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print(mat[f][c] + " | ");
			}
			System.out.println();
		}
	}

	public void imprimirMayorElemento() {
		int mayor = Integer.MIN_VALUE;
		int aux = 0;
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				aux = mat[f][c];
				if(mayor < aux){
					mayor = aux;
					fila = f;
					columna = c;
				}
			}
		}
		System.out.println("Mayor es: " + mayor);
		System.out.println("Posicion: mat" + "[" + fila + "]" + "[" + columna + "]");
	}
	
}
