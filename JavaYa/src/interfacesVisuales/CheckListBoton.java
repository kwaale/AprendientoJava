package interfacesVisuales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CheckListBoton extends JFrame implements ActionListener, ChangeListener{
	private JLabel etiq;
	private JCheckBox box;
	private JButton bot;
	
	public CheckListBoton() {
		setLayout(null);
		etiq = new JLabel("Esta de acuerdo con las normas del servicio?");
		etiq.setBounds(10, 10, 400, 300);
		add(etiq);
		box = new JCheckBox("Aceptar");
		box.setBounds(10,50,100,30);
		box.addChangeListener(this);
		add(box);
		bot = new JButton("Continuar");
		bot.setBounds(10,100,100,30);
		bot.addActionListener(this);
		add(bot);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if(box.isSelected() == true) {
			bot.setEnabled(true);
		}else {
			bot.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bot) {
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckListBoton form = new CheckListBoton();
		form.setBounds(50,50,300,300);
		form.setVisible(true); 
		
	}

	

}
