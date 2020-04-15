package interfacesVisuales;


import java.awt.event.*;
import javax.swing.*;

public class MenuVarios extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu;
	private JMenuItem mi1, mi2;
	private JTextField camp1,camp2;
	
	public MenuVarios() {
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu = new JMenu("Opciones");
		mb.add(menu);
		mi1 = new JMenuItem("Redimensionar ventana");
		menu.add(mi1);
		mi1.addActionListener(this);
		mi2 = new JMenuItem("Salir");
		menu.add(mi2);
		mi2.addActionListener(this);
		camp1 = new JTextField();
		camp1.setBounds(10,10,100,30);
		add(camp1);
		camp2 = new JTextField();
		camp2.setBounds(10,50,100,30);
		add(camp2);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mi1) {
			String cad1 = camp1.getText();
			String cad2 = camp2.getText();
			int ancho = Integer.parseInt(cad1);
			int alto = Integer.parseInt(cad2);
			setSize(ancho,alto);
		}
		if(e.getSource() == mi2) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		MenuVarios form = new MenuVarios();
		form.setBounds(10,10,300,300);
		form.setVisible(true);

	}

	

}
