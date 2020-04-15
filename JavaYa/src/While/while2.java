package While;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca 10 valores por teclado, le daremos la suma y el promedio: ");
		int x = 0;
		int n;
		double suma = 0;

		while (x < 10) {
			n = s.nextInt();
			suma += n;
			x++;

		}
		System.out.println("Suma: " + suma);
		System.out.println("Promedio: " + suma / 10);
		s.close();
	}

}
