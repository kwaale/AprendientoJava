package ejerciciosTema6;

public class NumInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23456789;
		
		String ejemplo = String.valueOf(num);// Se pasa el entero a String.
		
		for(int i = ejemplo.length()-1; i >= 0 ; i--) {
			System.out.print(ejemplo.charAt(i));
			
		}
		System.out.println();
		System.out.println(ejemplo);
			
		
	}

}
