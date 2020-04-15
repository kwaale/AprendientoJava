package bucles;

public class Probador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Determinacion de Numeros Pares
		int par = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println(par);
			par = par + 2;
		}
		// Determinacion de Numeros Pares
		int impar = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.println(impar);
			impar = impar + 2;
		}
		// Contador

		int contador = 0;
		for (int i = 0; i <= 10; i++) {
			contador = i;

		}
		System.out.println("Resultado: " + contador);

	}
}
