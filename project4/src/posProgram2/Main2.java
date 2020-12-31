package posProgram2;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//���� class
class MainFrame extends JFrame{
	ArrayList<Customer> userList = new ArrayList<>();
	//ȸ�� ��Ȳ
	void init() {
		//�ʱ�ȭ
		userList.add(new Customer("ȫ�浿","01011112222","hong","1111",50000));
		userList.add(new Customer("������","0101234578","gam","2222",10000));
		userList.add(new Customer("�ڹ���","01011113333","park","3333",20000));
		userList.add(new Customer("���缮","01011113456","jaesuck","4444",25000));
		userList.add(new Customer("������","01023467782","don","5555",30000));

		for(int i = 0;i<userList.size();i++) {
			System.out.println(userList.get(i).name);
		}
	}
	void userLogin(Customer tmp) {
		Customer log_NickName = checkNickName(tmp.getNickName());
		if(log_NickName != null) {
			if(userList.get(userList.indexOf(log_NickName)).getPw().equals(tmp.getPw())) {
				JOptionPane.showMessageDialog(null, "�α��� ����");
				//				new PosController().userMenu(userList.get(userList.indexOf(log_NickName)));
			}else {
				JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���� �ּ���");
			}
		}else {
			JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���� �ּ���");
		}
	}
	public boolean login(String nickName,String pw) {
		Customer log_NickName = checkNickName(nickName);
		if(log_NickName != null) {
			if(userList.get(userList.indexOf(log_NickName)).getPw().equals(pw))	return true;
		}
		return false;
	}
	//ȸ�� ���� 
	boolean join(Customer std) {
		if(checkNickName(std.getNickName()) == null) {	
			std.setPw(std.getPw());
			userList.add(std);	
			return true;	
		}else {								
			return false;	
		} 
	}
	//�ߺ� �˻�
	Customer checkNickName(String nickName) {
		Customer std = null;
		for (Customer tmp : userList) {
			if(tmp.getNickName().equals(nickName)) {
				std = tmp;					
			}//end if
		}//end for
		return std;	
	}
	public MainFrame() {

		setTitle("Cafe Main");
		setSize(700,800);									//������ ����
		setLocationRelativeTo(null);						//��� ��ġ
		setResizable(false);								//������ ���� �Ұ���
		setVisible(true);									//visible true
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//�ݱ��ư

		//���������� pan_Start ����
		JPanel pan_Start = new JPanel();
		pan_Start.setLayout(null);
		JButton btnStart = new JButton("Start");
		pan_Start.add(btnStart);
		setVisible(true);
		btnStart.setBounds(0, 700, 700, 99);

		//���� ������ pan_Main ����
		JPanel pan_Main = new JPanel();
		pan_Main.setLayout(null);
		JButton btnLogin = new JButton("�α���");
		JButton btnSignUp = new JButton("ȸ������");
		JButton btnAdmin = new JButton("������ ���");
		pan_Main.add(btnLogin);
		pan_Main.add(btnSignUp);
		pan_Main.add(btnAdmin);
		pan_Main.setVisible(false);
		btnLogin.setBounds(100, 350, 500, 100);
		btnSignUp.setBounds(100, 500, 500, 100);
		btnAdmin.setBounds(100, 650, 500, 50);

		//�α��� ������ pan_Login ����
		JPanel pan_Login = new JPanel();
		pan_Login.setLayout(null);
		Label nickName = new Label("NickName : ", Label.RIGHT);
		Label pw = new Label("Password :",Label.RIGHT);
		TextField tfNickName = new TextField(10);
		TextField tfPw = new TextField(10);
		tfPw.setEchoChar('*');
		JButton ok = new JButton("OK");
		JButton back = new JButton("Back");
		pan_Login.add(nickName);
		pan_Login.add(pw);
		pan_Login.add(tfNickName);
		pan_Login.add(tfPw);
		pan_Login.add(ok);
		pan_Login.add(back);
		nickName.setBounds(30, 150, 100, 10);
		tfNickName.setBounds(130, 150, 400, 30);
		pw.setBounds(30, 300, 100, 10);
		tfPw.setBounds(130, 300, 400, 30);
		ok.setBounds(100, 450, 200, 100);
		back.setBounds(350, 450, 200, 100);

		//ȸ�� ������ pan_SignUp ����
		JPanel pan_SignUp = new JPanel();
		pan_SignUp.setLayout(null);
		Label nickName2 = new Label("NickName : ");
		Label pw2 = new Label("Password : ");
		Label name = new Label("Name : ");
		Label tel = new Label("Tel : ");
		TextField tfNickName2 = new TextField(10);
		TextField tfPw2 = new TextField(10);
		TextField tfName = new TextField(10);
		TextField tfTel = new TextField(10);
		tfPw.setEchoChar('*');
		JButton ok2 = new JButton("OK");
		JButton back2 = new JButton("Back");
		nickName2.setBounds(30, 100, 100, 10);
		tfNickName2.setBounds(130, 100, 400, 30);
		pw2.setBounds(30, 200, 100, 10);
		tfPw2.setBounds(130, 200, 400, 30);
		name.setBounds(30, 300, 100, 10);
		tfName.setBounds(130, 300, 400, 30);
		tel.setBounds(30, 400, 100, 10);
		tfTel.setBounds(130, 400, 400, 30);
		ok2.setBounds(100, 500, 200, 100);
		back2.setBounds(350,500, 200, 100);
		pan_SignUp.add(nickName2);
		pan_SignUp.add(tfNickName2);
		pan_SignUp.add(pw2);
		pan_SignUp.add(tfPw2);
		pan_SignUp.add(name);
		pan_SignUp.add(tfName);
		pan_SignUp.add(tel);
		pan_SignUp.add(tfTel);
		pan_SignUp.add(ok2);
		pan_SignUp.add(back2);

		//������ ������ pan_Admin ����
		JPanel pan_Admin = new JPanel();
		pan_Admin.setLayout(null);
		Label nickName3 = new Label("NickName : ", Label.RIGHT);
		Label pw3 = new Label("Password :",Label.RIGHT);
		TextField tfNickName3 = new TextField(10);
		TextField tfPw3 = new TextField(10);
		tfPw.setEchoChar('*');
		JButton ok3 = new JButton("OK");
		JButton back3 = new JButton("Back");
		pan_Login.add(nickName3);
		pan_Login.add(pw3);
		pan_Login.add(tfNickName3);
		pan_Login.add(tfPw3);
		pan_Login.add(ok3);
		pan_Login.add(back3);
		nickName3.setBounds(30, 150, 100, 10);
		tfNickName3.setBounds(130, 150, 400, 30);
		pw3.setBounds(30, 300, 100, 10);
		tfPw3.setBounds(130, 300, 400, 30);
		ok3.setBounds(100, 450, 200, 100);
		back3.setBounds(350, 450, 200, 100);
		pan_Admin.add(nickName3);
		pan_Admin.add(pw3);
		pan_Admin.add(tfNickName3);
		pan_Admin.add(tfPw3);
		pan_Admin.add(ok3);
		pan_Admin.add(back3);

		//�г� �߰�
		add(pan_Admin);
		add(pan_SignUp);
		add(pan_Login);
		add(pan_Main);
		add(pan_Start);
		//�����ϱ�
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_Main, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_Main.setVisible(true);
			}
		});//btnStart
		//�α��� ��ư
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_Login, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_Login.setVisible(true);
				ok.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						//						if()
						setVisible(false);
						new POS_Frame();
					}
				});
				//�ڷΰ���
				back.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						getContentPane().removeAll(); 
						getContentPane().add(pan_Main, BorderLayout.CENTER);
						setContentPane(getContentPane()); 
						pan_Main.setVisible(true);
					}
				});//back
			}
		});//btnLogin
		//ȸ������
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_SignUp, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_SignUp.setVisible(true);
				ok2.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						if(tfNickName2.getText().equals("")||tfPw2.getText().equals("")||tfName.getText().equals("")||tfTel.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "�׸��� ��� �Է����ּ���");
						}else {
//							if(join(tfNickName2.getText())) {
								userList.add(new Customer(tfNickName2.getText(),tfPw2.getText(),tfName.getText(),tfTel.getText()));
								JOptionPane.showMessageDialog(null, "ȸ������ ����");
								tfNickName2.setText("");
								tfPw2.setText("");
								tfName.setText("");
								tfTel.setText("");
								getContentPane().removeAll(); 
								getContentPane().add(pan_Main, BorderLayout.CENTER);
								setContentPane(getContentPane()); 
								pan_Main.setVisible(true);
//							}else {
								JOptionPane.showMessageDialog(null, "�ش� ID�� �̹� �����մϴ�");
//							}
						}
					}
				});
				//�ڷΰ���
				back2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						getContentPane().removeAll(); 
						getContentPane().add(pan_Main, BorderLayout.CENTER);
						setContentPane(getContentPane()); 
						pan_Main.setVisible(true);
					}
				});//back
			}
		});//end btnSignUp

		//������ ���
		btnAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_Admin, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_Admin.setVisible(true);
				//�ڷΰ���
				back3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						getContentPane().removeAll(); 
						getContentPane().add(pan_Main, BorderLayout.CENTER);
						setContentPane(getContentPane()); 
						pan_Main.setVisible(true);
					}
				});//back
			}
		});//end btnAdmin
	}
}

public class Main2 {
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();

	}
}
