package testEx;

import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		//��1) �� ������ �Է¹ް�, �� ������ ������ ��� (c��� ���� ����)
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("ù ��° �� : "+num1+"\n�� ��° �� : " + num2+"\n�� ���� �� : "+ (num1+num2));
	}

}
