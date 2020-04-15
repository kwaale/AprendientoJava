package matrices;

public class Primera {
	// Crear una matriz de 3 filas por 5 columnas con elementos de tipo int,
	// cargar sus componentes y luego imprimirlas.
	private int matriz[][] = new int[3][5];

	public void carga() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" | " + matriz[i][j] + " | ");
			}
			System.out.println();
			System.out.println("----------------------------------");
		}
	}
}
