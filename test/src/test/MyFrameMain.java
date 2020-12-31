package test;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrameMain extends JFrame {
	JButton jb;
	JButton jb2;

	class InnerFrame extends JFrame{
	
		InnerFrame(){
			setBounds(400, 200, 300, 300);
			jb2 = new JButton("버튼2 관리자페이지");
			jb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					new MyFrameMain();
					
				}
			});
			add(jb2);
			
			setVisible(true);
		}
		
	}
	public MyFrameMain() {
		setBounds(200, 200, 300, 300);
		jb = new JButton("버튼1 메인");	
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new InnerFrame();
				dispose();
				
			}
		});
		add(jb);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) throws IOException {
		MyFrameMain f = new MyFrameMain();
		//DataInputStream di = new DataInputStream(new FileInputStream(new File("C:\\")));
		//di.readUTF();

	}

}
