package day01;

import java.util.Scanner;
/*
 	
 */
public class ScanTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�̸�
		//�ּ� (2�� �ܾ�)
		//Ű �Ҽ��� ���ڸ�
		//�ڿ��Ͱ� ó���ϱ�   -> scan.nextln();
		String name = "";
		String address = "";
		double height = 0.0;
		char gender = ' ';
		
		//���ڿ��� �ƴ� Ÿ���� �Է¹ް� ���ڿ��� �����
		//scan.nextDouble()+"";		//�����ϰ� �Է¹��� double�� ���� ���ڿ��� ����ȯ �� �� �ֽ��ϴ�.
		//�Է�
		System.out.print("�̸� : "); name = scan.nextLine();
		System.out.print("�ּ� : "); address = scan.nextLine();
		System.out.println("���� : "); gender = scan.next().charAt(0);
		System.out.print("Ű : "); height = scan.nextDouble();
		//���
		System.out.println("**** ��� ****");
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + gender);		
		System.out.println("Ű : " + height + "cm");
	}
}
