package arrayBidimencional;

public class Prueba {

	public static void main(String[] args) {
		//Corregir
		
		// Escribe un programa que pida 20 números enteros.
		// Estos números se deben introducir en un array de 4 filas por 5
		// columnas.
		// El programa mostrará las sumas parciales de filas y columnas igual
		// que si de una hoja de cálculo se tratara. La suma total debe aparecer
		// en la esquina inferior derecha.
		int num[][] = new int[4][5];
		int fila, columna;


		for (fila = 0; fila < 4; fila++) {
			for (columna = 0; columna < 5; columna++) {
				num[fila][columna] = (int) (Math.random() * 10);
				// num[fila][columna] = x++;
			}
		}
		// Array Original
		System.out.println("Array 1");
		for (fila = 0; fila < 4; fila++) {
			System.out.println();
			// sumFila = sumFila + num[fila][columna];

			for (columna = 0; columna < 5; columna++) {
				System.out.print("|");
				System.out.print(num[fila][columna]);
				System.out.print("|");
			}
		}
		// Array SumFila
		System.out.println();
		System.out.println("Array Suma Fila");
		
		for (fila = 0; fila < 4; fila++) {
			System.out.println();
			int sumFila = 0;
			for (columna = 0; columna < 5; columna++) {
				sumFila = sumFila + num[fila][columna];
				System.out.print("|");
				System.out.print(num[fila][columna]);
				System.out.print("|");
			}
			System.out.print("|");
			System.out.print(sumFila);
			System.out.print("|");
		}
		//Array Suma Columna
		System.out.println();
		System.out.println("Suma Columna");
		for (columna = 0; columna < 5; columna++) {
		
			System.out.println();
			
			int sumColumna = 0;
			for (fila = 0; fila < 4; fila++) {
				sumColumna = sumColumna + num[fila][columna];
				System.out.print("|");
				System.out.print(num[fila][columna]);
				System.out.print("|");
			}
			System.out.print("|");
			System.out.print(sumColumna);
			System.out.print("|");
		}
		

	}

}
