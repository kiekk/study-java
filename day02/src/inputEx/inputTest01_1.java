package inputEx;

import java.util.Scanner;

/*
 	�Է¹ޱ� ����
 	1) ������� : ���� 4�� �̻� ����� ����ϱ�
 	2) TV : ���� 3�� �̻� ����� ����ϱ�
 	3) ��� ���� : ���� 3�� �̻� ����� ����ϱ�
 */
public class inputTest01_1 {

	public static void main(String[] args) {
		//��ĳ�� Ȱ�� -> ��ü = �ν��Ͻ�
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ������� �Է�");
		//���� ����
		String book_Name = "";			//����
		String book_Author = "";		//����
		int book_Page = 0;				//��������
		int book_Price = 0;				//����
		int book_Month = 0;				//�Ⱓ ��
		int book_Day = 0;				//�Ⱓ ��
		String book_Pub = "";			//���ǻ�
		//�Է�
		System.out.println("---------���� ���� �Է�---------");
		System.out.println("���� ������ �Է��� �ּ��� : "); book_Name = sc.next();
		System.out.println("���ڸ� �Է��� �ּ��� : "); book_Author = sc.next();
		System.out.println("���������� �Է��� �ּ��� : "); book_Page = sc.nextInt();
		System.out.println("������ �Է��� �ּ��� : "); book_Price = sc.nextInt();
		System.out.println("���� ���� �Է��� �ּ��� : "); book_Month = sc.nextInt();
		System.out.println("���� ���� �Է��� �ּ��� : "); book_Day = sc.nextInt();
		System.out.println("���ǻ縦 �Է��� �ּ��� : "); book_Pub = sc.next();
		//���
		System.out.println("---------���� ���� ���---------");
		System.out.println("���� ���� : " + book_Name);
		System.out.println("  ����    : " + book_Author);
		System.out.println("������ �� : " + book_Page + "��");
		System.out.println("���� ���� : " + book_Price + "��");
		System.out.println("�Ⱓ ��¥ : " + book_Month +"�� " + book_Day + "��");
		System.out.println(" ���ǻ�   : " + book_Pub);
	}

}
