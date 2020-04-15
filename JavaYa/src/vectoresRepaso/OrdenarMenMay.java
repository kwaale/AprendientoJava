package vectoresRepaso;

import java.util.Scanner;

public class OrdenarMenMay {
	// Se debe crear un vector donde almacenar 5 sueldos.
	// Ordenar el vector sueldos de menor a mayor.

	private Scanner s = new Scanner(System.in);
	private int[] sueldos = new int[5];

	public void carga() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Sueldo:" + i+1 + ": ");
			sueldos[i] = s.nextInt();
		}
	}
	public void ordenarMenMay() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (sueldos[j] > sueldos[j + 1]) {
					int aux;
					aux = sueldos[j];
					sueldos[j] = sueldos[j + 1];
					sueldos[j + 1] = aux;
				}
			}
		}
	}
	public void imprimir() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println(sueldos[i]);
		}
	}
}
