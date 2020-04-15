package fecha1;

public class Fecha {
	
	//Proporcione un método r mostrarFecha,
	//que muestre el mes, día y año, separados por barras diagonales (/).
	//Escriba una aplicación de prueba llamada PruebaFecha,
	//que demuestre las capacidades de la claseFecha.
	
	private int dia;
	private int mes;
	private int anio;
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public String mostrarFecha(){
		return dia + "/" + mes + "/" + anio;
	}
	
	
	
}
