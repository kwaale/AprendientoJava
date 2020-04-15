package banco;

import java.util.Scanner;

public class Banco {
	Cliente c1, c2, c3;
	Scanner sc = new Scanner(System.in);
	
	public Banco(){
		System.out.print("Nombre del Cliente: ");
		c1 = new Cliente(sc.next());
		System.out.print("Nombre del Cliente: ");
		c2 = new Cliente(sc.next());
		System.out.print("Nombre del Cliente: ");
		c3 = new Cliente(sc.next());
	}
	public void operar(){
		c1.depositar(100);
		c2.depositar(250);
		c3.depositar(80);
		c1.extraer(100);
		c2.extraer(300);
	}
	public void saldosTotales(){
		int total;
		total = c1.retornoSaldo()+c2.retornoSaldo()+c3.retornoSaldo();
		System.out.println("Saldo total en banco es de: " + total);
		c1.imprimirSaldo();
		c2.imprimirSaldo();
		c3.imprimirSaldo();
		
	}
	public static void main(String[] args) {
		Banco banco1 = new Banco();
		banco1.operar();
		banco1.saldosTotales();
	}
}
