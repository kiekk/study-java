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

		JButton btnMyInfo = new JButton("내 정보 보기");
		JButton btnCheckMyOrder = new JButton("주문 확인");
		JButton btnOrder = new JButton("주문 하기");
		
		//메인 페이지 pan_User_Main 생성
		JPanel pan_User_Main = new JPanel();
		pan_User_Main.setLayout(null);
		btnMyInfo.setBounds(100, 100, 500, 100);
		btnCheckMyOrder.setBounds(100, 250, 500, 100);
		btnOrder.setBounds(100, 400, 500, 100);
		pan_User_Main.add(btnMyInfo);
		pan_User_Main.add(btnCheckMyOrder);
		pan_User_Main.add(btnOrder);
		
		
		//내 정보 보기 pan_MyInfo 생성
		JPanel pan_MyInfo = new JPanel();
		pan_MyInfo.setLayout(null);
		Label nickName = new Label("NickName : ");
		Label pw = new Label("Password : ");
		Label name = new Label("Name : ");
		Label tel = new Label("Tel : ");
		Label money = new Label("잔액 : ");
		TextField tfNickName = new TextField(userData.getNickName());
		TextField tfPw = new TextField(userData.getPw());
		TextField tfName = new TextField(userData.getName());
		TextField tfTel = new TextField(userData.getTel());
		TextField tfMoney = new TextField(userData.getChargingMoney()+"원");
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
		
		//주문 확인 pan_CheckOrder 생성
		
		//주문 하기 OrderFrame 생성
		
		//패널 추가
		add(pan_MyInfo);
		add(pan_User_Main);
		pan_User_Main.setVisible(true);
		setVisible(true);
		//정보 보기 버튼
		btnMyInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_MyInfo, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_MyInfo.setVisible(true);
				//뒤로가기
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
		//주문 하기 버튼
		btnOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new OrderFrame(userData);
			}
		});
	}
}
