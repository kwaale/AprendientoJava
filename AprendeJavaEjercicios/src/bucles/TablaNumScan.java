package bucles;

import java.util.Scanner;

public class TablaNumScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.printf("Este programa le da la tabla de multiplicar de cualquier nuemero %nintroduciodo por teclado%n**Introduzca un valor entero**:");
			
		int x = s.nextInt();
		
		for(int i = 0; i <= 10; i++){
			int resul = x * i;
			System.out.println(x + " x " + i + " = " + resul);
			
		}
		s.close();
	}

}
