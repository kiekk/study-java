package arrayEx;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�迭 ���� �� ���Է�
//		int []ar = new int[5];
//		for(int i = 0;i<ar.length;i++) {
//			System.out.print("ar["+i+"]�� ������ ���� �Է��� �ּ��� : "); ar[i] = sc.nextInt();
//		}
//		for(int i = 0;i<ar.length;i++) {
//			System.out.println("ar["+i+"]�� ����� �� : "+ar[i]);
//		}
		//1.���ϴ� ���� �Է¹޾Ƽ� �迭�� �־� ���ϴ�.
		//	����� ���ϴ�.
		
		//2.
		String[] arStr = {"�̼���","�ڹ���","������","��������"};
		//arStr ������ �����ϰ�
		//������ ��Ҹ� ����ϼ���.
//		for(int i = 0;i<arStr.length;i++) {
//			System.out.println(arStr[i]);
//		}
		//3.
		arStr = new String[]{"abc","dEf","GHi"};
		for(int i = 0;i<arStr.length;i++) {
			for(int j = 0;j<arStr[i].length();j++) {	
				if(arStr[i].charAt(j) >= 97 && arStr[i].charAt(j) <= 122)
					System.out.print((char)(arStr[i].charAt(j) - 32));
				else
				System.out.print(arStr[i].charAt(j));
			}
			System.out.println();
		}
		//arStr���� �ҹ��ڸ� �빮�ڷ� ������ ���ϴ�.
		//�빮�ڴ� �״�� �빮��
		
		
		//string buffer
		//4. ����ܾ�� ���ڿ��� �Է¹��� ��
		//	�� �ܾ �빮��->�ҹ��ڷ� ������ ���ϴ�.
		System.out.print("����ܾ �Է��� �ּ��� : "); String word = sc.next();
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i) >= 97 && word.charAt(i) <= 122)
				System.out.print((char)(word.charAt(i) - 32));
			else
				System.out.print(word.charAt(i));
			}
		}
	}
