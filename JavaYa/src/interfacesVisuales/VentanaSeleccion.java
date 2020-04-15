package interfacesVisuales;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//Problemas propuestos 36
public class VentanaSeleccion extends JFrame implements ActionListener {
	private JComboBox combo1, combo2, combo3;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JButton boton1;
	
	public VentanaSeleccion() {
		setLayout(null);
		etiqueta1 = new JLabel("Rojo");
		etiqueta1.setBounds(10,10,100,30);
		add(etiqueta1);
		combo1 = new JComboBox();
		combo1.setBounds(120,10,50,30);
		for(int f = 0; f <= 255; f++) {
			combo1.addItem(String.valueOf(f));
		}
		add(combo1);
		etiqueta2 = new JLabel("Verde");
		etiqueta2.setBounds(10,50,100,30);
		add(etiqueta2);
		combo2 = new JComboBox();
		combo2.setBounds(120,50,50,30);
		for(int f = 0; f <= 255; f++) {
			combo2.addItem(String.valueOf(f));
		}
		add(combo2);
		etiqueta3 = new JLabel("Azul");
		etiqueta3.setBounds(10,90,100,30);
		add(etiqueta3);
		combo3 = new JComboBox();
		combo3.setBounds(120,90,50,30);
		for(int f = 0; f <= 255; f++) {
			combo3.addItem(String.valueOf(f));
		}
		add(combo3);
		boton1 = new JButton("Fijar Color");
		boton1.setBounds(10,130,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad1 = (String)combo1.getSelectedItem();
			String cad2 = (String)combo1.getSelectedItem();
			String cad3 = (String)combo1.getSelectedItem();
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul =Integer.parseInt(cad3);
			Color color1 = new Color(rojo, verde, azul);
			boton1.setBackground(color1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaSeleccion form = new VentanaSeleccion();
		form.setBounds(0, 0, 200, 150);
		form.setVisible(true);
	}

}
