package Banco;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("Jene Green", 50.00);
		Cuenta cuenta2 = new Cuenta("Carlos Mertinez", 150.00);

		mostrarCuenta(cuenta1);
		mostrarCuenta(cuenta2);
		// Scanner para introducir valor por consola.
		Scanner entrada = new Scanner(System.in);
		// Crea un objeto Cuenta y lo asigna a miCuenta.

		System.out.printf("Escriba el monto a depositar para %s: ", cuenta1.getNombre());
		double montoDeposito = entrada.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de %s%n%n", montoDeposito, cuenta1.getNombre());

		cuenta1.depositar(montoDeposito);
		mostrarCuenta(cuenta1);
		mostrarCuenta(cuenta2);

		System.out.printf("Escriba el monto a depositar para %s : ", cuenta2.getNombre());
		montoDeposito = entrada.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);

		cuenta2.depositar(montoDeposito);
		mostrarCuenta(cuenta1);
		mostrarCuenta(cuenta2);

		System.out.printf("Escriba el monto a retirar para la cuenta de %s: ", cuenta1.getNombre());
		double montoRetiro = entrada.nextDouble();
		System.out.printf("%nrestando %.2f al saldo de la %s%n%n", montoRetiro, cuenta1.getNombre());

		cuenta1.retirar(montoRetiro);
		mostrarCuenta(cuenta1);
		mostrarCuenta(cuenta2);

		System.out.printf("Escriba el monto a retirar para la cuenta de %s: ", cuenta2.getNombre());
		montoRetiro = entrada.nextDouble();
		System.out.printf("%nrestando %.2f al saldo de la %s%n%n", montoRetiro, cuenta2.getNombre());
		cuenta2.retirar(montoRetiro);

		mostrarCuenta(cuenta1);
		mostrarCuenta(cuenta2);
		// mostrar datos de la cuenta

		entrada.close();

	}

	// Metodo static que puede usarse por la misma clase para mostrar datos y
	// disminuir cantidad de codigo.
	public static void mostrarCuenta(Cuenta cuentaAMostrar) {
		System.out.printf("Saldo de %s: $%.2f%n", cuentaAMostrar.getNombre(), cuentaAMostrar.getSaldo());
	}
}