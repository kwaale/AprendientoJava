package empleaFactura;

public class Empleado {
//Proporcione un método establecer y un método r obtener para cada r variable de instancia.
	//Si el salario mensual no es positivo, no establezca su valor.
	//Escriba una aplicación de prueba llamada PruebaEmpleado,
	//que demuestre las capacidades de la clase Empleado.
	//Cree dos objetos Empleado y muestre el salario anual de cada objeto.
	//Después, proporcione a cada l Empleadoun aumento del 10% y muestre
	//el salario anual de cada Empleado otra vez.
	
	private String nombre;
	private String apellido;
	private double salarioMensual;
	
	public Empleado(String nombre, String apellido, double salarioMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSalarioMensual(double salarioMensual) {
		if(salarioMensual > 0){
			this.salarioMensual = salarioMensual;
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}
	public double aumento(double porcentaje){
		this.salarioMensual += salarioMensual*porcentaje/100;
		return this.salarioMensual;
	}
	
	
	
	
}
