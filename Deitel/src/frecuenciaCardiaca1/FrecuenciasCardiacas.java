package frecuenciaCardiaca1;

import java.util.*;

public class FrecuenciasCardiacas {

	private String nombre;
	private String apellido;
	private Fecha fechaDeNacimiento;

	public FrecuenciasCardiacas(String nombre, String apellido, Fecha fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento.getDia() + "/" + fechaDeNacimiento.getMes() + "/" + fechaDeNacimiento.getAnio();
	}

	public int getEdad() {
		Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR) - fechaDeNacimiento.getAnio();
		return edad;
	}
}
