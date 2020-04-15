package vectoresRepaso;

import java.util.Scanner;

public class VectorSum {
	// Desarrollar un programa que permita ingresar un vector de n
	// elementos, ingresar n por teclado. Luego imprimir la suma de
	// todos sus elementos
	private Scanner s = new Scanner(System.in);
	private int[] num;

	public void carga() {
		System.out.print("Cuantos valores va a cargar: ");
		int cant = s.nextInt();
		num = new int[cant];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Introduzca valor: ");
			num[i] = s.nextInt();
		}
	}

	public void mostrarSuma() {
		System.out.println();
		System.out.print("Array Original: ");
		int suma = 0;
		for (int i = 0; i < num.length; i++) {
			suma += num[i];
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("Total suma: " + suma);
	}
}
