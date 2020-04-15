package banco;

public class Persona {
	//Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer),
	//peso y altura. No queremos que se accedan directamente a ellos.
	//Piensa que modificador de acceso es el más adecuado, también su tipo.
	//Si quieres añadir algún atributo puedes hacerlo.
	
	private String nombre;
	private int edad;
	private int dni;
	final String sexo = "Hombre";
	
	
}
