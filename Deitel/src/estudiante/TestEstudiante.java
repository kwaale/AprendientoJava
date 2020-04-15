package estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Jeny Green",83.5);
		Estudiante est2 = new Estudiante("Marcos Galavis",75.4);
		
		
		mostrarEstudiante(est1);//otra, forma de colocar el codigo, usando metodo static fuera del main, ahorra codigo.
		System.out.printf("La calificaccion de %s es %.1f y su equivalente en letra es %s.%n",est2.getNombre(),est2.getPromedio(),est2.getCalificacion());
	}
	public static void mostrarEstudiante(Estudiante muestraDatos){
		System.out.printf("La calificaccion de %s es %.1f y su equivalente en letra es %s.%n",muestraDatos.getNombre(),muestraDatos.getPromedio(),muestraDatos.getCalificacion());
	}

}
