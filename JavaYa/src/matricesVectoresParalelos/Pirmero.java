package matricesVectoresParalelos;

import java.util.Scanner;

public class Pirmero {
	// Se tiene la siguiente información:
	// · Nombres de 4 empleados.
	// · Ingresos en concepto de sueldo, cobrado por cada empleado,
	// en los últimos 3 meses.

	// Confeccionar el programa para:

	// a) Realizar la carga de la información mencionada.
	// b) Generar un vector que contenga el ingreso acumulado en
	// sueldos en los últimos 3 meses para cada empleado.

	// c) Mostrar por pantalla el total pagado en sueldos a
	// todos los empleados en los últimos 3 meses
	// d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado

	private Scanner s = new Scanner(System.in);
	private String nombres[] = new String[4];
	private int sueldos[][] = new int[4][3];
	private int sueldosTot[] = new int[4];
	private int totalSueldos;

	public void carga() {
		
		System.out.println("Carga Nombres");
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre " + (i + 1) + ": ");
			nombres[i] = s.next();
		}
		System.out.println("Carga de Sueldos");
		for (int f = 0; f < sueldos.length; f++) {
			for (int c = 0; c < sueldos[f].length; c++) {
				System.out.print("Sueldo " + (c+1) + " de " + nombres[c] + ": ");
				sueldos[f][c] = (int)(Math.random()*10);
			}
		}
	}

	public void sumaSueldo() {
		for (int f = 0; f < sueldos.length; f++) {
			int suma = 0;
			for (int c = 0; c < sueldos[f].length; c++) {
				suma = suma + sueldos[f][c];
				totalSueldos = +suma;
			}
			sueldosTot[f] = suma;
		}
	}
	public void ImprimirTodo() {
		System.out.println();
		for (int f = 0; f < sueldos.length; f++) {
			System.out.print("Nombre: ");
			System.out.print(nombres[f]);
			for (int c = 0; c < sueldos[f].length; c++) {
				System.out.printf("| %3d |",sueldos[f][c]);
			}
			System.out.printf("Sueldo total | %d |",sueldosTot[f]);
			System.out.println();
		}
		System.out.println("Sueldos Total: " + totalSueldos);
	}
	public void empleadoMayorSueldl(){
		int mayor = sueldosTot[0];
		int posision = 0;
		for (int f = 0; f < sueldosTot.length-1; f++) {
			if(mayor < sueldosTot[f+1]){
				mayor = sueldosTot[f+1];
				posision = f+1;
			}
		}
	System.out.println("El empleado con mayor sueldo es; " + nombres[posision]);
	System.out.println("Su sueldo es; " + mayor);
	}
	public static void main(String[] args) {
		Pirmero suel = new Pirmero();
		suel.carga();
		suel.sumaSueldo();
		suel.ImprimirTodo();
		suel.empleadoMayorSueldl();
	}
}
