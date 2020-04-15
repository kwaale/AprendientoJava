package vectoresRepaso;

import java.util.Scanner;

public class ReordenarEnTercerArray {
	// Reordenar 2 array en un tercer array. De uno en uno

	private Scanner s = new Scanner(System.in);
	private int num1[] = new int[10];
	private int num2[] = new int[10];
	private int num3[] = new int[20];
	

	public void carga() {
		for (int i = 0; i < num1.length; i++) {
			System.out.print("N" + (i + 1) + ":");
			
			num1[i] = s.nextInt();

		}
		for (int i = 0; i < num2.length; i++) {
			System.out.print("N" + (i + 1) + ":");
			num2[i] = s.nextInt();
		}
	}

	public void cargaArray3() {
		int j = 0;
		for (int i = 0; i < 10; i++) {
			num3[j] = num1[i];
			j++;
			num3[j] = num2[i];
			j++;
		}
	}

	public void pruebaOrden() {
		boolean creciente = false;
		boolean decreciente = false;
		for (int i = 0; i < 19; i++) {
			if (num3[i] > num3[i + 1]) {
				decreciente = true;
			} else {
				if (num3[i] < num3[i + 1]) {
					creciente = true;
				}
			}

		}
		if (creciente == true && decreciente == false) {
			System.out.println("Esta ordenado en forma creciente el array.");
		} else {
			if (creciente == false && decreciente == true) {
				System.out.println("Esta ordenado en forma decreciente el array.");
			} else {
				if (creciente == true && decreciente == true) {
					System.out.println("Esta ordenado en forma desordenada el array.");
				} else {
					if (creciente == true && decreciente == true) {
						System.out.println("Todos los numeros son iguales.");
					}
				}
			}
		}
	}

	public void imprimir() {
		for (int s : num3) {
			System.out.println(s);
		}
	}
}
