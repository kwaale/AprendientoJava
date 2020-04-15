package PruebaFrame;

import java.awt.*;

public class Clase {
	private TextArea salida;
	private TextField entrada;
	private Button botonEnviar;
	private Button botonQuitar;

	public Clase() {
		salida = new TextArea(10, 50);
		entrada = new TextField(50);
		botonEnviar = new Button("Enviar");
		botonQuitar = new Button("Quitar");
	}

	public void LaunchFrame() {
		Frame frame = new Frame("Chat Room");
		frame.setLayout(new BorderLayout());
		frame.add(salida, BorderLayout.WEST);
		frame.add(entrada, BorderLayout.SOUTH);
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 1));
		p1.add(botonEnviar);
		p1.add(botonQuitar);
		frame.add(p1, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase c = new Clase ();
		c.LaunchFrame();
	}

}
