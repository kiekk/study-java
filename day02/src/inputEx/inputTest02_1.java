package inputEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	�Է¹ޱ� : Scanner : �ֿܼ��� �Է¹޾ҽ��ϴ�.
 	
 	�Է¹ޱ� 2 : GUI ȯ�濡�� Dialog�� �̿��� �Է¹ޱ�
 	��ȭ���ڿ��� �Է¹ޱ�
 	(Dialog)
 	-������ "���ڿ�"�� �Է��մϴ�.
 	- 10 -> ���ڿ� 10���� return
 	- "10"�� ���� 10���� �����ؾ� �մϴ�.
 	- Ư�� �����ͷ� �����ϴ°����� �Ľ�(parsing) �̶�� �մϴ�.
 		(����ȯ�� Ÿ���� �ٲٴ� ��, �Ľ��� ���� ����� �� �ִ� ���·� �����ϴ� ��)
 		
 	��ȭ���� showInputDialog(A, B) -> ���� 2���� �ʿ��մϴ�.
 	JOptionPane Ŭ������ �ֽ��ϴ�.
 	** ���ڿ����� ���������� �Ľ��ϱ�
 	���� : 45 -> "45"
 	���������� �����Ϸ��� Integer.parseInt(���ڿ�)
 	�������� �����Ϸ��� Double.parseDouble(���ڿ�)
 							Boolean.parseBoolean(���ڿ�)
 	....
 	Integer,Double,Boolean�� class�Դϴ�.
 */
public class inputTest02_1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "�̸��� �Է��ϼ���.");
		System.out.println("�̸� : "+ name);
	}

}
