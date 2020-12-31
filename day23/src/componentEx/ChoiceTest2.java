package componentEx;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import frameEx.MyEventListener;

/*
 	Choice
 		��Ӵٿ� ����Ʈ���� �ϳ��� �����մϴ�.
 		�������� �������� ������ �� �ֽ��ϴ�.
 */
public class ChoiceTest2 {
		static String result = "";
	public static void main(String[] args) {
		Frame f = new Frame("Choice");
		f.setBounds(500, 100, 500, 250);
		f.setLayout(null); 	//�ڵ� ��ġ ����
		
		//����ǰ ������Ʈ ��ü
		Choice day = new Choice();
		day.add("������ �����ϼ���.");
		day.add("��");
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
//		String result = ""; �͸� Ŭ������ �ϳ��� Ŭ�����̱� ������, ���������� ������ �Ұ����մϴ�. �׷��� static���� �����մϴ�.
//		static String result = "";  ���������� static ���� �Ұ���, ���� Ŭ���� ������ ������ �� �͸�Ŭ�������� ����� �� �ֵ��� �մϴ�.
		//Choice�� ũ��
		//������Ʈ ����
		day.setSize(150,0);		//height�� 0�� ������ ũ�⿡ ���缭 ���̰� �����˴ϴ�. ���� ũ��� font�� ���� ����
		day.setLocation(50,100);
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(day.getSelectedIndex() != 0) {
					result = (String) e.getItem();
				}
//				System.out.println("�ҽ�.Ŭ����.�̸� : "+e.getSource().getClass().getName());
//				System.out.println("���º�ȭ : "+e.getStateChange());
//				System.out.println("ID : "+e.getID());
//				System.out.println("������Ʈ �̸� : "+day.getName());
//				System.out.println("day.selectedItem(String) : "+ day.getSelectedItem());
//				System.out.println("day.selectedItem(int) : "+day.getSelectedIndex());
			}
		});
	
		//1-1. ��ư
		Button btnOk = new Button("���� Ȯ��");
		//1-1. ��ư ������
		btnOk.setBounds(200,150, 100, 50);
		//1-3. ��ư ����
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(result);
			}
		});
		//�����ӿ� ������Ʈ ��ġ
		f.add(day);
		f.add(btnOk);
		//������ ����
		f.setVisible(true);
		f.addWindowListener(new MyEventListener());
	}

}
