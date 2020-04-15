package arrayBidimencional;

public class Modelo {

	public static void main(String[] args) {
		// Ejemplo Array Bidimencional

		int num[][] = new int[3][6];
		int fila, columna;

		num[0][0] = 0;
		num[0][1] = 2;
		num[0][2] = 3;
		num[0][3] = 4;
		num[0][4] = 5;
		num[0][5] = 6;

		num[0][0] = 1;
		num[1][1] = 2;
		num[1][2] = 3;
		num[1][3] = 4;
		num[1][4] = 5;
		num[1][5] = 6;

		num[2][0] = 1;
		num[2][1] = 2;
		num[2][2] = 3;
		num[2][3] = 4;
		num[2][4] = 5;
		num[2][5] = 6;

		for (fila = 0; fila < 3; fila++) {

			for (columna = 0; columna < 6; columna++) {
				System.out.print(" | ");
				System.out.print(num[fila][columna]);
				System.out.print(" | ");
			}
			System.out.println();

		}

	}

}
