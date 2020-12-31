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
		
		JButton btnUserList = new JButton("회원 현황");
		JButton btnCheckOrderList = new JButton("주문 현황");
		JButton btnTodaySales = new JButton("매출 내역");
		
		//메인 페이지 pan_Admin_Main 생성
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
		
		
		//회원 현황
		btnUserList.addMouseListener(new MouseAdapter() {
			
		});
		//주문 현황
		btnCheckOrderList.addMouseListener(new MouseAdapter() {
		});
		//매출 내역
		btnTodaySales.addMouseListener(new MouseAdapter() {
		});
	}
}
