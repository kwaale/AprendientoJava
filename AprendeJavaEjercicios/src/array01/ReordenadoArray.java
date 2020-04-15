package array01;

import java.util.Scanner;

public class ReordenadoArray {
	// Escribe un programa que pida 8 palabras y las almacene en un array.
	// A continuación, las palabras correspondientes a colores se deben
	// almacenar
	// al comienzo y las que no son colores a continuación.
	// Puedes utilizar tantos arrays auxiliares como quieras.
	// Los colores que conoce el programa deben estar en otro array
	// y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
	// blanco y morado.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] color = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		String[] aux = new String[8];
		String[] resultado = new String[8];
		int j = 0;
		for (int i = 0; i < 8; i++) {
			System.out.println("Introduzca una palabra: ");
			aux[i] = s.next();

			// for each
			for (String c : color) {
				if (aux[i].equals(c)) {
					resultado[j++] = c;
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			boolean esColor = false;
			for (String c : color) {
				if (aux[i].equals(c)) {
					esColor = true;
				}
			}
			if (!esColor) {
				resultado[j++] = aux[i];
			}
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(aux[i] + " ");
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(resultado[i] + " ");
		}
		s.close();
	}
}
