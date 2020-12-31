package componentEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

import javax.swing.JOptionPane;

/*
 	TextField : ���� ���� �Է� - TextListener, KeyListener
 	TextArea  : ���� ������ �Է� - 
	Panel : Container - FlowLayout

	------------------------------
			  North : Panel(TextField, button)

			  Center : TextArea

			  South : Panel(����, reset, ���� ��ư + �ҷ�����)
 */
/*
 	��ǰ��(TextField, button���� ���� �ϳ��� panel�� �߰��Ͽ� ���������ϴ�.)
 	�׸��� �� panel�� frame�� add�մϴ�.
 */
public class ComponentText {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 100, 600, 400);
		f.setBackground(Color.CYAN);
		Font font = new Font("gulim",Font.PLAIN,20);		//�۾�ü
		//#1. ����
		Panel p_north = new Panel();		//�⺻ layout�� FlowLayout
		p_north.setBackground(Color.GREEN);
		//#1-1. �ؽ�Ʈ �ʵ�, ��ư
		TextField tf = new TextField("",10);		//10�� �ؽ�Ʈ�ʵ��� ���̸� ������ �� ���� �Ű�����
		//������ FlowLayout�� ���󰡱� ������ �ʺ� ������ �� �����ϴ�.
		//������ ũ�⳪ ��Ʈ ������ �÷������� �����ϰ� ������ �ʽ��ϴ�.
		Button btn = new Button("�Է�");
		btn.setEnabled(false);	//��ư�� click�� ��Ȱ��ȭ
		p_north.add(tf);
		p_north.add(btn);
		p_north.setFont(font);
		//#2. �߾�
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);	//���� ��ũ�ѹٸ� �����ϰڴ�.
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false); 		//�����Ұ���
		//#3. ����
		Panel p_south = new Panel();
		p_south.setFont(font);
		p_south.setBackground(Color.MAGENTA);
		Button btnSave = new Button("����");
		Button btnReset	= new Button("�ʱ�ȭ");
		Button btnClose = new Button("�ݱ�");
		Button btnOpen = new Button("�ҷ�����");
		p_south.add(btnSave);
		p_south.add(btnClose);
		p_south.add(btnReset);
		p_south.add(btnOpen);
		//����ǰ ���̱�
		f.add(p_north,BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(p_south, BorderLayout.SOUTH);
		f.setVisible(true);
		f.setResizable(false);		//������ ���� �Ұ���
		//#5. �̺�Ʈ
		//# TextField�� �Էµ� ���� ���� ��� �Է¹�ư�� ��Ȱ��ȭ(false), �Էµ� ���� �־������ Ȱ��ȭ(true)
		// tf���� getText()�� ���ڿ��� �ҷ��� ��, equals("") �� ���ڿ��� ���մϴ�.
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		//#5-2. tf�� ���Ͱ��� �����Ǹ�, ta(TextArea)�� ������ �߰��մϴ�.
		//�� ��, ���Ͱ����� �߰��� �ؾ� �����ٷ� �ٲ�� �˴ϴ�.
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//1. Ű���带 ������ �̺�Ʈ�� �߻��� �˴ϴ�.
				//2. �׷� � Ű���带 �������� e ��ü���� ������� �մϴ�.
				//3. ���� Ű���尪���� ��Ī�Ǿ� �ִ� �����, e��ü�� ������ ���� ���մϴ�.
				// (e��ü�� ������ �� : ���� == ���Ϳ� ��Ī�Ǿ� �ִ� ����� ��)
				//4. tf�� ���ڸ� �����ͼ� ta ��ü�� �߰� ��ŵ�ϴ�.(�߰��Ҷ� \n���� ����)
				//5. �� ��, tf�� ������ ����ϴ�.
				//�ѱ��� ������ ��� �̺�Ʈ�� �߻��մϴ�.
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");	//�ٹٲ��� ���๮�ڵ� ���� �߰�
					//set -> X
					tf.setText("");				//tf�� �ٽ� �ʱ�ȭ
				}
			}
		});
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!tf.getText().equals("")) {
					ta.append(tf.getText()+"\n");	//�ٹٲ��� ���๮�ڵ� ���� �߰�
					//set -> X
					tf.setText("");				//tf�� �ٽ� �ʱ�ȭ
					//tf�� Ŀ���� �ٽ� �ű�ϴ�.
					tf.requestFocus();
				}
			}
		});
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�ݱ� ���� ���忩�θ� ����ϴ�.
				int select = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�", "����", JOptionPane.YES_NO_OPTION);
				if(select == JOptionPane.YES_OPTION) {
					try {
						FileDialog fd = new FileDialog(f,"����",FileDialog.SAVE);
						fd.setVisible(true);	//���� �ش� ������ ������ ��, ���� ������ �����մϴ�.
						//�������			���ϸ�
						String path = fd.getDirectory() + fd.getFile();
						String msg = ta.getText();
						if(!msg.equals("")) {
							//���� ������ path�� ���⸦ �ؾ� �ϴµ�
							//�ѱ� ���� ���� ������ char ��Ʈ���� �̿��� �����ϴ�.
							FileWriter fw = new FileWriter(path);
							BufferedWriter bw = new BufferedWriter(fw);
							bw.write(msg);
							if(fd.getFile() != null) {
								JOptionPane.showMessageDialog(f, path+"\n��ο� ���� ����");
							}
							bw.flush();	//bw�� �ִ� ��� ������ ���ϴ�.
							//Ȥ�� ���� �ʰ� �뷮 ������ �� "����"�� ���� ���� �ֽ��ϴ�.
							//���ۿ� ���� �ִٸ�, ��� ���ڸ� ���Ͽ� "����" �մϴ�.
							if(bw!=null) bw.close();
							if(fw!=null) fw.close();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(f, "���� �մϴ�.");
					System.exit(0);					
				}
			}
		});
		//���� ��ư
		//1. ta�� �ִ� ��� ���ڸ� ������ �����ϴ�.
		//2. ������ ��θ� ����ϴ� -> FileDialog �����̳� ���
		//3. ��������� -> ����Ʈ��Ʈ��(x) ==> char ��Ʈ��(���ڿ� ���� ��Ʈ��)
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f,"����",FileDialog.SAVE);
					fd.setVisible(true);	//���� �ش� ������ ������ ��, ���� ������ �����մϴ�.
					//�������			���ϸ�
					String path = fd.getDirectory() + fd.getFile();
					String msg = ta.getText();
					if(!msg.equals("")) {
						//���� ������ path�� ���⸦ �ؾ� �ϴµ�
						//�ѱ� ���� ���� ������ char ��Ʈ���� �̿��� �����ϴ�.
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(msg);
						if(fd.getFile() != null) {
							JOptionPane.showMessageDialog(f, path+"\n��ο� ���� ����");
						}
						bw.flush();	//bw�� �ִ� ��� ������ ���ϴ�.
						//Ȥ�� ���� �ʰ� �뷮 ������ �� "����"�� ���� ���� �ֽ��ϴ�.
						//���ۿ� ���� �ִٸ�, ��� ���ڸ� ���Ͽ� "����" �մϴ�.
						if(bw!=null) bw.close();
						if(fw!=null) fw.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		//btnReset �̺�Ʈ ó��
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int select = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�", "����", JOptionPane.YES_NO_OPTION);
				if(select == JOptionPane.YES_OPTION) ta.setText("");
			}
		});
		//btnOpen ��ư //trim()�޼��� ���
		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
					fd.setVisible(true);
					String path = fd.getDirectory() + fd.getFile();		
					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(f, path+"\n����� ������ �ҷ��ɴϴ�.");
					}
					String tmp = "",msg = "";
					while((tmp = br.readLine()) != null) {
						msg += tmp.trim()+"\n";
					}
					ta.setText(msg);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		f.addWindowListener(new WindowAdapter() {
			//X ��ư�� ���� ��, ���α׷� ���� --> �̰� �ϱ��� '����'�� �ؾ� �մϴ�.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
