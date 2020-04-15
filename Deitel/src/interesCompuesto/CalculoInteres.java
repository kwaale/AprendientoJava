package interesCompuesto;

import java.util.Scanner;

public class CalculoInteres {

	private double prestamo; // p
	private double tasaInteres; // r
	private double numCuotas; // n

	private double cuotaCompuesta; // a
	private Scanner sc = new Scanner(System.in);

	public void cargaDatos() {
		System.out.print("Monto prestamo: ");
		this.prestamo = sc.nextDouble();
		System.out.print("Cantidad cuotas: ");
		this.numCuotas = sc.nextDouble();
		System.out.print("Porcentaje: ");
		this.tasaInteres = sc.nextDouble();
	}

	public void calculoCuotas() {
		double p = this.prestamo;
		double n = this.numCuotas;
		double r = this.tasaInteres / 100; // r
		double a = 0;
		double t = 0;

		// formula
		a = p * (1+(r * n));
		t = a / n;
		System.out.printf("La cuota mensual es %.2f para un total a pagar de %.2f", t, a);

	}

	public void interesesCompuestos() {
		double p = this.prestamo;
		double n = this.numCuotas;
		double r = this.tasaInteres / 100; // r
		double a = 0;

		for (int i = 0; i < n; i++) {
			a = p * r;

			System.out.printf("El interes el mes %d es de %.2f%n", (i + 1), a);
			p += a;
		}

		this.cuotaCompuesta = p / n;

		System.out.printf(
				"Con un prestamo de %.2f al %.0f por ciento, en %.0f cuotas mensuales, paga un total de %.2f y cada cuota queda en %.2f",
				this.prestamo, this.tasaInteres, this.numCuotas, p, this.cuotaCompuesta);

	}

}