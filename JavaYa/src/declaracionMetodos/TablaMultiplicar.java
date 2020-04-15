package declaracionMetodos;

import javax.swing.JOptionPane;

public class TablaMultiplicar {
	// Confeccionar una clase que permita ingresar valores enteros por teclado
	// y nos muestre la tabla de multiplicar de dicho valor.
	// Finalizar el programa al ingresar el -1.

	public void cargaValor() {
		int valor;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor"));
			if (valor != -1) {

				calcular(valor);// llamar al mentodo
			}
		} while (valor != -1);
	}

	public void calcular(int v) {
		int a = 1;
		System.out.println("Tambla del No. " + v);
		for (int i = v; i <= v * 10; i = i + v) {
			System.out.println(v + " x " + a + " = " + i);
			a++;
		}
	}

	public static void main(String[] args) {
		TablaMultiplicar p = new TablaMultiplicar();
		p.cargaValor();
	}
}
