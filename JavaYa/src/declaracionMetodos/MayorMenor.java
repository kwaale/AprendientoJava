package declaracionMetodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MayorMenor {
	// Confeccionar una clase que permita ingresar tres valores por teclado.
	// Luego mostrar el mayor y el menor.
	
	public void carga() {
		Scanner s = new Scanner(System.in);
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor 2"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor 3"));
		int mayor, menor;
		mayor = calculoMayor(num1, num2, num3);
		menor = calculoMenor(num1, num2, num3);
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
		s.close();
	}

	public int calculoMayor(int n1, int n2, int n3) {
		int may;
		if (n1 > n2 && n1 > n3) {
			may = n1;
		} else {
			if (n2 > n3) {
				may = n2;
			} else {
				may = n3;
			}
		}
		return may;
	}

	public int calculoMenor(int n1, int n2, int n3) {
		int men;
		if (n1 < n2 && n1 < n3) {
			men = n1;
		} else {
			if (n2 < n3) {
				men = n2;
			} else {
				men = n3;
			}
		}
	return men;
	}
}
