package primo;

import java.util.Scanner;

public class PrubaPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un numero para probar si es primo: ");
		int numero = sc.nextInt();
		boolean primo = true;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
			}
		}

		if (primo) {
			System.out.printf("El numero *%d* es primo.", numero);
		} else {
			System.out.printf("El numero %d no es primo.", numero);
		}

	}

}
