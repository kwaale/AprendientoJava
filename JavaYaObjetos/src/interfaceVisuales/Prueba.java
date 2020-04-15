package interfaceVisuales;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 5;
		int pos = 0;
		int pre = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Antes " + x +" - "+ y+" - "+ pre);
			pre = ++x;
			pos = y++;
			System.out.println("Despues " + x +" - "+ y +" - "+ pos);
		}
	}

}
