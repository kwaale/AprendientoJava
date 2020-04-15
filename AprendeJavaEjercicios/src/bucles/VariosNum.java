package bucles;

import java.util.Scanner;

public class VariosNum {

	public static void main(String[] args) {
		// Realiza un programa que vaya pidiendo n�meros hasta que se introduzca
		// un numero negativo y nos diga cuantos n�meros se han introducido
		// la media de los impares y el mayor de los pares.
		// El n�mero negativo s�lo se utiliza para indicar
		// el final de la introducci�n de datos pero no se incluye en el
		// c�mputo.

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int conPar = 0;
		int sumPar = 0;
		int conImp = 0;
		int sumImp = 0;
		int mediaImp = 0;
		int maxPar = 0;

		int contador = 0;

		do {
			System.out.print("Introduzca numeros por teclado, finaliza con algun numero negativo: ");
			num = scan.nextInt();
			if (num > 0) {

				contador++;

				if (num % 2 == 0) {
					if (num > maxPar) {
						maxPar = num;
					}
					conPar++;
					sumPar += num;
				} else {
					conImp++;
					sumImp += num;
				}

			}
		}

		while (num > 0);

		mediaImp = sumImp / conImp;
		System.out.println("Suma impar: " + sumImp);
		System.out.println("Cantidad de numeros introducidos: " + contador);
		System.out.println("Maximo par: " + maxPar);
		System.out.println("Media impares: " + mediaImp);
		System.out.println("Cantidad de numeros pares: " + conImp);
		System.out.println("Suma pares: " + sumPar);
		System.out.println("Cantidad de numeros impares: " + conPar);

		scan.close(); 
	}

}
