package herencia;

public class TestOperacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma sum = new Suma();
		sum.cargar1();
		sum.cargar2();
		sum.operar();
		sum.imprimirResultado();
		Resta res = new Resta();
		res.cargar1();
		res.cargar2();
		res.operar();
		res.imprimirResultado();
		
	}

}
