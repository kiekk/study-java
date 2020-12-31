package posProgram2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class OrderPanel extends JPanel {
	JButton[] menuBtn = new JButton[16];
	String[] menu = {
			"아메리카노","ICE아메리카노","카페라떼","ICE카페라떼",
			"카페모카","카푸치노","바닐라라떼","ICE바닐라라떼",
			"녹차라떼","아이스티","자몽에이드","청포도에이드",
			"딸기스무디","블루베리스무디","레몬티","유자차"};
	int[] price = {
			1500,1800,2500,2500,
			3000,3000,3500,3500,
			3500,2500,3500,3500,
			4000,4000,3000,3000
			};
	JTextField tf = new JTextField(30);
	JButton[] SBtn = new JButton[4];
	String[] Str = {"쿠폰","선택취소","전체취소","결제"};
	String [] menuName = {"메뉴","수량","가격"};
	String [][] Data ;
	int count = 1;
	DefaultTableModel model = new DefaultTableModel(Data,menuName);
	JTable table = new JTable(model);
	
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.WHITE);
			table.setRowHeight(50);
			table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 15));
			add(new JScrollPane(table));
		}
	}
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(3,6));
			setBackground(Color.WHITE);
			for(int i=0;i<menuBtn.length;i++) {
				menuBtn[i]= new JButton(menu[i]);
				add(menuBtn[i]);
			}
		}
	}
	class StrBtn extends JPanel{
		StrBtn(){
			setBackground(Color.WHITE);
			setLayout(new GridLayout(2,2));
			
			for(int i=0;i<Str.length;i++) {
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
			}
		}
	}
	public OrderPanel(Customer tmp) {
		Customer userData = tmp;
		setLayout(null);
		setBackground(Color.WHITE);
		
		MenuBtn mbtn = new MenuBtn();
		StrBtn sbtn = new StrBtn();
		Screen sc = new Screen();
		
		//주문 메뉴
		sc.setSize(600, 300);
		sc.setLocation(-20, 450);
		add(sc);
		//메뉴 버튼
		mbtn.setSize(750, 400);
		mbtn.setLocation(50, 10);
		add(mbtn);
		//결제 버튼
		sbtn.setSize(250, 250);
		sbtn.setLocation(550, 460);
		add(sbtn);
		
		//메뉴추가
		for(int i=0;i<menuBtn.length;i++) {
			final int index =i;
			menuBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel m = (DefaultTableModel)table.getModel();

					m.addRow(new Object[]{menu[index],count,price[index]});
				}
			});
		}
		//쿠폰버튼 
		SBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				table.setValueAt(0, table.getSelectedRow(), 2);
			}
		});
		//선택취소버튼
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				m.removeRow(table.getSelectedRow());
			}
		});
		//전체취소버튼
		SBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
			}
		});
		//결제버튼
		SBtn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 2);
				}
				if(userData.getChargingMoney() > sum) {
					userData.setChargingMoney(userData.getChargingMoney()-sum);
					for(int i=0;i<rowCont;i++) {
						userData.menuList.add(new OrderMenu(menu[i],price[i]));
					}
					JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
					JOptionPane.showMessageDialog(null, "잔액 : "+tmp.getChargingMoney() );
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.setRowCount(0);
					tf.setText(String.valueOf(""));
				}else {
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
				}
			}
		});
	}
}

