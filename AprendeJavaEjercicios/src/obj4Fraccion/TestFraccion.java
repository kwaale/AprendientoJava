package obj4Fraccion;

public class TestFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion f1 = new Fraccion(38,40);
		Fraccion f2 = new Fraccion(9,16);
		Fraccion f3 = new Fraccion(1,2);
		
		System.out.println(f1);
		System.out.println(f2.simplifica());
		System.out.println(f1.toString());
		System.out.println(f1.simplifica());
		System.out.println(f3.multiplica(f2));
		
	}

}
