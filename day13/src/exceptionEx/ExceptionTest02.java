package exceptionEx;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
//		System.out.println(10/0);
		int num = 100;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num2 = sc.nextInt();
		try {
			System.out.println(num/num2);
		}catch(ArithmeticException e){
//			System.out.println("���ܰ� �߻��Ǹ� �� ����(catch()��) ���� ���ɴϴ�.");
//			System.out.println(e.getClass().getName());
//			System.err.println(e.getMessage());			//out��� error�� ������ err�� �ۼ��ϸ� ������ ���������� �����Ǿ� ��µ˴ϴ�.
			System.out.print("0�̿��� ���� �Է��� �ּ���\n���� �Է� : ");
			num2 = sc.nextInt();
			System.out.println(num/num2);
		}finally {
			System.out.println("�� ���� finally ���Դϴ�.");
			System.out.println("catch���� ������ �� �ϳ��� �����ϰ�, try~catch�� ���������µ�,");
			System.out.println("finally ���� �ݵ�� �����ؾ� �ϴ� ���Դϴ�.");
		}
		System.out.println("�� ���� �ҽ�");
		System.out.println("�� ���� �ҽ�2");
		System.out.println("�� ���� �ҽ�3");
		System.out.println("�� ���� �ҽ�4");
	}

}
