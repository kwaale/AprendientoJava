package objetos;

public class Banco {
	Cliente c1,c2, c3;
		
	
	public Banco() {
		c1 = new Cliente("Juan",200);
		c2 = new Cliente("Ana",50);
		c3 = new Cliente("Julian",130);
	}
	public void operar() {
		c1.depositar(100);
		c2.extraer(44);
		c3.depositar(45);
		c1.depositar(45);
	}
	public void depositosTotales() {
		int t = c1.retornaMonto() + c2.retornaMonto() + c3.retornaMonto();
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		System.out.println("Los depositos totales son " + t);
	}
	public static void main(String[] args) {
		Banco b = new Banco();
		b.operar();
		b.depositosTotales();
	}
}
