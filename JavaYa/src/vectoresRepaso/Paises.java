package vectoresRepaso;

import java.util.Scanner;

public class Paises {
	// Definir un vector donde almacenar los nombres de 5 paises.
	// Confeccionar el algoritmo de ordenamiento alfabético.
	private Scanner s = new Scanner(System.in);
	private String[] paises = new String[5];

	public void carga() {
		System.out.println("Carga paises");
		for (int i = 0; i < paises.length; i++) {
			System.out.print("Nombra un pais: ");
			paises[i] = s.next();
		}
	}

	public void ordenamiento() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (paises[j].compareTo(paises[j + 1]) > 0) {
					String aux;
					aux = paises[j];
					paises[j] = paises[j + 1];
					paises[j + 1] = aux;
				}
			}
		}
	}
	public void imprimir(){
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}
	}
}
