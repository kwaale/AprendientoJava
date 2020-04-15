package ejerciciosTema6;

public class NumPrimo {
	public static void main(String[] args) {
		// Numero Primo
		// Se dice que un entero positivo es primo si puede dividirse solamente por 1 y
		// por sí mismo.
		// Por ejemplo, 2, 3, 5 y 7 son primos, pero 4, 6, 8 y 9 no. Por definición, el
		// número 1 no es primo.
		// a) Escriba un método que determine si un número es primo.
		// b) Use este método en una aplicación que determine y muestre en pantalla
		// todos los números
		// primos menores que 10,000.
		// ¿Cuántos números hasta 10,000 tiene que probar para asegurarse de encontrar
		// todos los números primos?
		// c) Al principio podría pensarse que n/2 es el límite superior para evaluar si
		// un número nes primo,
		// pero sólo es necesario ir hasta la raíz cuadrada de n. Vuelva a escribir el
		// programa y ejecútelo de ambas formas.

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
