package ernesto;

import java.util.Scanner;
//(Figura 4.5. Ejercicio 3
//3.	(La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double). La clase debe tener un constructor que inicialice las tres variables de instancia. Proporcione un getter y un setter para cada variable de instancia. Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba llamada TestEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.

public class ConsultaTablaAscii {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
	
		
		for(int i = 1; i <= 10; i++){
			
			System.out.printf("%2d%7.0f%8.0f%n ",i,Math.pow(i, 2),Math.pow(i, 3));
		}
		
		
	
		s.close();
	}

}
