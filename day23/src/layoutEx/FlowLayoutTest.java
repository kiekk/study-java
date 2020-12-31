package layoutEx;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameEx.MyEventListener;
/*
 	Layout
 	 - �����̳ʿ� ��ġ�ϴ� ���
 	 - �����̳ʴ� �ڵ����� layout�� ������ �ֽ��ϴ�.
 			Frame, Dailog : BorderLayout
 			Panel, Applet(a) : FlowLayout �⺻ ����
 	-���̾ƿ� �Ŵ��� : setLayout(new BorderLayout());
 								(new FlowLayout());
 								(null);	<--�����̳ʿ� ��ġ�� ����ǰ���� ������ ũ�⸦ ������ �־�� �մϴ�.
 	- BorderLayout
 				:5�� �������� ���еǾ� �ֽ��ϴ�.
 					East, West, South, North, Center
 					�⺻ ������ Center �Դϴ�.
 					
 	- FlowLayout
 				: �������� ������� �þ�Ʈ���ϴ�.
 				: â�� ũ�Ⱑ �������� �ڵ����� �Ʒ��� �������ϴ�.
 				: ����ǰ ���� ������ gap �̶�� �մϴ�. (����, ���� ������ ������ �� ����մϴ�.)
 	- ��Ÿ : GridLayout, GridBagLayout, CardLayout...
 				ĭ - �࿭����				(�������� ī�带 �׾Ƴ��� ������� ��ġ�մϴ�.)
 */
public class FlowLayoutTest {
	static ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//��ư1 ~��ư6  <--��ư�� Ÿ��Ʋ�� g.getActionCommand()�� ���ؼ� ���� �� �ֽ��ϴ�.
			//�ڹ� : switch���� ���ڿ� �񱳵� �˴ϴ�.
			//�ֿܼ� ��ư 1 Ŭ����..
//			switch(e.getActionCommand()){
//				case "��ư1" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��ư2" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��ư3" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��ư4" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��ư5" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��ư6" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//			}
			System.out.println(e.getActionCommand()+"�� Ŭ����");
		}
	};
	public static void main(String[] args) {
		Frame f = new Frame("�÷ο� ���̾ƿ�");
		
		f.setLayout(new FlowLayout());
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
		Button btn6 = new Button("��ư6");
		
		//��ư �̺�Ʈ ��
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);
		btn4.addActionListener(click);
		btn5.addActionListener(click);
		btn6.addActionListener(click);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		
		f.setSize(400,300);
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());

	}

}
