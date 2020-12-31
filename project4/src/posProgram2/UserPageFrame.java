package posProgram2;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.w3c.dom.UserDataHandler;

public class UserPageFrame extends JFrame{

	public UserPageFrame(Customer tmp) {
		Customer userData = tmp;
		setTitle("User Page");
		setSize(700,800);
		setLocationRelativeTo(null);

		JButton btnMyInfo = new JButton("�� ���� ����");
		JButton btnCheckMyOrder = new JButton("�ֹ� Ȯ��");
		JButton btnOrder = new JButton("�ֹ� �ϱ�");
		
		//���� ������ pan_User_Main ����
		JPanel pan_User_Main = new JPanel();
		pan_User_Main.setLayout(null);
		btnMyInfo.setBounds(100, 100, 500, 100);
		btnCheckMyOrder.setBounds(100, 250, 500, 100);
		btnOrder.setBounds(100, 400, 500, 100);
		pan_User_Main.add(btnMyInfo);
		pan_User_Main.add(btnCheckMyOrder);
		pan_User_Main.add(btnOrder);
		
		
		//�� ���� ���� pan_MyInfo ����
		JPanel pan_MyInfo = new JPanel();
		pan_MyInfo.setLayout(null);
		Label nickName = new Label("NickName : ");
		Label pw = new Label("Password : ");
		Label name = new Label("Name : ");
		Label tel = new Label("Tel : ");
		Label money = new Label("�ܾ� : ");
		TextField tfNickName = new TextField(userData.getNickName());
		TextField tfPw = new TextField(userData.getPw());
		TextField tfName = new TextField(userData.getName());
		TextField tfTel = new TextField(userData.getTel());
		TextField tfMoney = new TextField(userData.getChargingMoney()+"��");
		JButton back = new JButton("Back");
		tfNickName.setEditable(false);
		tfPw.setEditable(false);
		tfName.setEditable(false);
		tfTel.setEditable(false);
		tfMoney.setEditable(false);
		pan_MyInfo.add(nickName);
		pan_MyInfo.add(tfNickName);
		pan_MyInfo.add(pw);
		pan_MyInfo.add(tfPw);
		pan_MyInfo.add(name);
		pan_MyInfo.add(tfName);
		pan_MyInfo.add(tel);
		pan_MyInfo.add(tfTel);
		pan_MyInfo.add(money);
		pan_MyInfo.add(tfMoney);
		pan_MyInfo.add(back);
		nickName.setBounds(30, 100, 100, 10);tfNickName.setBounds(130, 100, 400, 30);
		pw.setBounds(30, 200, 100, 10);      tfPw.setBounds(130, 200, 400, 30);
		name.setBounds(30, 300, 100, 10);    tfName.setBounds(130, 300, 400, 30);
		tel.setBounds(30, 400, 100, 10);     tfTel.setBounds(130, 400, 400, 30);
		money.setBounds(30, 510, 100, 10);   tfMoney.setBounds(130, 500, 400, 30);
		back.setBounds(350, 650, 200, 100);
		
		//�ֹ� Ȯ�� pan_CheckOrder ����
		
		//�ֹ� �ϱ� OrderFrame ����
		
		//�г� �߰�
		add(pan_MyInfo);
		add(pan_User_Main);
		pan_User_Main.setVisible(true);
		setVisible(true);
		//���� ���� ��ư
		btnMyInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_MyInfo, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_MyInfo.setVisible(true);
				//�ڷΰ���
				back.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						getContentPane().removeAll(); 
						getContentPane().add(pan_User_Main, BorderLayout.CENTER);
						setContentPane(getContentPane()); 
						pan_User_Main.setVisible(true);
					}
				});
			}
		});//btnMyInfo
		//�ֹ� �ϱ� ��ư
		btnOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new OrderFrame(userData);
			}
		});
	}
}
