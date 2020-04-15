package interesCompuesto;

import java.util.Scanner;

public class Prestamos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalculoInteres cInCompu = new CalculoInteres();
		
		cInCompu.cargaDatos();
		cInCompu.interesesCompuestos();
		System.out.println();
		cInCompu.calculoCuotas();
		
	sc.close();
	}
	
}
