package inputEx;

import java.util.Scanner;

/*
 	�Է¹ޱ� ����
 	1) ������� : ���� 4�� �̻� ����� ����ϱ�
 	2) TV : ���� 3�� �̻� ����� ����ϱ�
 	3) ��� ���� : ���� 3�� �̻� ����� ����ϱ�
 */
public class inputTest01_2 {

	public static void main(String[] args) {
		//��ĳ�� Ȱ�� -> ��ü = �ν��Ͻ�
		Scanner sc = new Scanner(System.in);
		System.out.println("2. TV��ǰ ��� �Է�");
		//���� ����
		String tv_Brand = "";	//tv �귣��
		int tv_Width = 0;		//tv ����
		int tv_Height = 0;		//tv ����
		int tv_Price = 0;		//tv ����
		int tv_ASYear = 0;		//tv as ���� ���
		int tv_Type = 0;		//tv���� (������, ���ĵ�)
		//�Է�
		System.out.println("TV �귣�� : "); tv_Brand = sc.next();
		System.out.println("TV�� ���� ũ��(cm) : "); tv_Width = sc.nextInt();
		System.out.println("TV�� ���� ũ��(cm) : "); tv_Height = sc.nextInt();
		System.out.println("TV ���� : "); tv_Price = sc.nextInt();
		System.out.println("���� AS ���� �⵵(1~5��) : "); tv_ASYear = sc.nextInt();
		System.out.println("TV ����"); 
		System.out.println("1. ������    2. ���ĵ�"); 
		tv_Type = sc.nextInt();
		//���
		System.out.println("Tv �귣�� : " + tv_Brand);
		System.out.println("Tv ũ�� : " + tv_Width + "cm x " + tv_Height + "cm");
		System.out.println("Tv ���� : " + tv_Price + "��");
		System.out.println("���� AS�� \"" + tv_ASYear + "��\" ���� �����մϴ�.");
		if(tv_Type == 1) {
			System.out.println("Tv ������ \"������\" �Դϴ�.");			
		}else {
			System.out.println("Tv ������ \"���ĵ�\" �Դϴ�.");
		}
	}

}
