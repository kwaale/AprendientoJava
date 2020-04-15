package objetos;

import java.util.Scanner;

public class Socio {
	// Plantear una clase Club y otra clase Socio.
	// La clase Socio debe tener los siguientes atributos privados: nombre y la
	// antig�edad en el club
	// (en a�os).
	// En el constructor pedir la carga del nombre y su antig�edad.
	// La clase Club debe tener como atributos 3 objetos de la clase Socio.

	// Definir una responsabilidad para imprimir el nombre del socio con mayor
	// antig�edad en el club.

	private String nombre;
	private int antiguedad;

	public Socio(Scanner entrada) {
		System.out.println("Nombre socio: ");
		this.nombre = entrada.next();
		System.out.println("Antiguedad del socio: ");
		this.antiguedad = entrada.nextInt();
	}

	public void imprimir() {
		System.out.printf("El socio %s tiene una antiguedad de %d a�os.%n", this.nombre, this.antiguedad);
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}
}
