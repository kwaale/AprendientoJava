package claseString1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TareasString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String card1;
		String card2;
		
		JOptionPane.showMessageDialog(null, "Este programa realiza distintas tareas comparativas entre dos String");
		card1 = JOptionPane.showInputDialog("Ingrese la primera cadena de caracteres");
		card2 = JOptionPane.showInputDialog("Ingrese la segunda cadena de caracteres");

		// Igualdad de Objetos
		if (card1.equals(card2) == true) {
			System.out.println("equals" + card1 + " es exactamente igual a " + card2);
		} else {
			System.out.println("equals" + card1 + " no es exactamente igual a " + card2);
		}
		// Igualdad sin tomar en cuenta case sencitive
		if (card1.equalsIgnoreCase(card2) == true) {
			System.out.println("equalsIgnoreCase" + card1 + " es igual sin tomar en cuenta mayusculas, a " + card2);
		} else {
			System.out.println("equalsIgnoreCase" + card1 + " no es igual a " + card2);
		}
		// metrica de la palabra
		if (card1.compareTo(card2) == 0) {
			System.out.println("compareTo" + card1 + " es exactamente igual a " + card2);
		} else {
			if (card1.compareTo(card2) > 0) {
				System.out.println("compareTo" + card1 + " es mayor alfabeticamente que " + card2);
			} else {
				System.out.println("compareTo" + card2 + " es mayor alfabeticamente que " + card1);
			}
		}
		char caract1 = card1.charAt(0);
		System.out.println("El primer caracter de " + card1 + " es " + caract1);
		int largo = card1.length();
		System.out.println("El largo del String " + card1 + " es " + largo);
		String card3 = card1.substring(0,3);
		System.out.println("Los primeros tres caracteres de "+card1+" son "+card3);
		int posi = card1.indexOf(card2);
		if(posi == -1){
			System.out.println(card2+" no está contenido en "+card1);
        } else {
        	System.out.println(card2+" está contenido en "+card1+" a partir de la posición "+posi);
		}
		System.out.println(card1+ " convertido a mayúsculas es "+card1.toUpperCase());
		System.out.println(card1+ " convertido a minúsculas es "+card1.toLowerCase());        

	}
}
