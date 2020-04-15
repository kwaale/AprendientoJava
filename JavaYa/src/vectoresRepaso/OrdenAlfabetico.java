package vectoresRepaso;

public class OrdenAlfabetico {

	public static void main(String[] args) {
		// Ordenados Alfabeticamente con "CompareTo"
		String[] paises = { "Chichiguilote", "Chiguagua", "Chichiguilota", "Chichiguiloto", "Chichiguilotu" };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (paises[j].compareTo(paises[j + 1]) > 0) {
					String aux;
					aux = paises[j];
					paises[j] = paises[j + 1];
					paises[j + 1] = aux;
					System.out.println(" Resultado: " + paises[j].compareTo(paises[j + 1]));
					System.out.print(paises[j] + " y " + paises[j + 1]);
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Corregido");
			System.out.print(paises[i] + " - ");
		}
	}
}
