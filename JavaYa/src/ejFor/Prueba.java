package ejFor;

public class Prueba {

	public static void MAIN(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 3;
		int resultado;
		int array[] = { 2, 18, 6, -4, 5, 1 };
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] + (array[i] / array[0]);
			
			System.out.println(array[i]);
		}
		resultado = x/y;
		System.out.println(resultado);
	}
}
