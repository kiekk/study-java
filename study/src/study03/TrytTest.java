package study03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrytTest {

	public static void main(String[] args) {
		//5ĭ �迭 ����,
		//���� 5���� �Է¹ޱ�
		//�Է��� ������
		Scanner sc = new Scanner(System.in);
		int[] arNum = new int[5];
		
		int cnt = 0;
		while(true) {
			System.err.println(++cnt +"��° �����Է�[q�� ����]");
			String temp = sc.next();
			
			if(temp.equals("q")) {break;}
			
			try {
				arNum[cnt-1] = Integer.parseInt(temp);
			}catch (NumberFormatException e) {
				System.out.println("������ �Է�");
				cnt--;
			}catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("5���� �� �Է��߽��ϴ�.");
				break;
			}
		}
//		int i = 0;
//		while(true) {
//			try {
//				System.out.println(("���� �Է�");
//				arNum[i] = sc.nextInt();
//
//				i++;
//
//			} catch(InputMismatchException e) {
//				System.out.println("������ �Է��ϼ���");
//				sc.nextLine();
//			} catch(ArrayIndexOutOfBoundsException e1) {
//				System.out.println("5���� �� �Է��߽��ϴ�.");
//				break;
//			}
//		}
//
//		for (int j = 0; j < arNum.length; j++) {
//			System.out.println(arNum[j]);
//		}
	}

}
