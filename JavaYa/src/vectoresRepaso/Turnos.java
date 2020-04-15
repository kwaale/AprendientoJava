package vectoresRepaso;

import java.util.Scanner;

public class Turnos {
	// Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8
	// empleados
	// (4 por la mañana y 4 por la tarde)
	// Confeccionar un programa que permita almacenar los sueldos
	// de los empleados agrupados por turno.
	// Imprimir los gastos en sueldos de cada turno.
	private Scanner s = new Scanner(System.in);
	private int sueldoMañana[] = new int[4];
	private int sueldoTarde[] = new int[4];

	public void cargaSueldos() {
		System.out.println("Cargar los 4 sueldos turno mañana:");
		for (int i = 0; i < sueldoMañana.length; i++) {
			sueldoMañana[i] = s.nextInt();
		}
		System.out.println("Cargar los 4 sueldos turno tarde:");
		for (int i = 0; i < sueldoTarde.length; i++) {
			sueldoTarde[i] = s.nextInt();
		}
	}

	public void gastos() {
		int sumMañana = 0;
		int sumTarde = 0;
		for (int i = 0; i < sueldoMañana.length; i++) {
			sumMañana += sueldoMañana[i];
		}
		for (int i = 0; i < sueldoTarde.length; i++) {
			sumTarde += sueldoTarde[i];
		}
		System.out.println("Gastos en sueldos turno mañana: " + sumMañana);
		System.out.println("Gastos en sueldos turno tarde: " + sumTarde);
	}
}
