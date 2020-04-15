package interfaceVisuales;

import java.awt.Label;

import javax.swing.*;
public class Form2 extends JFrame{
	private Label label1, label2;
	
	public Form2(){
		setLayout(null);
		label1 = new Label("Sistema Facturacion");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		label2 = new Label("Vercion 1.0");
		label2.setBounds(10, 100, 100, 30);
		add(label2);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Form2 form = new Form2();
		form.setBounds(300, 200, 400, 200);
		form.setResizable(true);
		form.setVisible(true);
	}

}
