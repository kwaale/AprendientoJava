package bucles;

import java.util.Scanner;

public class CajaF4cifras {

	public static void main(String[] args) {
		/*
		 * Realiza el control de acceso a una caja fuerte. La combinaci�n ser�
		 * un n�mero de 4cifras. El programa nos pedir� la combinaci�n para
		 * abrirla. Sino acertamos,se nos mostrar� el mensaje
		 * �Losiento,esanoeslacombinaci�n� y si acertamos se nos dir� �La caja
		 * fuerte se ha abierto satisfactoriamente�. Tendremos cuatro
		 * oportunidades para abrir la caja fuerte.
		 */

		Scanner s = new Scanner(System.in);
		System.out.printf("Esta es una caja fuerte %nIntroduzca una contrase�as de 4 digitos");
		int clave = s.nextInt();
		int combinacion = 2424;
		int x = 0;

		if (clave == combinacion) {
			System.out.printf("***CORRECTO***%n**ABRIO LA CAJA**%n***CORRECTO***");
		} else {
			System.out.printf("*****ERRROR: La clave que introdujo no es correcta.%nIntente de nuevo.");

			// While para epetiion 4 veces.
			while (x < 2) {
				clave = s.nextInt();
				x++;
				if (clave == combinacion) {
					System.out.printf("***CORRECTO***%n**ABRIO LA CAJA**%n***CORRECTO***");
				} else {
					System.out.printf("*****ERRROR: La clave que introdujo no es correcta.%nIntente de nuevo.");

				}
			}

			clave = s.nextInt();
			if (clave == combinacion) {
				System.out.printf("***CORRECTO***%n**ABRIO LA CAJA**%n***CORRECTO***");
			} else {
				System.out.println("*****ERRROR: La clave que introdujo no es correcta.");
				System.out.println("*****SUPERADO EL LIMITE DE INTENTOS.******");
			}
		}
		s.close();
	}
}
