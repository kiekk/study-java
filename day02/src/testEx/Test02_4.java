package testEx;

import java.util.Scanner;

public class Test02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//����4)
		//���࿡�� ���� �����ϰ��� �մϴ�.
		//���� ȭ�� ������ �ּ� ȭ�� �ż��� ���մϴ�.
		//�Է¿�) 15300
		//��¿�) 50000�� �� : 0��
		//		  10000�� �� : 1��
		//		   5000�� �� : 1��
		//		   1000�� �� : 0��
		//		    500�� �� : 0��
		//		    100�� �� : 3��
		//�ּ� �Է´����� ��� �����Դϴ�.
		//�ִ� �Է´����� ���鸸�� �Դϴ�.
		
		System.out.println("�󸶸� �����Ͻðڽ��ϱ�?(���� : ���)");
		int num = 0,num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0,num6 = 0;
		int inputCash = sc.nextInt();
		num = inputCash;
		if(num >= 50000) {
			num1 = inputCash / 50000;
			num = inputCash % 50000;
		}
		if(num >= 10000) {
			num2 = num / 10000;
			num = inputCash % 10000;
		}
		if(num >= 5000) {
			num3 = num / 5000;
			num = inputCash % 5000;
		}
		if(num >= 1000) {
			num4 = num /1000;
			num = inputCash % 1000;
		}
		if(num >= 500) {
			num5 = num /500;
			num = inputCash % 500;
		}
		if(num >= 100) {
			num6 = num /100;
			num = inputCash % 100;
		}
		System.out.println(inputCash +"���� �����մϴ�.");
		System.out.println("50000�� �� : "+ num1 + "��");
		System.out.println("10000�� �� : "+ num2 + "��");
		System.out.println("5000�� �� : "+ num3 + "��");
		System.out.println("1000�� �� : "+ num4 + "��");
		System.out.println("500�� �� : "+ num5 + "��");
		System.out.println("100�� �� : "+ num6 + "��");
	}
}
