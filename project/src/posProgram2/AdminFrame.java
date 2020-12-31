package posProgram2;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminFrame extends JFrame{
	public AdminFrame(ArrayList<Customer> list) {
		setTitle("Admin Page");
		setSize(700,800);
		setLocationRelativeTo(null);
		
		JButton btnUserList = new JButton("ȸ�� ��Ȳ");
		JButton btnCheckOrderList = new JButton("�ֹ� ��Ȳ");
		JButton btnTodaySales = new JButton("���� ����");
		
		//���� ������ pan_Admin_Main ����
		JPanel pan_Admin_Main = new JPanel();
		pan_Admin_Main.setLayout(null);
		btnUserList.setBounds(100, 100, 500, 100);
		btnCheckOrderList.setBounds(100, 250, 500, 100);
		btnTodaySales.setBounds(100, 400, 500, 100);
		pan_Admin_Main.add(btnUserList);
		pan_Admin_Main.add(btnCheckOrderList);
		pan_Admin_Main.add(btnTodaySales);
		add(pan_Admin_Main);
		setVisible(true);
		
		
		//ȸ�� ��Ȳ
		btnUserList.addMouseListener(new MouseAdapter() {
			
		});
		//�ֹ� ��Ȳ
		btnCheckOrderList.addMouseListener(new MouseAdapter() {
		});
		//���� ����
		btnTodaySales.addMouseListener(new MouseAdapter() {
		});
	}
}
