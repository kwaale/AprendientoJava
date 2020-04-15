package ejerciciosTema6;

public class NumPrimo {
	public static void main(String[] args) {
		// Numero Primo
		// Se dice que un entero positivo es primo si puede dividirse solamente por 1 y
		// por s� mismo.
		// Por ejemplo, 2, 3, 5 y 7 son primos, pero 4, 6, 8 y 9 no. Por definici�n, el
		// n�mero 1 no es primo.
		// a) Escriba un m�todo que determine si un n�mero es primo.
		// b) Use este m�todo en una aplicaci�n que determine y muestre en pantalla
		// todos los n�meros
		// primos menores que 10,000.
		// �Cu�ntos n�meros hasta 10,000 tiene que probar para asegurarse de encontrar
		// todos los n�meros primos?
		// c) Al principio podr�a pensarse que n/2 es el l�mite superior para evaluar si
		// un n�mero nes primo,
		// pero s�lo es necesario ir hasta la ra�z cuadrada de n. Vuelva a escribir el
		// programa y ejec�telo de ambas formas.

		int sum = 0;
		int con = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum++;
				}
			}
			if (sum == 2) {
				con++;
				System.out.println("Primo " + i + " " + con);
			
			}
			sum = 0;
		}
	}
}
