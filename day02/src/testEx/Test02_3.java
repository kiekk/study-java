package testEx;

import java.util.Scanner;

public class Test02_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����3) ���� ���
		// 3-1) ���簢��
		// ���̿� �ʺ� �Է¹��� ��, 
		// 1���� �ش� ������ŭ ����մϴ�.
		// ���� : 4
		// �ʺ� : 3
		// 1 2 3
		// 4 5 6
		// 7 8 9 
		// 10 11 12
		System.out.println("���̸� �Է����ּ���.");
		int height = sc.nextInt();
		System.out.println("�ʺ� �Է����ּ���.");
		int width = sc.nextInt();
		int count = 0;
		
		for(int i= 0;i< height;i++) {
			for(int j = 0;j< width;j++) {
				System.out.printf("%2d  ",++count);
			}
			System.out.println("");
		}
	}

}
