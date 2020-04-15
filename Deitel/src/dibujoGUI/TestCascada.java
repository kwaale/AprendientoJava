package dibujoGUI;
import javax.swing.JFrame;
import javax.swing.JOptionPane; 

public class TestCascada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulos\n" + "Escriba 2 para dibujar ovalos");
		 int opcion = Integer.parseInt(entrada);
		 Cascada panel = new Cascada(opcion);
		 JFrame aplicacion = new JFrame();
		 aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 aplicacion.add(panel);
		 aplicacion.setSize(300, 300);
		 aplicacion.setVisible(true);
	}

}
