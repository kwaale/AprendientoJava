package obj7;

import java.util.Scanner;

public class ExpocochesCampanillas {

	public static void main(String[] args) {
		/*
		 * la zona de compra-venta con 200 entradas disponibles y la zona vip
		 * con 25 entradas disponibles.b
		 */

		Zona principal = new Zona(1000);
		Zona compra = new Zona(200);
		Zona vip = new Zona(50);
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion2 = 0;
		int n = 0;

		do {
			System.out.println("\n\nEXPOCOCHES CAMPANILLAS");
			System.out.println("1. Mostrar número de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
			System.out.println("Elige una opción: ");

			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.printf("%nDisponibles %d entradas en PRINCIPAL%n",
						principal.getentradasPorVender());
				System.out.printf("Disponibles %d entradas en COMPRAVENTA%n", compra.getentradasPorVender());
				System.out.printf("D3isponibles %d entradas en VIP%n", vip.getentradasPorVender());
			}
			if (opcion == 2) {
				System.out.println("\n\n1. Entradas en PRINCIPAL\n");
				System.out.println("2. Entradas en COMPRAVENTA\n");
				System.out.println("3. Entradas en VIP\n");
			
			opcion2 = sc.nextInt();
			System.out.print("¿Cuantas entradas quiere? ");
			n = sc.nextInt();
			switch (opcion2) {
			case 1:
				principal.vender(n);
				break;
			case 2:
				compra.vender(n);
				break;
			case 3:
				vip.vender(n);
				break;
			default:
			}
			}
		} while (opcion != 3);

		sc.close();
	}
}
