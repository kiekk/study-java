package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	���� ��Ȳ�� ����� ���ϴ�.
 	�� �ҽ����� num/num2�� �Ұǵ�
 	�߻��� �� �ִ� ���ܸ� ��� ã�Ƽ�,
 	Exception ó���� ���ݴϴ�.
 */
public class ExceptionTest04 {

	public static void main(String[] args) {

		int num = 100;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		try {
			num2 = sc.nextInt();
		}catch(Exception e) {
			System.out.println("���� �Է� �����Դϴ�. �ٽ� �Է� : ");
			sc.nextLine();
			num2 = sc.nextInt();
		}
		System.out.println("���α׷��� ��� �˴ϴ�.");
		
		//��Ȳ���� �ٸ� ��� ������ Exception catch���� �ۼ����ְ�,
		//�ϳ��� �����ؼ� ������ ��� ��ǥ Exception catch���� �ۼ����ݴϴ�.
	}
}
