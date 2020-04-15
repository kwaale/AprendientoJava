package herencia;

import java.util.Scanner;

public class Operacion {
	protected Scanner sc;
	protected int valor1;
	protected int valor2;
	protected int resultado;

	public Operacion() {
		sc = new Scanner(System.in);
	}

	public void cargar1() {
		System.out.print("Introduzca valor 1: ");
		valor1 = sc.nextInt();
	}

	public void cargar2() {
		System.out.print("Introduzca valor 2: ");
		valor2 = sc.nextInt();
	}

	public void imprimirResultado() {
		System.out.println("Resultado: " + resultado);
	}
}
