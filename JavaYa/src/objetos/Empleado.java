package objetos;

public class Empleado extends Persona{
	//Plantear una segunda clase Empleado que herede de la clase Persona.
		//A�adir un atributo sueldo y los m�todos de cargar el sueldo e imprimir su sueldo.
		//Definir un objeto de la clase Persona y llamar a sus m�todos.
		//Tambi�n crear un objeto de la clase Empleado y llamar a sus m�todos.
	protected int sueldo;
	
	public void cargarSueldo() {
		System.out.print("Sueldo: ");
		this.sueldo = sc.nextInt();
	}
	public void imprimirSueldo() {
		System.out.println("El sueldo es " + this.sueldo);
		
	}
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Empleado em = new Empleado();
		
		p1.cargarDatos();
		em.cargarDatos();
		em.cargarSueldo();
		p1.imprimir();
		em.imprimirSueldo();
		em.imprimir();
	}
}
