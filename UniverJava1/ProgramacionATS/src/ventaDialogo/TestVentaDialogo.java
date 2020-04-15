package ventaDialogo;

import javax.swing.JOptionPane;

public class TestVentaDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de Variables.
		String cadena;
		int entero;
		char letra;
		double decimal;
		//Guardar datos en las variables a traves de la venta de dialogo.
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
		letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un deimal: "));
		//Va a devolver los datos introducidos por ventana de dialogo.
		JOptionPane.showMessageDialog(null, "La cadena que introdujo es: " + cadena);
		JOptionPane.showMessageDialog(null, "El entero es: " + entero);
		JOptionPane.showMessageDialog(null, "La letra es: " + letra);
		JOptionPane.showConfirmDialog(null, "El decimal que introdujo es: " + decimal);
		
		
		
		
		
		
	}

}
