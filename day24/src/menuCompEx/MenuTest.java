package menuCompEx;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 	awt �޴��� Ȱ���� ���ϴ�.
 	
 	�޴�
 		�޴� ��
 			 - �޴�
 			     - �޴� ������
 */
public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("�޴� ����");
		f.setSize(300,200);
		f.setLocation(500,100);
		
		//�޴��� ���̴� ��ü �޴��ٰ� �ʿ��մϴ�.
		MenuBar mb = new MenuBar();
		
		Menu mFile = new Menu();	//1.new, open, save, print(�޴�), �ݱ�
		//new, open, save
		MenuItem m_new = new MenuItem("New");
		MenuItem m_open = new MenuItem("Open");
		MenuItem m_save = new MenuItem("Save");
		
		//�μ� print -> ����Ʈ�ϱ�, �̸�����, ����Ʈ ������... ���� �޴��� ����� ���ϴ�.
		Menu Print = new Menu("Print");
		MenuItem printSetup = new MenuItem("����Ʈ ����");
		MenuItem printPreview = new MenuItem("�̸�����");
		Print.add(printSetup);
		Print.add(printPreview);
		
		MenuItem close = new MenuItem("�ݱ�");
		
		mFile.add(m_new);		
		mFile.add(m_open);
		mFile.add(m_save);
		mFile.add(Print);		//<--�޴�
		mFile.add(close);
		
		//�޴� �ٿ� ���� �޴��� �߰�
		mb.add(mFile);
		
		f.setMenuBar(mb);	//�޴��ٴ� Component : MenuComponent
//		f.add(mb);			
		
		f.setLayout(null);
		
		//��ư�� �̹����� ����� ���� �� �ֽ��ϴ�.
		//JButton�� �����˴ϴ�. Button�� ������
		//ImageIcon 
		ImageIcon img = new ImageIcon("image/button03.gif");	//jpg, gif -> png���� ����
		
		JButton btn = new JButton(img);
		btn.setBounds(10,100, 200, 300);
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		f.add(btn);
		
		
		//�޴������ۿ� �̺�Ʈ ����ϱ�
		printSetup.addActionListener(new MyMenuListener());
		close.addActionListener(new MyMenuListener());
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
}
