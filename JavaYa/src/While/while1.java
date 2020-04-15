package While;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		/*Escribir un programa que solicite la carga de un valor positivo
		 *  y nos muestre desde 1 hasta el valor ingresado de uno en uno.
		 *  Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números
		 *  del 1 al 30.
		 *  Es de FUNDAMENTAL importancia analizar los diagramas de flujo y la
		 *  posterior codificación en Java de los siguientes problemas,
		 *  en varios problemas se presentan otras situaciones no vistas en el
		 *  ejercicio anterior.*/
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un numero y le dare uno a uno los numeros del 1 al numero introducido");
			
		int n = s.nextInt();
		int x = 1;
		while(x <= n){
			
			System.out.println(x);
			x = x + 1;
		}
		s.close();
		
	}
}
