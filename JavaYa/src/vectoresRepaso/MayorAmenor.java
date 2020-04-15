package vectoresRepaso;

import java.util.Scanner;

public class MayorAmenor {
	// Desarrollar un programa que permita cargar 5 nombres de personas
	// y sus edades respectivas. Luego de realizar la carga por teclado
	// de todos los datos imprimir los nombres de las personas mayores de edad
	// (mayores o iguales a 18 años)
	// mismo está ordenado de menor a mayor.
	private Scanner s = new Scanner(System.in);
	private String[] nombre = new String[5];
	private int[] edad = new int[5];

	public void carga() {
		//carga nombres y edades.
		for (int i = 0; i < 5; i++) {
			System.out.println("Nombre: ");
			nombre[i] = s.next();
			System.out.println(nombre[i] + "Edad: " );
			edad[i]= s.nextInt();
		}
	}
	public void imprimirMayores(){
		System.out.println("Los mayores a 18 años son: ");
		for (int i = 0; i < 5; i++) {
			if(edad[i] >= 18){
				System.out.println(nombre[i]);
			}
		}
	}
	
}
