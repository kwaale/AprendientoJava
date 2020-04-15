package dibujoGUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel; 

public class CaraFeliz extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
	//Cara
	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200);
	
	//Ojos
	g.setColor(Color.BLACK);
	g.fillOval(55, 65, 30, 30);
	g.fillOval(135, 65, 30, 30);
	
	//boca
	g.fillOval(50, 110, 120, 60);
	
	//Convierte boca en sonrisa
	g.setColor(Color.YELLOW);
	g.fillRect(52, 110, 117, 30);
	g.fillOval(50, 120, 120, 40);
	}
	public static void main(String[] args) {
		CaraFeliz panel = new CaraFeliz();
		JFrame aplicacion = new JFrame();
		
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(panel);
		aplicacion.setSize(230, 250);
		aplicacion.setVisible(true);
	}
	
	
	
	

}
