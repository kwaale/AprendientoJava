package array01;



import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Escribe un programa que pida 10 números por teclado y que luego
		// muestre
		// los números introducidos junto con las palabras “máximo” y “mínimo”
		// al lado del máximo y del mínimo respectivamente.

		
		int[] num = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor "+(i+1)+"/10:"));

			if (num[i] > max) {
				max = num[i];
			}
			if (i < min) {
				min = num[i];
			}

		}
		System.out.println("------------Array------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(num[i] + " - ");
			if (num[i] == max) {
				System.out.println("Maximo: " + max);
			}
			if (num[i] == min) {
				System.out.println("Minimo: " + min);
			}
		}
		
	}

}
