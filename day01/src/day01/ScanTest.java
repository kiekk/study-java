package day01;

import java.util.Scanner;
//import java.util.* -> util���� ��� ���� ����մϴ�.
//import java.util.*.* ->util�� ���������� ���� ����մϴ�.

/*
 	Scanner Ŭ����
 		Ű���� ���۷κ��� �����͸� �Է¹޾�
 			������ �����ϴ� Ŭ���� -> ���� �ǹ��� Scanner
 		Scanner �Է¹ް��� �ϴ� �Է���ġ�� �ν��Ͻ� ���� �� �˷���� �մϴ�.
 				System.in <-Ű����
 				Scanner sc = new Scanner(System.in);
 				sc��� ��ü�� ���ؼ� �޼ҵ带 ȣ���� �� �ֽ��ϴ�.
 				���� = s.�޼ҵ�(); -> ������ �����͸� �Է¹޾� ������ �� �ֽ��ϴ�.
 				
 		Scanner Ŭ������ java.util ��Ű���� ����ֽ��ϴ�.
 			- scanner�� �Է��ϴ� ctrl + space�� �ڵ� �ϼ��� �ϸ�
 				�ҽ� ��ܿ� import java.util �� �ڵ� �ϼ� �˴ϴ�. 			
 */
public class ScanTest {

	public static void main(String[] args) {
		//Scanner�� ���ؼ� scan ��ü�� �ϳ� ����� ���ϴ�.
		Scanner scan = new Scanner(System.in);
		//�Է���ġ(Ű����)���� �����͸� �Է¹޽��ϴ�.
		// scan.next();   ���ڿ� -> �ܾ����(�������)�� �о����
		// scan.nextLine(); ���ڿ� -> �������(��������)�� �о����
		// scan.next0000(); 0000�ش� Ÿ������ �б�
		// scan.nextInt(); �������� �б�
		// scan.nextFloat(); �Ǽ� float���� �б�
		int korScore = 0;
		int engScore = 0;
		System.out.print("���� ���� : ");
		korScore = scan.nextInt();				//korScore�� int���̱� ������ int������ �����͸� �Է¹޽��ϴ�.
		System.out.print("���� ���� : ");
		engScore = scan.nextInt();				//engScore�� int���̱� ������ int������ �����͸� �Է¹޽��ϴ�.
		System.out.println("���� ���� : "+ korScore + "�� / ���� ���� : "+ engScore + "��");
		System.out.println("���� : "+(korScore+engScore)+"��");
		
		//scan.close();	 �Ƚᵵ �˴ϴ�.
	}

}
