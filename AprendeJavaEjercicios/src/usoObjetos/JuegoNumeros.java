package usoObjetos;

public class JuegoNumeros {
	// Realiza un programa que vaya pidiendo n�meros hasta que se introduzca
	// un numero negativo y nos diga cuantos n�meros se han introducido
	// la media de los impares y el mayor de los pares.
	// El n�mero negativo s�lo se utiliza para indicar
	// el final de la introducci�n de datos pero no se incluye en el c�mputo.
	public static void main(String[] args) { 
	System.out.print("N�meros primos entre 2 y 100: ");

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
