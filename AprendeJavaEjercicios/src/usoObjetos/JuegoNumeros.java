package usoObjetos;

public class JuegoNumeros {
	// Realiza un programa que vaya pidiendo números hasta que se introduzca
	// un numero negativo y nos diga cuantos números se han introducido
	// la media de los impares y el mayor de los pares.
	// El número negativo sólo se utiliza para indicar
	// el final de la introducción de datos pero no se incluye en el cómputo.
	public static void main(String[] args) { 
	System.out.print("Números primos entre 2 y 100: ");

	boolean esPrimo = true;

	for(int n = 2;n<=100;n++){

		// comprueba si n es primo

		esPrimo = true; 

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				esPrimo = false;

			}

		}

		// si n es primo, se muestra por pantalla

		if (esPrimo) {

			System.out.print(n + " ");

		}

	}



}

}
