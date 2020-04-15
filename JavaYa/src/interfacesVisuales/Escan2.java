package interfacesVisuales;

import java.awt.event.*;
import javax.swing.*;

public class Escan2 extends JFrame implements ActionListener {
	private JTextField recibes1,recibes2;
	private JLabel etiqueta,etiqueta2;
	private JButton boton;

	public Escan2() {
		setLayout(null);						//Diseño Null
		etiqueta = new JLabel("Nombre");		//Crear Objeto Etiqueta y Su nombre
		etiqueta.setBounds(10,10,100,30);		//Ubicaion
		add(etiqueta);							//Agregar Etiqueta.
		etiqueta2 = new JLabel("Clave");
		etiqueta2.setBounds(10,50,100,30);
		add(etiqueta2);
		boton = new JButton("Confirmar");		//Boton, crear y dar nombre.
		boton.setBounds(10,100,100,30);			//Ubicaion
		add(boton);								//Agregar Boton.
		boton.addActionListener(this);			//Si va a tener accion, se coloca con el metodo actionPerformed
		recibes1 = new JTextField();
		recibes1.setBounds(130,10,100,30);
		add(recibes1);
		recibes2 = new JTextField();
		recibes2.setBounds(130,50,100,30);
		add(recibes2);
	}
		public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			String cad1 = recibes1.getText();
			String cad2 = recibes2.getText();
			if(cad1.equals("juan")== true && cad2.equals("abc123") == true) {
				setTitle("Correcto");
			}else {
				setTitle("Incorrecto");
			}
			
		}
	}

	public static void main(String[] args) {
		Escan2 form = new Escan2();
		form.setVisible(true);
		form.setBounds(0,0,350,170);
		


	}

}
