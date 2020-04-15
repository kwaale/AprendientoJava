package estudiante;

public class Estudiante {
	private String nombre;
	private double promedio;

	public Estudiante(String nombre, double promedio) {
		this.nombre = nombre;
		if (promedio >= 0 && promedio <= 100) {
			this.promedio = promedio;
		}

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPromedio(double promedio) {
		if (promedio >= 0 && promedio <= 100) {
			this.promedio = promedio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	// determina y devuelve la calificación en letras del Estudiante
	public String getCalificacion() {
		String calificacionEstudiante = "";// inicializar vacio.
		if (promedio >= 90) {
			calificacionEstudiante = "A";
		} else {
			if (promedio >= 80) {
				calificacionEstudiante = "B";
			} else {
				if (promedio >= 70) {
					calificacionEstudiante = "C";
				} else {
					if (promedio >= 60) {
						calificacionEstudiante = "D";
					} else {
						calificacionEstudiante = "F";

					}
				}

			}
		}
		return calificacionEstudiante;
	}

}
