package testEx;

import java.util.Scanner;

public class Test02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����2)
		// �ܼ��� ����� �Է¹޾� ����� �ּ���
		// ��) ���� �ܼ� : 21 (�ܼ�)
		// ���� : 10(��)
		//���)21��
		//	21 * 1 = 21,	21*2 = 42,	21*3 = 63
		//	21 * 4 = 21,	21*5 = 42,	21*6 = 63
		//	21 * 7 = 21,	21*8 = 42,	21*9 = 63
		//	21 * 10 = 210;
		
		//���۴ܼ��� �ּ� 2���� �����ؾ� �մϴ�.
		//����� �ּ� 2���̻��̾�� �մϴ�.
		//����� 3�� 3�� ������ ����մϴ�.
		System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
		int startDan = sc.nextInt();
		System.out.println("�� ����� ����Ͻðڽ��ϱ�?");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0;i < num;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.printf("%d *%2d = %3d    ",startDan,++count,startDan*count);
			}
			System.out.println("");
		}
		
		
	}

}
