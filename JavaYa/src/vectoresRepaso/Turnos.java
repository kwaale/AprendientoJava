package vectoresRepaso;

import java.util.Scanner;

public class Turnos {
	// Una empresa tiene dos turnos (ma�ana y tarde) en los que trabajan 8
	// empleados
	// (4 por la ma�ana y 4 por la tarde)
	// Confeccionar un programa que permita almacenar los sueldos
	// de los empleados agrupados por turno.
	// Imprimir los gastos en sueldos de cada turno.
	private Scanner s = new Scanner(System.in);
	private int sueldoMa�ana[] = new int[4];
	private int sueldoTarde[] = new int[4];

	public void cargaSueldos() {
		System.out.println("Cargar los 4 sueldos turno ma�ana:");
		for (int i = 0; i < sueldoMa�ana.length; i++) {
			sueldoMa�ana[i] = s.nextInt();
		}
		System.out.println("Cargar los 4 sueldos turno tarde:");
		for (int i = 0; i < sueldoTarde.length; i++) {
			sueldoTarde[i] = s.nextInt();
		}
	}

	public void gastos() {
		int sumMa�ana = 0;
		int sumTarde = 0;
		for (int i = 0; i < sueldoMa�ana.length; i++) {
			sumMa�ana += sueldoMa�ana[i];
		}
		for (int i = 0; i < sueldoTarde.length; i++) {
			sumTarde += sueldoTarde[i];
		}
		System.out.println("Gastos en sueldos turno ma�ana: " + sumMa�ana);
		System.out.println("Gastos en sueldos turno tarde: " + sumTarde);
	}
}
