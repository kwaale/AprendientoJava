package frecuenciaCardiaca1;

public class TestFecuenciaCardiaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrecuenciasCardiacas fc1 = new FrecuenciasCardiacas("Carlos", "Martinez", new Fecha(16,01,1984));
		System.out.printf("La edad de %s %s es %d años.%n",fc1.getNombre(),fc1.getApellido(),fc1.getEdad());
		int fcm = 220 - fc1.getEdad();
		System.out.printf("Su frecuencia cardiaca es %d%n",fcm);
		double valorMinimo = .5 * fcm;
		double valorMaximo = .8 * fcm;
		System.out.printf("El rango de frecuencia cardiaca debe estar entre %.2f y %.2f bpm.%n",valorMinimo,valorMaximo);
	}

}
