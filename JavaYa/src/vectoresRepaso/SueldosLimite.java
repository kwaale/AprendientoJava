package vectoresRepaso;

import java.util.Scanner;

public class SueldosLimite {
	//Se desea guardar los sueldos de 5 operarios.
	//Según lo conocido deberíamos definir 5 variables si queremos tener 
	//en un cierto momento los 5 sueldos almacenados en memoria.
	//Empleando un vector solo se requiere definir un único nombre
	//y accedemos a cada elemento por medio del subíndice.
	private Scanner s = new Scanner(System.in);
	private int []sueldos = new int [5];
	
	public void carga(){
		System.out.println("-----Carga de sueldos-----");
		for(int i = 0; i < sueldos.length; i++){
			sueldos[i] = s.nextInt();
		}
	}
	public void imprimir(){
		System.out.println("-----Imprimir Sueldos-----");
		for(int i = 0; i < sueldos.length; i++){
			System.out.print(sueldos[i] + " ");
		}
	}
	
}
