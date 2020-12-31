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

//메인 class
class MainFrame extends JFrame{
	ArrayList<Customer> userList = new ArrayList<>();
	//회원 현황
	void init() {
		//초기화
		userList.add(new Customer("홍길동","01011112222","hong","1111",50000));
		userList.add(new Customer("강감찬","0101234578","gam","2222",10000));
		userList.add(new Customer("박문수","01011113333","park","3333",20000));
		userList.add(new Customer("유재석","01011113456","jaesuck","4444",25000));
		userList.add(new Customer("정형돈","01023467782","don","5555",30000));

		for(int i = 0;i<userList.size();i++) {
			System.out.println(userList.get(i).name);
		}
	}
	void userLogin(Customer tmp) {
		Customer log_NickName = checkNickName(tmp.getNickName());
		if(log_NickName != null) {
			if(userList.get(userList.indexOf(log_NickName)).getPw().equals(tmp.getPw())) {
				JOptionPane.showMessageDialog(null, "로그인 성공");
				//				new PosController().userMenu(userList.get(userList.indexOf(log_NickName)));
			}else {
				JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 다시 확인해 주세요");
			}
		}else {
			JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 다시 확인해 주세요");
		}
	}
	public boolean login(String nickName,String pw) {
		Customer log_NickName = checkNickName(nickName);
		if(log_NickName != null) {
			if(userList.get(userList.indexOf(log_NickName)).getPw().equals(pw))	return true;
		}
		return false;
	}
	//회원 가입 
	boolean join(Customer std) {
		if(checkNickName(std.getNickName()) == null) {	
			std.setPw(std.getPw());
			userList.add(std);	
			return true;	
		}else {								
			return false;	
		} 
	}
	//중복 검사
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
		setSize(700,800);									//사이즈 설정
		setLocationRelativeTo(null);						//가운데 배치
		setResizable(false);								//사이즈 조절 불가능
		setVisible(true);									//visible true
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//닫기버튼

		//시작페이지 pan_Start 생성
		JPanel pan_Start = new JPanel();
		pan_Start.setLayout(null);
		JButton btnStart = new JButton("Start");
		pan_Start.add(btnStart);
		setVisible(true);
		btnStart.setBounds(0, 700, 700, 99);

		//메인 페이지 pan_Main 생성
		JPanel pan_Main = new JPanel();
		pan_Main.setLayout(null);
		JButton btnLogin = new JButton("로그인");
		JButton btnSignUp = new JButton("회원가입");
		JButton btnAdmin = new JButton("관리자 모드");
		pan_Main.add(btnLogin);
		pan_Main.add(btnSignUp);
		pan_Main.add(btnAdmin);
		pan_Main.setVisible(false);
		btnLogin.setBounds(100, 350, 500, 100);
		btnSignUp.setBounds(100, 500, 500, 100);
		btnAdmin.setBounds(100, 650, 500, 50);

		//로그인 페이지 pan_Login 생성
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

		//회원 페이지 pan_SignUp 생성
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

		//관리자 페이지 pan_Admin 생성
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

		//패널 추가
		add(pan_Admin);
		add(pan_SignUp);
		add(pan_Login);
		add(pan_Main);
		add(pan_Start);
		//시작하기
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_Main, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_Main.setVisible(true);
			}
		});//btnStart
		//로그인 버튼
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
				//뒤로가기
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
		//회원가입
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
							JOptionPane.showMessageDialog(null, "항목을 모두 입력해주세요");
						}else {
//							if(join(tfNickName2.getText())) {
								userList.add(new Customer(tfNickName2.getText(),tfPw2.getText(),tfName.getText(),tfTel.getText()));
								JOptionPane.showMessageDialog(null, "회원가입 성공");
								tfNickName2.setText("");
								tfPw2.setText("");
								tfName.setText("");
								tfTel.setText("");
								getContentPane().removeAll(); 
								getContentPane().add(pan_Main, BorderLayout.CENTER);
								setContentPane(getContentPane()); 
								pan_Main.setVisible(true);
//							}else {
								JOptionPane.showMessageDialog(null, "해당 ID는 이미 존재합니다");
//							}
						}
					}
				});
				//뒤로가기
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

		//관리자 모드
		btnAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().removeAll(); 
				getContentPane().add(pan_Admin, BorderLayout.CENTER);
				setContentPane(getContentPane()); 
				pan_Admin.setVisible(true);
				//뒤로가기
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
