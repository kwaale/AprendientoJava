package vectoresRepaso;

import java.util.Scanner;

public class Sueldos {
	// Se desea almacenar los sueldos de operarios.
	// Cuando se ejecuta el programa se debe pedir la cantidad de sueldos
	// a ingresar. Luego crear un vector con dicho tamaño.
	private Scanner s;
	private int[] sueldos;

	public void cargar() {
		s = new Scanner(System.in);
		System.out.print("Cuantos sueldos cargara: ");
		int cant = s.nextInt();
		sueldos = new int[cant];
		for (int i = 0; i < sueldos.length; i++) {
			System.out.print("Ingrese sueldo: ");
			sueldos[i] = s.nextInt();
		}
	}
	public void imprimir() {
		System.out.println("---Sueldos---");
		int x = 0;
		for (int i = 0; i < sueldos.length; i++) {
			x++;
			System.out.println(x + " " + sueldos[i]);
		}
	}
}
