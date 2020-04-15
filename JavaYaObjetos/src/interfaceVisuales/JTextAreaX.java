package interfaceVisuales;

import java.awt.event.*;

import javax.swing.*;

public class JTextAreaX extends JFrame implements ActionListener{
	// +++++++++++++ No se porque no sale el boton al ejecutar.
	
		// TODO Auto-generated method stub
		//private JTextField textField1;			//Campo de texto
		private JTextArea textArea1;				//Area de texto
		private JScrollPane scroll;					//Agregar Scroll, abajo esta como hacerlo en lugar especifico.
		private JButton boton1;						//Agregar Boton
	
	public JTextAreaX() {
		setLayout(null); 							//insertar diseño null.
		//textField1 = new JTextField();  			//Crear Objeto
		//textField1.setBounds(10, 10, 200, 30); 		//Establecer Limites
		//add(textField1);							//Agregar el objeto
		textArea1 = new JTextArea();
		scroll = new JScrollPane(textArea1);
		scroll.setBounds(10, 50, 400, 300);
		add(scroll);
		boton1 = new JButton("Verificar");			//Agregar boton.
		boton1.setBounds(10, 260, 100, 30);
		add(boton1);
		boton1.addActionListener(this);				//Accion Boton, hay que crear un metodo.
	}	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String texto = textArea1.getText();
			if(texto.indexOf("Argentina")!=-1) {
				setTitle("Contiene el texto \"argentina\"");
			}else {
				setTitle("No contiene el texto \"argentina\"");
			}
		}
	}
		public static void main(String[] args) {
			JTextAreaX form = new JTextAreaX();
			form.setBounds(0, 0, 500, 400);
			form.setVisible(true);
			
			
	}

}
