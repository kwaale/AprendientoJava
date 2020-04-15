package bucles;

import java.util.Scanner;

public class ContadorDigitos {

	public static void main(String[] args) {
		/*
		 * Ejercicio9 Realiza un programa que nos diga cuántos dígitos tiene un
		 * número introducido por teclado.
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("Introdusca un numero: ");
		int numero = s.nextInt();
		

		int digitos = (int) Math.log10(numero) + 1;
		System.out.println("El numero: " + "++" + numero + "++");
		System.out.println("Tiene " + "++" +digitos + "++" +" digitos.");
		s.close();
	}

}
