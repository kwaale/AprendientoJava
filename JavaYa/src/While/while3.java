package While;



public class while3 {
	// Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
	// 

	public static void main(String[] args) {
		int num = 0;
		int cont = 0;

		while (num <= 500) {
			cont++;
			System.out.println("Numero " + cont + " - " + num);
			num += 8;
			
		}
	}

}
