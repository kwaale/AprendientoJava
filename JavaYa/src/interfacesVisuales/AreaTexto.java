package interfacesVisuales;

import java.awt.event.*;

import javax.swing.*;

public class AreaTexto extends JFrame implements ActionListener{
	private JButton boton;
	private JScrollPane escrol;
	private JTextArea areaTexto;
	
	public AreaTexto() {
		setLayout(null);
		boton = new JButton("Verificar");
		boton.setBounds(10,400,100,30);
		add(boton);
		areaTexto = new JTextArea();
		areaTexto.setBounds(10,80,400,300);
		add(areaTexto);
		escrol = new JScrollPane(areaTexto);//Scroll por si el texto es mas largo
		escrol.setBounds(10,50,400,300);
		add(escrol);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton) {
			String texto = areaTexto.getText();
			if(texto.indexOf("argentina")!= -1) {
				setTitle("Si contiene el texto \"argentina\"");
			}else {
				setTitle("No contiene el texto \"argentina\"");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaTexto form = new AreaTexto();
		form.setBounds(0,0,540,400);
		form.setVisible(true);
	}

}
