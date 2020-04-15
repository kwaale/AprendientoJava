package objetos;

public class Cliente {
	private String nombre;
	private int monto;
	
	public Cliente(String nombre, int monto) {
		this.nombre = nombre;
		this.monto = monto;
	}
	public void depositar(int monto) {
		this.monto += monto;
	}
	public void extraer(int monto) {
		this.monto -= monto;
	}
	public int retornaMonto() {
		return monto;
	}
	public void imprimir() {
		System.out.printf("%s tiene en su cuenta la cantidad de %d pesos.%n",this.nombre, this.monto);
	}
	
}
