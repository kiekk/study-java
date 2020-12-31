package componentEx;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	CheckBox - ���� ����
		ItemListener �� �̿��� �̺�Ʈ ó��
		CheckBoxGroup�� �̿��ϸ�, ������ư(�������߿� �ϳ��� ����)
									��� ���� �� �� �ֽ��ϴ�.
 */
public class CheckBoxTest {
	public static ItemListener click = new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("�Ѵ޿� "+e.getItem()+"���ϴ�.");
		}
	}; 
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500,100,800,250);
		f.setLayout(new FlowLayout());
		Label question = new Label("1. ���ɺо�");
		Checkbox news = new Checkbox("����");
		Checkbox sports = new Checkbox("������");
		Checkbox movie = new Checkbox("��ȭ����");
		Checkbox music = new Checkbox("���ǰ���");
		//news�� �̺�Ʈ �ɱ�
		news.addItemListener(new ItemListener() {
			@Override		//�������� ����(state)�� ���ϸ�
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���� üũ�ڽ� ���� : "+e.getStateChange());
				String msg = e.getStateChange()==1?"üũ����:��������":"�������þ���";
				System.out.println(msg);
			}
		});
		f.setVisible(true);
		f.add(question);
		f.add(news);
		//���� ��ư : ���� �����մϴ�. üũ�ڽ����� ��Ƽ� �׷쿡 ������ �������� �ϳ��� �����ϴ� ������ư ����� ������ �� �ֽ��ϴ�.
		Label question2 = new Label("2. ��ȭ�� ��� ���ó���?");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("�ѹ�", group, true);	// �⺻ ���� üũ�ڽ�
		Checkbox two = new Checkbox("�ι�", group, false);
		Checkbox three = new Checkbox("����", group, false);
		//one�� üũ�ϸ� �Ѵ޿� �ѹ� ��
		//two�� üũ�ϸ� �Ѵ޿� �ι� ��
		//three�� üũ�ϸ� �Ѵ޿� ���� �� 
		//�� ��ü�� �̺�Ʈ ó���ϱ�
		f.add(question2);
		f.add(one);
		f.add(two);
		f.add(three);
		one.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�Ѵ޿� �ѹ� ���ϴ�.");
			}
		});
		two.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�Ѵ޿� �ι� ���ϴ�.");
			}
		});
		three.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�Ѵ޿� ���� ���ϴ�.");
			}
		});
		f.addWindowListener(new MyEventListener());
	}

}
