package vectoresRepaso;

import java.util.Scanner;

public class Altura {
	// Definir un vector de 5 componentes de tipo float
	// que representen las alturas de 5 personas.
	// Obtener el promedio de las mismas.
	// Contar cuántas personas son más altas que el promedio y cuántas más
	// bajas.
	private Scanner s = new Scanner(System.in);
	private float num[] = new float[5];
	private float promedio = 0;
	private int mayPromedio = 0;
	private int menPromedio = 0;

	public void carga() {
		for (int i = 0; i < num.length; i++) {
			System.out.print("Carga la altura: ");
			num[i] = s.nextFloat();
			
		}
	}

	public void promedio() {
		float sum = 0;
		float x = 0;
		for (int i = 0; i < num.length; i++) {
			x++;
			sum += num[i];
		}
		promedio = sum / x;
		System.out.println("Promediio: " + promedio);
	}
	public void mayMen(){
		for (int i = 0; i < num.length; i++) {
			if(promedio < num[i]){
				mayPromedio++;
			}else{
				menPromedio++;
			}
		}
	System.out.println(mayPromedio + " superan el promedio de altura.");
	System.out.println(menPromedio + " inferiores o igual al promedio de altura.");	
	}
}
