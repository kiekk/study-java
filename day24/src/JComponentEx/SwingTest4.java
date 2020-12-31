package JComponentEx;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

/*
 	JTabbedPane();	������ �� ������ �����ؼ� ǥ���� �� �ֽ��ϴ�.
 */

public class SwingTest4 extends JFrame {
	JTabbedPane pane;		//�� ������ ������ ������ �� �ִ� �г�
	JLabel label;
	PanelOne p1;
	PanelTwo p2;
	PanelThree p3;
	
	public SwingTest4() {
		pane = new JTabbedPane();
		p1 = new PanelOne();
		p2 = new PanelTwo();
		p3 = new PanelThree();
		
		//�� �гο� �г� ���̱�
		pane.addTab("Model", p1);
		pane.addTab("Movie", p2);
		pane.addTab("PC Room", p3);
		
		//�ʱ⿡ ������ ���� �ε��� ��ȣ (���� 3�� �ٿ��� ������ 0~1������ �ֽ��ϴ�)
		pane.setSelectedIndex(0);
		label = new JLabel("");
		
		//���� �����ӿ��� �г��� ������ �����ɴϴ�. �׸��� �� �гο� pane�� ���Դϴ�.
		getContentPane().add("Center",pane);
		//getContentPane()�� ����Ÿ���� Container
		getContentPane().add("South",label);
		
		setVisible(true);
		setBounds(300, 300, 300, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingTest4();
	}
}
