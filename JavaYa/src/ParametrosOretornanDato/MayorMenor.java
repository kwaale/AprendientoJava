package ParametrosOretornanDato;



import javax.swing.JOptionPane;

//Confeccionar una clase que permita ingresar tres valores por teclado.
//Luego mostrar el mayor y el menor.
public class MayorMenor {
	public void cargaValores() {
				
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 2"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 3"));
		int mayor,menor;
		mayor = calculoMayor(valor1, valor2, valor3);
		menor = calculoMenor(valor1, valor2, valor3);
		System.out.println("Mayor " + mayor);
		System.out.println("Menor " + menor);
		
	}

	public int calculoMayor(int v1, int v2, int v3) {
		int m;
		if (v1 > v2 && v1 > v3) {
			m = v1;
		} else {
			if (v2 > v3) {
				m = v2;
			} else {
				m = v3;

			}
		}
		return m;
	}

	public int calculoMenor(int v1, int v2, int v3) {
		int m;
		if (v1 < v2 && v1 < v3) {
			m = v1;
		} else {
			if (v2 < v3) {
				m = v2;
			} else {
				m = v3;
			}
		}
		return m;
	}
}
