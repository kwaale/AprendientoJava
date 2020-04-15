package primero;

import java.util.Scanner;

public class Perro {
	String nombre;
	String raza;
	int edad;
	Scanner sc;
	
	
	public void setAtributo(String nombre, String raza, int edad){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	public void comer(){
		System.out.println("El perro come");
	}
	public static void ma in(String[] args) {
		Perro chispa = new Perro();
		Scanner sc = new Scanner(System.in);
		System.out.println("Valores");
		chispa.setAtributo(sc.next(), sc.next(), sc.nextInt());;
		
		System.out.println("El perro se llama " + chispa.nombre + " es de raza " + chispa.raza + " y tiene " + chispa.edad + " años");
	}
}
