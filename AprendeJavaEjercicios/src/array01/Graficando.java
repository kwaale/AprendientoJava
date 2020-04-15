package array01;

public class Graficando {

	public static void main(String[] args) {
		//Graficando
		
		// Realiza un programa que pida la temperatura media que ha hecho en
		//cada mes de un determinado año y que muestre a continuación un diagrama
		//de barras horizontales con esos datos. Las barras del diagrama se 
		//pueden dibujar a base de asteriscos o cualquier otro carácter.


		//Scanner s = new Scanner(System.in);
		int []temp = new int [10];
		int imp = 0;
		for(int i = 0; i < 10; i++){
			temp[i] = (int)(Math.random()*51);
			
		}
		
		for(int i = 0; i < 10; i++){
			imp = temp[i];
			System.out.println();
			for(int j = 0; j <= imp; j++){
				System.out.print("*");
			}
			
		}
	}
}
