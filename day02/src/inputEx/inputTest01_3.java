package inputEx;

import java.util.Scanner;

/*
 	�Է¹ޱ� ����
 	1) ������� : ���� 4�� �̻� ����� ����ϱ�
 	2) TV : ���� 3�� �̻� ����� ����ϱ�
 	3) ��� ���� : ���� 3�� �̻� ����� ����ϱ�
 */
public class inputTest01_3 {

	public static void main(String[] args) {
		//��ĳ�� Ȱ�� -> ��ü = �ν��Ͻ�
		Scanner sc = new Scanner(System.in);
		System.out.println("3. ��� ���� �Է�");
		//���� ����
		String name = "";
		double height = 0.0;
		int age = 0;
		double weight = 0.0;
		//�Է�
		System.out.println("�̸� : "); name = sc.next();
		System.out.println("Ű(cm) : "); height = sc.nextDouble();
		System.out.println("���� : "); age = sc.nextInt();
		System.out.println("������(kg) : "); weight = sc.nextDouble();
		//���
		System.out.println("�̸� : " + name);
		System.out.println("Ű(cm) : " + height);
		System.out.println("���� : " + age);
		System.out.println("������(kg) : " + weight);
	}

}
