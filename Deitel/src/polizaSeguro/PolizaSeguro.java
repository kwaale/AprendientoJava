package polizaSeguro;

public class PolizaSeguro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolizaAuto PA1 = new PolizaAuto(2350,"Toyota","MA");
		PolizaAuto PA2 = new PolizaAuto(4350,"Chevrolet","UT");
		
		polizaEnEstadoSinCulpa(PA1);
		polizaEnEstadoSinCulpa(PA2);
		
		 
		}
	//Se coloca metodo estatico fuera del main para 
	public static void polizaEnEstadoSinCulpa(PolizaAuto poliza){
		System.out.println("POLIZA");
		System.out.printf(" Cuenta #: %d%n Auto: %s%n Estado %s %s un estado sin culpa.%n%n",poliza.getNumeroCuenta(), poliza.getMarcaYModelo(),poliza.getEstado(),(poliza.esEstadoSinCulpa() ? "esta en" : "no esta en"));
	}

}
