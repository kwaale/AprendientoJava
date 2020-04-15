package ejerciciosTema6;

import java.util.Scanner;

public class Minimo3 {
	//Escriba un método llamado minimo3 que devuelva el menor de tres números de punto flotante.
	//Use el método Math.min para implementar minimo3.
	//Incorpore el método en una aplicación que reciba como entrada tres
	//valores por parte del usuario, determine el valor menor y muestre el resultado. 
	private float a;
	private float b;
	private float c;
	
	public Minimo3(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	public void minimo(float a, float b, float c) {
		float res = Math.min(c, Math.min(a, b));
		System.out.printf("El menor entre %.2f, %.2f, %.2f, es %.2f",a,b,c,res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdusca Valor: ");
		float a = sc.nextFloat();
		System.out.print("Introdusca Valor: ");
		float b = sc.nextFloat();
		System.out.print("Introdusca Valor: ");
		float c = sc.nextFloat();
		
		Minimo3 m = new Minimo3(a,b,c);
		m.minimo(a, b, c);
		
		

	}
}
