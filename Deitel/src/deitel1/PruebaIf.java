package deitel1;

import java.util.Scanner;

public class PruebaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calificacion;
		int aprobados = 1;
		int desaprobados = 1;
		double promedio;
		int suma = 0;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);

		while (contador < 10) {
			System.out.print("Ingrese la calificacion: ");
			calificacion = sc.nextInt();
			if (calificacion >= 60) {
				aprobados++;
			} else {
				desaprobados++;
			}
			suma += calificacion;
			contador++;
			sc.close();
		}
		promedio = (double)suma/contador;
		System.out.printf("El total de calificaciones fue %d y el promedio %.2f%n",suma,promedio);
		System.out.printf("Aprobaron %d y reprobaron %d%n",aprobados,desaprobados);
	}

}
