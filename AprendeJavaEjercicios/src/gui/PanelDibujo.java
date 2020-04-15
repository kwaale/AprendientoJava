package gui;
import java.awt.Graphics;

//Uso de drawLine para conectar las esquinas de un panel.
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{

	///No se porque salio el programa decia para colocar esta linea de codigo.
	private static final long serialVersionUID = 1L;

	// dibuja una x desde las esquinas del panel
	 public void paintComponent(Graphics g){
		 // llama a paintComponent para asegurar que el panel se muestre correctamente 12
		 super.paintComponent(g);
		 
		 int ancho = getWidth();
		 int altura = getHeight();
		 //dibuja una línea de la esquina superior izquierda a la esquina inferior derecha
		 g.drawLine(0, 0, ancho, 10);
		 g.drawLine(0, 0, ancho, 20);
		 g.drawLine(0, 0, ancho, 30);
		 g.drawLine(0, 0, ancho, 40);
		 g.drawLine(0, 0, ancho, 100);
		 g.drawLine(0, 0, ancho, 300);
		 g.drawLine(0, 0, altura, 0);
		 
		
		 
		 //g.drawLine(10, altura, ancho, 10);Mal
		//g.drawLine(0, ancho, altura, 0);Mal
		
	 }
}
