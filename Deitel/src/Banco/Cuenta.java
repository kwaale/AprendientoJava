package Banco;

public class Cuenta {

	// Variable de Instancia
	private String nombre;
	private double saldo;
	public Cuenta(String nombre, double saldo) {
		this.nombre = nombre;// asigna nombre a la variable de instancia.
		if (saldo > 0.0) {
			this.saldo = saldo;
		}
	}
	public void depositar(double montoDeposito) {
		if (montoDeposito > 0.0) {
			saldo += montoDeposito;
		}
	}
	public void retirar(double montoRetiro) {
		if (montoRetiro < this.saldo) {
			saldo -= montoRetiro;
		} else {
			System.out.println("El monto a retirar excede el saldo de la cuenta.");
		}
	}
	public double getSaldo() {
		return saldo;
	}
	// Metrod para establecer el nombre en el objeto.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// metodo para obtener el nombre
	public String getNombre() {
		return nombre; // Devuelve el valor de nombre a quien lo invoco.
	}
	
}
