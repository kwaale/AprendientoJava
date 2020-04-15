package objetos;

import java.util.Scanner;

public class Persona {
	//Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
	//Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
	
	protected String nombre;
	protected int edad;
	Scanner sc = new Scanner(System.in);
	
	public void cargarDatos() {
		System.out.print("Nombre: ");
		this.nombre = sc.next();
		System.out.print("Edad: ");
		this.edad = sc.nextInt();
	}
	
	public void imprimir() {
		System.out.printf("Nombre: %S, Edad: %s",this.nombre,this.edad);
	}
}
