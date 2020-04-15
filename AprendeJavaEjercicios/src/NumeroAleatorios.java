
public class NumeroAleatorios {

	public static void main(String[] args) {
		// Hemos visto cómo generar números aleatorios con y sin decimales
		// y en diferentes intervalos. Vamos a producir ahora de forma
		// aleatoriauna
		// palabra - piedra, papel o tijera - generando primero un número entero
		// entre 0 y 2 y posteriormente haciendo
		// corresponderunapalabraacadanúmero.

	

		// Scanner s = new Scanner(System.in);
		int aleo = 0;
		for (int i = 0; i < 10; i++) {
		aleo = (int) (Math.random() * 3);

		
		switch (aleo) {
		case 0:
			System.out.println("piedra");
			break;
		case 1:
			System.out.println("papel");
			break;
		case 2:
			System.out.println("tiejera");
			break;
		default:
		}
		}

	}
}
