package empleadoPerson;

import java.util.Scanner;

public class Persona {
	//Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
	//Definir como responsabilidades un método que cargue los datos personales
	//y otro que los imprima.
	
	protected Scanner sc;
	protected String nombre;
	protected int edad;
	
	public Persona(){
		sc = new Scanner(System.in);
	}
	public void carga(){
		System.out.print("Nombre: ");
		nombre = sc.next();
		System.out.print("Edad: ");
		edad = sc.nextInt();
	}
	public void imprimir(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
}
