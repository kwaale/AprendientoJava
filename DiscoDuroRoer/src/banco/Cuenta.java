package banco;

public class Cuenta {
	private String titular;
	private double cantidad;

	//Titular Obligatorio y cantidad opcional
	public Cuenta(String titular) {
		this(titular, 0);
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		if (cantidad < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad = cantidad;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void depositar(double cantidad){
		if(cantidad > 0){
			this.cantidad += cantidad;
		}
	}

	public void retirar(double cantidad) {
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad -= cantidad;
		}
	}
	public String toString(){
		return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
	}
	//Ahora Ejecucion
	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Carlos");
		Cuenta c2 = new Cuenta("Jose",350);
		
		c1.depositar(1000);
		c2.depositar(400);
		
		c1.retirar(144);
		c2.retirar(333 );
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
