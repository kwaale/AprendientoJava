package empleadoPerson;

public class Empleado extends Persona{
	//Plantear una segunda clase Empleado que herede de la clase Persona.
	//A�adir un atributo sueldo y los m�todos de cargar el sueldo e imprimir su sueldo.
	//Definir un objeto de la clase Persona y llamar a sus m�todos.
	//Tambi�n crear un objeto de la clase Empleado y llamar a sus m�todos.
	
	protected int sueldo;

	public void cargarSueldo(){
		System.out.print("Carga sueldo: ");
		sueldo = sc.nextInt();
	}
	public void imprimirSuel(){
		System.out.println("El sueldo es " + sueldo);
	}
	public static void main(String[] args) {
		Persona p = new Persona();
		p.carga();
		p.imprimir();
		Empleado e = new Empleado();
		e.cargarSueldo();
		e.imprimirSuel();
	}
}
