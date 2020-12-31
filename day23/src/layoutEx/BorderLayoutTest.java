package layoutEx;

import java.awt.BorderLayout;
import java.awt.Button;
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
public class BorderLayoutTest {
	static ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//��ư1 ~��ư6  <--��ư�� Ÿ��Ʋ�� g.getActionCommand()�� ���ؼ� ���� �� �ֽ��ϴ�.
			//�ڹ� : switch���� ���ڿ� �񱳵� �˴ϴ�.
			//�ֿܼ� ��ư 1 Ŭ����..
//			switch(e.getActionCommand()){
//				case "��" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "��" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//				case "�߾�" : System.out.println(e.getActionCommand()+"�� Ŭ����");break;
//			}
			System.out.println(e.getActionCommand()+"�� Ŭ����");
		}
	};
	public static void main(String[] args) {
		Frame f = new Frame("���� ���̾ƿ�");
		
		f.setLayout(new BorderLayout());
		
		Button btnE = new Button("��");
		Button btnW = new Button("��");
		Button btnS = new Button("��");
		Button btnN = new Button("��");
		Button btnC = new Button("�߾�");
		
		//��ư �̺�Ʈ ��
		btnE.addActionListener(click);
		btnW.addActionListener(click);
		btnS.addActionListener(click);
		btnN.addActionListener(click);
		btnC.addActionListener(click);
		
		f.add(btnE,BorderLayout.EAST);
		f.add(btnW,BorderLayout.WEST);
		f.add(btnS,BorderLayout.SOUTH);
		f.add(btnN,BorderLayout.NORTH);
		f.add(btnC,BorderLayout.CENTER);
		//�Ű������� ������ ����ŵ�, ���� ��ġ �����մϴ�.
		
		f.setSize(400,300);
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());

	}

}
