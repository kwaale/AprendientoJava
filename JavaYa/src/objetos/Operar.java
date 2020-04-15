package objetos;

import java.util.Scanner;

public class Operar {
	 //luego los métodos cargar1, cargar2 y mostrarResultado son idénticos a las dos clases,
	
	protected int val1;
	protected int val2;
	protected int resultado;
	Scanner sc = new Scanner(System.in);
	
	public void cargar1() {
		System.out.print("Valor 1: ");
		this.val1 = sc.nextInt();
	}
	public void cargar2() {
		System.out.print("Valor 2: ");
		this.val2 = sc.nextInt();
	}
	public void mostrarResultado() {
		System.out.printf("Resultado = %d",resultado);
	}
}
