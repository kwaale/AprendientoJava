package objetos;

public class TestOperar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma sum1 = new Suma();
		Resta res1 = new Resta();
		
		sum1.cargar1();
		sum1.cargar2();
		sum1.operar();
		sum1.mostrarResultado();
		System.out.println();
		res1.cargar1();
		res1.cargar2();
		res1.operar();
		res1.mostrarResultado();
	}

}
