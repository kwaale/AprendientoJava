package interfaceVisuales;

import java.awt.event.*;

import javax.swing.*;

public class Boton extends JFrame implements ActionListener{
	JButton boton1,boton2,boton3;
	public Boton() {
		setLayout(null);
		boton1 = new JButton("Hombre");
		boton1.setBounds(10, 100, 90, 30);
		add(boton1);
		boton1.addActionListener(this);
		boton3 = new JButton("Mujer");
		boton3.setBounds(210, 100, 90, 30);
		add(boton3);
		boton3.addActionListener(this);
				
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			setTitle("Hombre");
		}
		if(e.getSource()==boton3) {
			setTitle("Mujer");
		}
	}
	public static void main(String[] args) {
		Boton boton1a = new Boton();
		boton1a.setBounds(0, 0, 350, 200);
		boton1a.setVisible(true);
	}
}
