package testEx;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����1)
		// ������ ���
		// �ܼ��� �Է¹��� ��, �ش� �ܼ��� �������� ����� ������
		// ��) 3
		// ���) 3��
		// 3 * 1 = 3,	3 * 2 = 6,	3 * 3 = 9
		// 3 * 4 = 12,	3 * 5 = 15,	3 * 6 = 18
		// 3 * 7 = 21,	3 * 8 = 24,	3 * 9 = 27
		
		//3�� ������ ����� �ּ���
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.printf("%d *%2d = %2d    ",num,++count,num*count);
			}
			System.out.println("");
		}
	}
}
