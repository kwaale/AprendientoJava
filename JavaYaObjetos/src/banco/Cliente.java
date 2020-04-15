package banco;

public class Cliente {
	//Un banco tiene 3 clientes que pueden hacer depósitos y extracciones.
	//También el banco requiere que al final del día calcule la cantidad de dinero
	//que hay depositada.
	
	private String nombre;
	private int saldo;
	
	
	public Cliente(String nombre){
		this.nombre = nombre;
		this.saldo = 0;
	}
	public void depositar(int monto){
		if(monto > 0){
			saldo += monto; 
		}else{
			System.out.println("El monto a depositar debe ser mayor a cero");
		}		
	}
	public void imprimirSaldo(){
		System.out.println("El saldo de " + nombre + " es: " + saldo);
	}
	public void extraer(int monto){
		if(saldo > monto){
			saldo -= monto;
		}
	}
	public int retornoSaldo(){
		return saldo;
	}
}
