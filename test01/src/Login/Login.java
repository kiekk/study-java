package Login;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import MemberList.MemberList;

public class Login{
	public void LogIn() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		Image img =new ImageIcon("D:\\eclipse-workspace\\요기여 Project\\src\\Login\\MainProcess\\요기여.jpg").getImage().getScaledInstance(1600,900, 0);
		JLabel labelimg = new JLabel(new ImageIcon(img));
		JLabel label = new JLabel("ID : ");
		label.setLocation(613, 300);
		label.setSize(200,50);
		JLabel pswrd = new JLabel("password : ");
		pswrd.setLocation(700, 400);
		pswrd.setSize(200,50);
		JTextField txtID = new JTextField(15);
		txtID.setLocation(800, 307);
		txtID.setSize(180,40);
		JPasswordField txtPass = new JPasswordField(15);
		txtPass.setLocation(800,407);
		txtPass.setSize(180,40);
		JButton btn1 = new JButton("로 그 인");
		btn1.setBounds(1000,280,150,50);
		JButton btn2 = new JButton("관리자 모드 로그인"); 
		btn2.setBounds(1000,340,150,50);
		JButton btn3 = new JButton("회 원 가 입");
		btn3.setBounds(1000,400,150,50);
		frame.setTitle("요기여 Login Display");
		frame.setSize(1600, 900);
		frame.setResizable(false);
		frame.add(panel);
		frame.setLocationRelativeTo(null);

		panel.setSize(320,100);
		panel.setLocation(800, 450);

		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(labelimg);

		panel.add(label);

		panel.add(pswrd);

		panel.add(txtID);

		panel.add(txtPass);

		panel.add(btn1);

		panel.add(btn2);

		panel.add(btn3);

		frame.setVisible(true);

		btn1.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				try {

					String id;

					String[] array;

					BufferedReader bos = new BufferedReader(new FileReader("members.txt"));;

					while((id=bos.readLine())!=null) {

						array=id.split("/");

						if(label.equals(txtID.getText())&&pswrd.getText().equals(array[2])){

							JOptionPane.showMessageDialog(null, "로그인 되셨습니다");


						} else {

							JOptionPane.showMessageDialog(null, "계정 정보를 다시 확인해주세요.");

						}

					}

					bos.close();

				} catch (IOException e10) {


					e10.printStackTrace();

				}

			}

		});


		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String superid = "admin";

				String superpass = "admin";

				if(superid.equals(txtID.getText())&&superpass.equals(txtPass.getText())){

					JOptionPane.showMessageDialog(null, "로그인 되셨습니다");

					return; // 관리자 권한 페이지 CRUD 전환

				} else {

					JOptionPane.showMessageDialog(null, "관리자에게 문의해주세요.");

				}

			}

		});

		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				MemberList ml = new MemberList();

			}
		});
		// try {

		// // img = ImageIO.read(new File(C:\\eclipse-workspace\\요기여 Project\\src\\Login\\MainProcess\\요기여.png));

		// 

		// } catch (IOException e) {

		// JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");

		// System.exit(0);

		// }

		// 

		// 닫기 버튼 클릭 시 프로세스 종료

		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 눈에 보이게
	}

}