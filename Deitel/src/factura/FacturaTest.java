 package factura;

public class FacturaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura fac1 = new Factura("2324","Martillo",2,15.45);
		fac1.getMontoFactura();
		
		System.out.printf("Monto de la factura %.2f", fac1.getMontoFactura());
		
	}

}
