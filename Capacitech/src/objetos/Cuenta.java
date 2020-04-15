package objetos;

import java.util.Scanner;

public class Cuenta {

	public static void main(String[] args) {
		// (Clase Cuenta en un sistema bancario) Cree una clase Cuenta para
		// proporcionar
		// un método llamado extraer, que retire dinero de un objeto Cuenta.
		// Asegúrese de
		// que el monto a retirar no exceda el saldo de Cuenta. Si lo hace, el
		// saldo debe
		// permanecer sin cambio. El método debe retornar true si la extracción
		// es exitosa
		// o false en caso contraria. Cree una clase TestCuenta para probar el
		// método
		// extraer. El mismo debe imprimir un mensaje que indique “El monto a
		// retirar excede el
		// saldo de la cuenta”. Además debe, por cada movimiento, indicar el
		// saldo que queda en
		// la cuenta. Agregar, para hacer depósitos, un método depositar.

		int saldo = 0;
		int monto;
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Bienvenido al programa banco");
			System.out.println("1. Depositar.");
			System.out.println("2. Extraer.");
			System.out.println("3. Salir.");

			opcion = sc.nextInt();

			switch (opcion) {
			// depositar
			case 1:
				System.out.print("Ingrese el monto a depositar: ");
				monto = sc.nextInt();
				if (monto > 0) {
					saldo = saldo + monto;
				} else {
					System.out.println("El monto no es correcto.");
				}
				System.out.println("El nuevo saldo es: " + saldo);
				break;
			// Retirar
			case 2:
				System.out.print("Ingrese el monto a retirar: ");
				monto = sc.nextInt();
				if (monto > 0 && monto < saldo) {
					saldo = saldo - monto;
				} else {
					System.out.println("El saldo no es suficiente.");
				}
				break;
			default:
				System.out.println("Introdujo salir o una opcion invalida");
				break;
			}

		} while (opcion != 3);

	}
}
