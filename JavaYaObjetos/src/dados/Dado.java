package dados;

public class Dado {
	private int valor;
	
	public void tirar(){
		valor = 1+(int)(Math.random()*6);
	}
	public void imprimmirValor(){
		System.out.println("Salio el: " + valor);
	}
	public int retornoValor(){
		return valor;
	}
}
