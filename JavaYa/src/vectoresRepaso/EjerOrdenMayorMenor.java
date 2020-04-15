package vectoresRepaso;

import java.util.Scanner;

public class EjerOrdenMayorMenor {

	// Cargar un vector de n elementos de tipo entero.
	// Ordenar posteriormente el vector.

	private Scanner s = new Scanner(System.in);
	private int num[];

	public void carga() {
		int tam;
		System.out.print("Introduce tamaño del vector: ");
		tam = s.nextInt();
		num = new int[tam];
		for (int i = 0; i < num.length; i++) {
			System.out.print("N " + (i + 1) + ": ");
			num[i] = s.nextInt();
		}
	}

	public void ordenar() {
		for (int i = 0; i < (num.length - 1); i++) {
			for (int j = 0; j < (num.length - 1); j++) {
				if (num[j] > num[j + 1]) {
					int aux;
					aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;
				}
			}
		}
	}

	public void imprirmir() {
		for (int i : num) {
			System.out.println(i);
		}
	}
}
