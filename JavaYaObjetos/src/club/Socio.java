package club;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	
	public Socio(Scanner sc){
		System.out.print("Nombre del socio: ");
		this.nombre = sc.next();
		System.out.print("Antiguedad del socio: ");
		this.antiguedad = sc.nextInt();
	}
	public int retAntiguedad(){
		return antiguedad;
	}
	public void imprimir(){
		System.out.println(nombre + " tiene una antiguedad de " + antiguedad + " años.");
	}
}
