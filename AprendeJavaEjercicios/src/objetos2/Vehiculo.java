package objetos2;

public class Vehiculo {
	//  Crea tambi�n alg�n m�todo espec�fico para cada una de las subclases. 
	
	private static int kilometrosTotales;
	private int kilometrosRecorridos;
	
	public Vehiculo(){
		this.kilometrosRecorridos = 0;
	}
	
	public int getKilometrosRecorridos(){
		return kilometrosRecorridos;
	}
	public static int getKilometrosTotales(){
		return Vehiculo.kilometrosTotales;
		
	}
	public void recorre(int k){
		this.kilometrosRecorridos += k;
		Vehiculo.kilometrosTotales += k;
		
		
	}
	
}
