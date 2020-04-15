package interfacesVisuales;

import java.awt.event.*;
import javax.swing.*;

public class VenSeleccion extends JFrame implements ActionListener{

	private JLabel etiqueta1, etiqueta2;
	private JTextField campoTe;
	private JComboBox combo;
	private JButton boton;
	
	public VenSeleccion() {
		setLayout(null);
		etiqueta1 = new JLabel("Usuario");
		etiqueta1.setBounds(10,10,100,30);
		add(etiqueta1);
		etiqueta2 = new JLabel("Pais");
		add(etiqueta2);
		campoTe = new JTextField();
		campoTe.setBounds(120,10,120,30);
		add(campoTe);
		combo = new JComboBox();
		combo.setBounds(120,50,100,30);
		combo.addItem("Argentina");
		combo.addItem("Chile");
		combo.addItem("España");
		combo.addItem("Brasil");
		combo.addItem("Turquia");
		add(combo);
		boton = new JButton("Confirmar");
		boton.setBounds(10,100,100,30);
		boton.addActionListener(this);
		add(boton);		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			String nombre = campoTe.getText();
			String pais = (String)combo.getSelectedItem();
			setTitle(nombre + " - " + pais);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VenSeleccion form = new VenSeleccion();
		form.setBounds(10,20,300,200);
		form.setVisible(true);
	}

}
