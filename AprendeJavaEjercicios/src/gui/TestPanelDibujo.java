package gui;

import javax.swing.JFrame;

public class TestPanelDibujo {

	public static void main(String[] args) {
		 // crea un panel que contiene nuestro dibujo
		PanelDibujo panel = new PanelDibujo();
		
		//Marco Panel
		JFrame aplication = new JFrame();
		// establece el marco para salir cuando se cierre
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplication.add(panel);
		aplication.setSize(250, 250);
		aplication.setVisible(true);
	}

}
