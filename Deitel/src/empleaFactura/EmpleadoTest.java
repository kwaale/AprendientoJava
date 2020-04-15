package empleaFactura;

public class EmpleadoTest {

	public static void main(String[] args) {
		//Escriba una aplicación de prueba llamada PruebaEmpleado,
		//que demuestre las capacidades de la clase Empleado.
		//Cree dos objetos Empleado y muestre el salario anual de cada objeto.
		//Después, proporcione a cada l Empleadoun aumento del 10% y muestre
		//el salario anual de cada Empleado otra vez.
				
		Empleado emp1 = new Empleado("Carlos", "Martinez", 15000);
		Empleado emp2 = new Empleado("Jose", "Perez", 9000);
		
		System.out.printf("El salario anual de %s %s es %.2f%n",emp1.getNombre(),emp1.getApellido(),(emp1.getSalarioMensual()*12));
		System.out.printf("El salario anual de %s %s es %.2f%n",emp2.getNombre(),emp2.getApellido(),(emp2.getSalarioMensual()*12));
	
		emp1.aumento(10);
		emp2.aumento(10);
		
		System.out.printf("El salario mensual de %s %s es %.2f y su salario anual es %.2f%n",emp1.getNombre(),emp1.getApellido(),emp1.getSalarioMensual(),(emp1.getSalarioMensual()*12));
		System.out.printf("El salario mensual de %s %s es %.2f y su salario anual es %.2f%n",emp2.getNombre(),emp2.getApellido(),emp2.getSalarioMensual(),(emp2.getSalarioMensual()*12));
	}

}
