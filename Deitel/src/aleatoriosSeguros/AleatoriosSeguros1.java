package aleatoriosSeguros;

import java.security.SecureRandom;

public class AleatoriosSeguros1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SecureRandom numAleatorio = new SecureRandom();
	int cara = 0;
	int frecuencia1 = 0;
	int frecuencia2 = 0;
	int frecuencia3 = 0;
	int frecuencia4 = 0;
	int frecuencia5 = 0;
	int frecuencia6 = 0;
	
	for(int i = 1; i <= 500; i++) {
		cara = 1 + numAleatorio.nextInt(6);
		System.out.print("  " + cara);
		if(i % 80 == 0) {
			System.out.println();
		}
		switch(cara) {
		case 1:
			frecuencia1++;
			break;
		case 2:
			frecuencia2++;
			break;
		case 3:
			frecuencia3++;
			break;
		case 4:
			frecuencia4++;
			break;
		case 5:
			frecuencia5++;
			break;
		case 6:
			frecuencia6++;
			break;
		}
	}
	System.out.printf("%nCara 1 %d%nCara 2 %d%nCara 3 %d%nCara 4 %d%nCara 5 %d%nCara 6 %d%n",frecuencia1,frecuencia2,frecuencia3,
			frecuencia4,frecuencia5,frecuencia6);
	

	
	
	}

}
