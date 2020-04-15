package polizaSeguro;

//import java.util.Scanner;

public class Calificaciones {
	//La figura 5.9 calcula el promedio de un conjunto de calificaciones numéricas introducidas
	//por el usuario, y utiliza una instrucción switch para determinar si cada calificación es el
	//equivalente de A, B, C, D o F, y para incrementar el contador de la calificación apropiada.
	//El programa también imprime en pantalla un resumen del número de estudiantes que recibieron
	//cada calificación.
	
	//promedio de un conjunto de calificaciones numéricas introducidas por el usuario.
	//imprime en pantalla un resumen del número de estudiantes que recibieron cada calificación
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calificacion;
		int sumCalif = 0;
		int promedioTot;
		//Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese 10 calificaciones, el programa lo pasara a la letra correspondiente.");

		System.out.print("Ingrese 10 califiaciones: ");
		
		int aContCalifi = 0;
		int bContCalifi = 0;
		int cContCalifi = 0;
		int dContCalifi = 0;
		int eContCalifi = 0;
		
		for (int i = 0; i <= 10; i++) {

			calificacion = (int) (Math.random() * 100) + 1; //Para probarlo.
			// calificacion = sc.nextDouble();
			
			System.out.println(calificacion);
			
			sumCalif += calificacion;

			switch (calificacion / 10) {

			case 4:
				eContCalifi++;
				break;
			case 5:
				dContCalifi++;
				break;
			case 6:
				cContCalifi++;
				break;
			case 7:
				bContCalifi++;
				break;
			case 8:
			case 9:
				aContCalifi++;
				break;
			default:
				eContCalifi++;
			}// Fin swithc

			
		}// Fin for
		promedioTot = sumCalif / 10;
		System.out.println("Promedio: " + promedioTot);
		System.out.println("Estudiantes con A: " + aContCalifi);
		System.out.println("Estudiantes con B: " + bContCalifi);
		System.out.println("Estudiantes con C: " + cContCalifi);
		System.out.println("Estudiantes con D: " + dContCalifi);
		System.out.println("Estudiantes con E: " + eContCalifi);
	}

}
