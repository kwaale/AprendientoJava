package obj6Tiempo;

public class TestTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo a = new Tiempo(3455);
		Tiempo b = new Tiempo(15,61,62);
		Tiempo c = null;
		Tiempo d = null;
		
		System.out.println(a + " Segundos " + a.getSegundos());
		System.out.println(b + " Segundos " + b.getSegundos());
		
		c = (a.suma(b));
		System.out.println(c + " Segundos " + c.getSegundos());
		d = (b.resta(a));
			System.out.println(d + " Segundos " + d.getSegundos());
	}

}
