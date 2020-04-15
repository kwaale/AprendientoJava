package matrices;

import java.util.Scanner;

public class PosicionFilas {
	// Crear una matriz de n * m filas (cargar n y m por teclado)
	// Intercambiar la primer fila con la segundo. Imprimir luego la matriz.

	private Scanner s = new Scanner(System.in);
	private int mat[][];

	public void carga() {
		System.out.println("Carga Matriz");
		int fila;
		int columna;
		System.out.print("Fila: ");
		fila = s.nextInt();
		System.out.print("Columna: ");
		columna = s.nextInt();
		mat = new int[fila][columna];

		int x = 1;
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				mat[f][c] = x++;
			}
		}
	}

	public void imprimirOriginal() {
		for (int f = 0; f < mat.length; f++) {
			for (int c = 0; c < mat[f].length; c++) {
				System.out.print(mat[f][c] + " | ");
			}
			System.out.println();
		}
	}

	public void intercambioFila1Fila2() {
		int aux;
		System.out.println("Imprimir intercambio");
		
			for (int c = 0; c < mat[0].length; c++) {
				aux = mat[0][c];
				mat[0][c] = mat[0+1][c];
				mat[0+1][c] = aux;
			}

		}

	}


