package inputEx;

import javax.swing.JOptionPane;
/*
 	��ȭ���ڸ� �̿��� �� �Է¹ޱ�
 	��1)�ڵ��� ���� 3�� ����� ����� ���ϴ�.
 	��2)��� ������ �Է¹޾� ���ϴ�.
 	
 	
 */

public class inputTest02_2 {

	public static void main(String[] args) {
		
		//��1) �ڵ��� ���� �Է� �ޱ�
		String car_Brand = JOptionPane.showInputDialog("�ڵ��� �귣�� �Է�");
		int car_Price = Integer.parseInt(JOptionPane.showInputDialog("�ڵ��� ����(���� : ����)"));
		String car_Color = JOptionPane.showInputDialog("�ڵ��� ���� �Է�");
		System.out.println("�귣�� : " + car_Brand);
		System.out.println("����(���� : ����) : " + car_Price + "����");
		System.out.println("���� : " + car_Color);
		
//		//��2) ��� ���� �Է� �ޱ�
//		String name = JOptionPane.showInputDialog("�̸� �Է�");
//		char gender =  JOptionPane.showInputDialog("���� �Է�(����/����)").charAt(0);
//		//���ڿ��� �Է¹������� ������ �����Ϸ��� ������ �������Դϴ�.
//		//charAt(index)�� ���� �Է¹��� ���ڿ��� ù���ڸ� �����մϴ�.
//		int age = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
//		String address = JOptionPane.showInputDialog("�ּ� �Է�");
//		String say = JOptionPane.showInputDialog("�ϰ� ���� ��");
//		System.out.println("�̸� : "+ name);
//		System.out.println("���� : "+ gender);
//		System.out.println("���� : "+ age);
//		System.out.println("�ּ� : "+ address);
//		System.out.println("�ϰ� ���� �� : "+ say);
	}
}
