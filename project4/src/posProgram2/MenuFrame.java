package posProgram2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame extends JFrame{
	public MenuFrame(){
		setSize(1200, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		getContentPane().setLayout(null);
		
		JPanel menu_List = new JPanel();
		menu_List.setLayout(new GridLayout(5, 1, 10, 10));
		JButton[] menu = new JButton[10];
		for(int i = 0;i<menu.length;i++) {
			menu_List.add(new JButton("¹öÆ°"));
		}
		
		add(menu_List,BorderLayout.NORTH);
		setVisible(true);
	}
}
