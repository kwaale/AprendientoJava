package objetos;

public class Dado {
	private int valor;
	
	public void tirar() {
		this.valor = (int)(Math.random()*6)+1; 
	}
	public void imprimir() {
		System.out.println("El valor es: " + valor);
	}
	public int retornaVal() {
		return valor;
	}
	
}
