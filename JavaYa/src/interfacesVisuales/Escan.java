package interfacesVisuales;

import java.awt.event.*;
import javax.swing.*;

public class Escan extends JFrame implements ActionListener {
	private JTextField recibes1,recibes2;
	private JLabel etiqueta;
	private JButton boton;

	public Escan() {
		setLayout(null);
		etiqueta = new JLabel("Usuario");
		etiqueta.setBounds(10,10,100,30);
		add(etiqueta);
		boton = new JButton("Aceptar");
		boton.setBounds(120,10,150,20);
		add(boton);
		boton.addActionListener(this);
		recibes1 = new JTextField();
		recibes1.setBounds(10,90,100,30);
		add(recibes1);
		recibes2 = new JTextField();
		recibes2.setBounds(10,50,100,30);
		add(recibes2);
	}
		public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			String cad1 = recibes1.getText();
			String cad2 = recibes2.getText();
			int x = Integer.parseInt(cad1);
			int y = Integer.parseInt(cad2);
			int suma = x + y;
			String total = String.valueOf(suma);
			setTitle(total);
		}
	}

	public static void main(String[] args) {
		Escan form = new Escan();
		form.setVisible(true);
		form.setBounds(0,0,350,170);
		


	}

}
