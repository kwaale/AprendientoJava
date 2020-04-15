package interfacesVisuales;

import javax.swing.*;

public class Formulario1 extends JFrame{
	// JFrame
	private JLabel label1,label2; 
	public Formulario1() {
		setLayout(null);							//Diseño(nulo)
		label1 = new JLabel("Nombre Programa");		//Etiqueta creando el objeto y texto
		label1.setBounds(10, 60, 200, 20);			//Limites etiqueta, (eje x, eje y, espacio que ocupa, altura que ocupa)
		add(label1);								//Agregar Etiqueta.
		label2 = new JLabel("Version 1.2");			
		label2.setBounds(10, 100, 100, 30);
		add(label2);
	}
	public static void main(String[] args) {
		Formulario1 form = new Formulario1();		//Crear objeto de la clase para hacer la ventana.
		form.setBounds(0, 0, 300, 100);				//Limites ventana (Ubicacion x,y; tamaño ancho y alto)
		form.setResizable(false);					//Redimension cambio del tamaño de la ventana con mouse Falso.
		form.setVisible(true);						//Hacer visible la ventana.
		
		
	}

}
