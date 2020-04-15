package bucles;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Este programa calcula la media de todos los numeros que introduzca.");
		System.out.println("Para parar introduzca un numero negativo.");

		double numeros = 0;
		double suma = 0;
		double numIntro = 0;
do{
	
	// Cuenta cantidad de los numeros (Ser resta uno porque cuenta el negativo tambien.)
	numeros++;
	// Va sumando cada numero que se introduce.
	suma += numIntro;
	numIntro = s.nextDouble();
}
		while (numIntro >= 0);

		System.out.println("Cantidad de numeros introducidos: " + (numeros - 1));
		System.out.println("Suma : " + suma);
		System.out.println("La media de los numeros introducidos es " + suma / (numeros - 1));
		
		s.close();
	}

}
