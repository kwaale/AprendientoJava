package ejerciciosTema6;

public class NumPerfecto {

	public static void main(String[] args) {
		//Numeros Perfectos
		int sum = 0;
		for (int j = 1; j <= 10000; j++) {
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					sum += i;	
				}
			}
			if (sum == j) {
				System.out.println("Numero perfecto: " + sum);
			}
			sum = 0;
		}
	}
}
