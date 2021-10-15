package Econogen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame {
	
	JMenuBar barra = new JMenuBar();
	
	JMenu menu1 = new JMenu("Opções");
	JMenu menu2 = new JMenu("Sair");
	
	JMenuItem item1 = new JMenuItem("Cadastrar");
	JMenuItem item2 = new JMenuItem("Atualizar");
	JMenuItem item3 = new JMenuItem("Exit");
	
	public Menu() {
		
		setJMenuBar(barra);
		barra.add(menu1);
		barra.add(menu2);
		
		menu1.add(item1);
		menu1.add(item2);
		menu2.add(item3);
		
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
				});
		
		setTitle("Menu");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Menu();
	}

}
