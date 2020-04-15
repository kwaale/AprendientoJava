package ParametrosOretornanDato;

import java.util.Scanner;

public class TablaMultiplicar {
//Declaración de métodos
	//Confeccionar una clase que permita ingresar valores enteros por teclado
	//y nos muestre la tabla de multiplicar de dicho valor.
	//Finalizar el programa al ingresar el -1.
	public void carga(){
		Scanner s =  new Scanner(System.in);
		int val;
		do{System.out.print("Ingrese un valor: ");
		val = s.nextInt();
		
		if(val != -1){
			calcular(val);
		s.close();}
		
	}while(val != -1);
	}
		public void calcular(int v){
			for(int f = v; f<= v*10; f=f+v ){
				System.out.print(f+ "-");
			}
		
	}
		
}

