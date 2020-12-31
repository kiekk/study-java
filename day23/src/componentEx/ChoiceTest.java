package componentEx;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		��Ӵٿ� ����Ʈ���� �ϳ��� �����մϴ�.
 		�������� �������� ������ �� �ֽ��ϴ�.
 */
public class ChoiceTest {
	public static void main(String[] args) {
		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); 	//�ڵ� ��ġ ����
		//����ǰ ������Ʈ ��ü
		Choice day = new Choice();
		day.add("��");
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		//Choice�� ũ��
		//������Ʈ ����
		day.setSize(150,0);		//height�� 0�� ������ ũ�⿡ ���缭 ���̰� �����˴ϴ�. ���� ũ��� font�� ���� ����
		day.setLocation(50,100);
		day.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getItem()+"����");
				System.out.println("�ҽ�.Ŭ����.�̸� : "+e.getSource().getClass().getName());
				System.out.println("���º�ȭ : "+e.getStateChange());
				System.out.println("ID : "+e.getID());
				System.out.println("������Ʈ �̸� : "+day.getName());
				System.out.println("day.selectedItem(String) : "+ day.getSelectedItem());
				System.out.println("day.selectedItem(int) : "+day.getSelectedIndex());	
			}
		});
		//�����ӿ� ������Ʈ ��ġ
		f.add(day);
		//������ ����
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
	}

}
