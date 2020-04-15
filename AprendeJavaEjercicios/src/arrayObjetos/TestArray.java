package arrayObjetos;

import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		Gato gato [] = new Gato[4];
		Scanner entrada = new Scanner(System.in);
		int i;
		
		for(i = 0; i < gato.length; i++){
			System.out.println("Gato "+ (i + 1));
			System.out.println("Nombre: ");
			gato[i].setNombre(entrada.nextLine());
			System.out.print("Color: ");
			gato[i].setColor(entrada.nextLine());
			System.out.print("Raza: ");
			gato[i].setColor(entrada.nextLine());
		}
		System.out.println();
		System.out.println("IMPRIMIR DATOS DE LOS GATOS");
		for(i = 0; i < gato.length; i++){
			System.out.printf("Nombre: %s%nColor: %s%nRaza: %s%n%n",gato[i].getNombre(),gato[i].getColor(),gato[i].getRaza());
		}
		entrada.close();
		
	}
}
