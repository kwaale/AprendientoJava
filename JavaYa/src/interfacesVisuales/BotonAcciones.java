package interfacesVisuales;

import java.awt.event.*;
import javax.swing.*;


public class BotonAcciones extends JFrame implements ActionListener{
	JButton boton1,boton2,boton3;
	
	public BotonAcciones() {
		setLayout(null);//Diseño
		boton1 = new JButton("1"); 	//Nombre boton.
		boton1.setBounds(10,100,90,30); 	//Limites, Ubicacion y tamaño boton.
		add(boton1);						//Agregar boton.
		boton1.addActionListener(this);		//Accion del boton this (no se a que se refiere);
		boton2 = new JButton("2");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
		boton3 = new JButton("3");
		boton3.setBounds(210,100,90,30);
		boton3.addActionListener(this);
		add(boton3);

		
	}
	public void actionPerformed(ActionEvent e) { //metodo de clase Abstracta Action Implement
		if(e.getSource()==boton1) {				//boton, clase implementada del boton.
			setTitle("Boton 1");
		}
		if(e.getSource()==boton2) {				//boton, clase implementada del boton.
			setTitle("Boton 2");
		}
		if(e.getSource()==boton3) {				//boton, clase implementada del boton.
			setTitle("Boton 3");
		}
	}
	public static void main(String[] args) {
		BotonAcciones form = new BotonAcciones();
		form.setBounds(0,0, 350, 350);
		form.setResizable(false);
		form.setVisible(true);

	}
	

}
