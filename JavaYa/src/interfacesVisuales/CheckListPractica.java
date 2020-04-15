package interfacesVisuales;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CheckListPractica extends JFrame implements ActionListener{
	//Disponer tres objetos de la clase JCheckBox con nombres de navegadores web.
	//Cuando se presione un botón mostrar en el título del JFrame los
	//programas seleccionados.
	private JCheckBox box1, box2, box3;
	private JButton bot;
	
	public CheckListPractica() {
		setLayout(null);
		box1 = new JCheckBox("Chrome");
		box1.setBounds(10,10,150,30);
		add(box1);
		box2 = new JCheckBox("Explorer");
		box2.setBounds(10,50,150,30);
		add(box2);
		box3 = new JCheckBox("Opera");
		box3.setBounds(10,90,150,30);
		add(box3);
		bot = new JButton("Mostrar");
		bot.setBounds(10,140,100,30);
		bot.addActionListener(this);
		add(bot);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bot) {
			String cad = "";
			if(box1.isSelected() == true) {
				cad = cad + "Chrome-";
			}
			if(box2.isSelected() == true) {
				cad = cad + "Explorer-";
			}
			if(box3.isSelected() == true) {
				cad = cad+ "Opera-";
			}
			setTitle(cad);
		}
	
		
	}
	
	public static void main(String[] args) {
		CheckListPractica form = new CheckListPractica();
		form.setBounds(50, 50, 500, 300);
		form.setVisible(true);
	}
	

	

}
