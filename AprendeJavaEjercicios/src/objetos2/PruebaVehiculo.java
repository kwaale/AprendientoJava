package objetos2;

import java.util.Scanner;

public class PruebaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 2;
		int km;
		Scanner sc = new Scanner(System.in);

		Bicicleta monta = new Bicicleta();
		Coche audi = new Coche();

		while (opcion != 8) {
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.println("Elige una opción (1-8): ");

			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Cuantos Kilometros quiere Recorrer: ");
				km = sc.nextInt();
				monta.recorre(km);
				break;
			case 2:
				monta.hazCaballito();
				break;
			case 3:
				System.out.print("Cuantos Kilometros quiere Recorrer: ");
				km = sc.nextInt();
				audi.recorre(km);
				break;
			case 4:
				audi.quemaRuedas();
				break;
			case 5:
				System.out.printf("La bicicleta lleva recorridos %d km%n", monta.getKilometrosRecorridos());
				break;
			case 6:
				System.out.printf("El coche lleva recorridos %d km%n", audi.getKilometrosRecorridos());
				break;
			case 7:
				System.out.printf("El kilometraje recorrido es de %d km%n", Vehiculo.getKilometrosTotales());
				break;
			default:

			}

		}
		sc.close();
	}

}
