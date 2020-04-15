package obj7;

public class Zona {
	// Queremos gestionar la venta de entradas (no numeradas) de Expocoches
	// Campanillas
	// que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
	// la zona de compra-venta con 200 entradas disponibles y la zona vip
	// con 25 entradas disponibles. Hay que controlar que existen entradas antes
	// de
	// venderlas. La clase Zona con sus atributos y métodos se muestra a
	// continuación:

	private int entradasPorVender;

	public Zona(int entradasPorVender) {
		this.entradasPorVender = entradasPorVender;
	}

	public int getentradasPorVender() {
		return entradasPorVender;
	}

	public void vender(int n) {
		if (this.entradasPorVender == 0) {
			System.out.println("No quedan entradas disponibles.");
		} else {
			if (this.entradasPorVender < n) {
				System.out.printf("Solo quedan disponibles %d entrada.%n", this.entradasPorVender);
			}
		}
		if (this.entradasPorVender >= n) {
			this.entradasPorVender -= n;
			System.out.println("Tome sus entradas");
		}
	}

}
