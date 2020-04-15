package ejerciciosTema6;

import java.security.SecureRandom;

public class Validacion {
	// Escriba una aplicación que simule el lanzamiento de monedas.
	// Deje que el programa lance una moneda cada vez que el usuario seleccione la
	// opción del menú “Lanzar moneda”.
	// Cuente el número de veces que aparezca cada uno de los lados de la moneda.
	// Muestre los resultados. El programa debe llamar a un método independiente,
	// llamado tirar, que no tome argumentos y devuelva un valor de una enum llamada
	// Moneda
	// (CARAy CRUZ).
	// [Nota: si el programa simula en forma realista el lanzamiento de monedas,
	// cada lado de la moneda debe aparecer aproximadamente la mitad del tiempo].
	private enum Moneda{CARA,SELLO};
	private SecureRandom numA = new SecureRandom();

	public void tirafaarMoneda() {
		int cara = 1 + numA.nextInt(2);
		switch (cara) {
		case 1:
			System.out.println("Cara");
			break;
		case 2:
			System.out.println("Sello");
			break;
		}

	}

	public static void main(String[] args) {
		Validacion juego = new Validacion();
		juego.tirafaarMoneda();
		for(int i = 0; i < 9; i++) {
			juego.tirafaarMoneda();
		}
	}

}
