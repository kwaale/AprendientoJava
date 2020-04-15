package funcionesImplementacion;

public class BinarioDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 25;
		//int cantDigi = 0;
		//int residudo = 0;
		int contador = 0;
		int n = numero;
		
		while(!(n == 0)||(n == 1)){
			//residudo = n % 2;
			n = n/2;
			contador++;
		}
		System.out.println(contador);
		
		int digitosBinarios[] = new int[contador];
		for(int i = contador-1; i >= 0; i--){
			digitosBinarios[i] = numero % 2;
			numero = numero/2;
		}
		
		
		/*
		//Recoge todos lod digitos en orden y los coloca en un array.
		cantDigi = Integer.toString(numero).length();
		int digitos [] = new int [cantDigi];
		for(int i = digitos.length-1; i >= 0; i--){
			digitos[i] = numero % 10;
			numero = numero/10;	
		}
		*/
			
			
		
		
		
		
 	}

}
