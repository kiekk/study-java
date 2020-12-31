package posProgram2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class OrderPanel extends JPanel {
	JButton[] menuBtn = new JButton[16];
	String[] menu = {
			"�Ƹ޸�ī��","ICE�Ƹ޸�ī��","ī���","ICEī���",
			"ī���ī","īǪġ��","�ٴҶ��","ICE�ٴҶ��",
			"������","���̽�Ƽ","�ڸ����̵�","û�������̵�",
			"���⽺����","��纣��������","����Ƽ","������"};
	int[] price = {
			1500,1800,2500,2500,
			3000,3000,3500,3500,
			3500,2500,3500,3500,
			4000,4000,3000,3000
			};
	JTextField tf = new JTextField(30);
	JButton[] SBtn = new JButton[4];
	String[] Str = {"����","�������","��ü���","����"};
	String [] menuName = {"�޴�","����","����"};
	String [][] Data ;
	int count = 1;
	DefaultTableModel model = new DefaultTableModel(Data,menuName);
	JTable table = new JTable(model);
	
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.WHITE);
			table.setRowHeight(50);
			table.getTableHeader().setFont(new Font("�������", Font.BOLD, 15));
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
		
		//�ֹ� �޴�
		sc.setSize(600, 300);
		sc.setLocation(-20, 450);
		add(sc);
		//�޴� ��ư
		mbtn.setSize(750, 400);
		mbtn.setLocation(50, 10);
		add(mbtn);
		//���� ��ư
		sbtn.setSize(250, 250);
		sbtn.setLocation(550, 460);
		add(sbtn);
		
		//�޴��߰�
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
		//������ư 
		SBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				table.setValueAt(0, table.getSelectedRow(), 2);
			}
		});
		//������ҹ�ư
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				m.removeRow(table.getSelectedRow());
			}
		});
		//��ü��ҹ�ư
		SBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
			}
		});
		//������ư
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
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.");
					JOptionPane.showMessageDialog(null, "�ܾ� : "+tmp.getChargingMoney() );
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.setRowCount(0);
					tf.setText(String.valueOf(""));
				}else {
					JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�.");
				}
			}
		});
	}
}

