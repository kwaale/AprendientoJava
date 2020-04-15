package objetos;

import java.util.Scanner;

public class Socio {
	// Plantear una clase Club y otra clase Socio.
	// La clase Socio debe tener los siguientes atributos privados: nombre y la
	// antigüedad en el club
	// (en años).
	// En el constructor pedir la carga del nombre y su antigüedad.
	// La clase Club debe tener como atributos 3 objetos de la clase Socio.

	// Definir una responsabilidad para imprimir el nombre del socio con mayor
	// antigüedad en el club.

	private String nombre;
	private int antiguedad;

	public Socio(Scanner entrada) {
		System.out.println("Nombre socio: ");
		this.nombre = entrada.next();
		System.out.println("Antiguedad del socio: ");
		this.antiguedad = entrada.nextInt();
	}

	public void imprimir() {
		System.out.printf("El socio %s tiene una antiguedad de %d años.%n", this.nombre, this.antiguedad);
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}
}
