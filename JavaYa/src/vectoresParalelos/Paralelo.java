package vectoresParalelos;

import java.util.Scanner;

public class Paralelo {
	// Confeccionar un programa que permita cargar los nombres de 5 alumnos
	// y sus notas respectivas. Luego ordenar las notas de mayor a menor.
	// Imprimir las notas y los nombres de los alumnos.

	private Scanner s = new Scanner(System.in);
	private String nombres[] = new String[5];
	private int notas[] = new int[5];
	
	
	public void carga(){
		System.out.println("Carga de datos");
		for(int i =0; i < notas.length; i++){
			System.out.print("Nombre " + (i+1) + ":");
			nombres[i] = s.next();
			System.out.print("Nota " + (i+1) + ":");
			notas[i] = s.nextInt();
			
		}
	}
	public void imprimirOriginal(){
		System.out.print("Original: ");
		for(int i =0; i < notas.length; i++){
			System.out.println(nombres[i] + " " + notas[i]);
		}
	}
	public void ordenarMenorMayor(){
		for(int i =0; i < 4; i++){
			for(int j =0; j < 4; j++){
				int aux;
				String tem;
				if(notas[j]>notas[j+1]){
					aux = notas[j];
					notas[j] = notas[j+1];
					notas[j+1]=aux;
					tem = nombres[j];
					nombres[j] = nombres[j+1];
					nombres[j+1] = tem;
				}
			}
		}
	}
	public void imprimir (){
		for(int i =0; i < 4; i++){
			System.out.println("Ordenado: " + nombres[i] + " " + notas[i]);
		}
	}
}
