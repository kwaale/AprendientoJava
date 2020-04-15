package ejFor;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// Dibujo For
		Scanner sc = new Scanner(System.in);
		
		int val;
		
		do{
			System.out.println("Ingrese un numero entre 0 y 1000: ");
			val = sc.nextInt();
			if(val >= 100){
				System.out.println("Tiene 3 digitos");
			}
			if((val >= 10)&&(val <= 99)){
				System.out.println("Tiene 2 digitos");
			}
			if((val >= 1)&&(val <= 9)){
				System.out.println("Tiene 1 digito");
			}
				
		}
		while(val !=0);
		
	sc.close();
	}

}
