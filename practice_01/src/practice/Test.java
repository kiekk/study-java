package practice;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String [] s1 = new String[1];
		
		String [] s2 = new String[1];
		
		String [] s3 = {"�ȳ�"};
		
		String s6 = new String("�ȳ�");
		String s7 = new String();
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		String s4 = "�ȳ�";
		String s5 = "";
		System.out.println("s1 �迭 ���� �Է�");
		s1[0] = input.next();
		
		System.out.println("s5 ��Ʈ���� ���� �Է�");
		s5 = input.next();
		
		System.out.println("new s7 ��Ʈ���� ���� �Է�");
		s7 = input.next();
		
		s2[0] = "�ȳ�";
		
		if(s1[0]=="�ȳ�") {
			System.out.println("s1�� �ȳ�");
		}
		if(s2[0]=="�ȳ�") {
			System.out.println("s2�� �ȳ�"); // �길 �Է¹��� �ƴ�
		}
		if(s5=="�ȳ�") {
			System.out.println("s5�� �ȳ�");
		}
		if(s7=="�ȳ�") {
			System.out.println("s7�� �ȳ�");
		}
		
		System.out.println();
		
		// == ��ġ�� ã�ư��� ��. ���� ���� �ȿ����� ������ �� null�� ������ �� ã�ư���
		// �ٸ� ���������� ���� ���� �޸𸮰� �ƴ϶� �� ã�ư���. ���� ���� ���� �ּҸ� ã�ư��� ������ String pool ����
		// 
		System.out.println("s1=> �迭 ���� �Է¹� == �迭 ���� ����");
		System.out.println(s1[0]==s2[0]); // ������ �� null�� ������ �� ã�ư�.
		System.out.println("s1=> �迭 ���� �Է¹� == �迭 ���� �ʱ�ȭ");
		System.out.println(s1[0]==s3[0]); // ������ �� null�� ������ �� ã�ư�.
		System.out.println("s1=> �迭 ���� �Է¹� == ��Ʈ���� ���� ���� �� �ʱ�ȭ");
		System.out.println(s1[0]==s4); // 
		System.out.println("s1=> �迭 ���� �Է¹� == ��Ʈ���� ���� �Է¹�");
		System.out.println(s1[0]==s5);
		System.out.println("s1=> �迭 ���� �Է¹� == ��Ʈ���� ���� new �ʱ�ȭ");
		System.out.println(s1[0]==s6); // 
		System.out.println("s2=> �迭 ���� �Է¹� == ��Ʈ���� ���� new �Է¹� ");
		System.out.println(s1[0]==s7); // 
		
		System.out.println("------------------------------------------");
		// s2�� s3�� ���� �޸� �ȿ��� ������ �� null���� ���� ������ ã�ư� �� �ִ�.
		// s2�� s4�� ������ �� null���� ���� 
		System.out.println("s2=> �迭 ���� ���� == �迭 ���� �ʱ�ȭ");
		System.out.println(s2[0]==s3[0]);
		System.out.println("s2=> �迭 ���� ���� == ��Ʈ���� ���� ���� �� �ʱ�ȭ");
		System.out.println(s2[0]==s4);
		System.out.println("s2=> �迭 ���� ���� == ��Ʈ���� ���� �Է¹�");
		System.out.println(s2[0]==s5);
		System.out.println("s2=> �迭 ���� ���� == ��Ʈ���� ���� new �ʱ�ȭ");
		System.out.println(s2[0]==s6);
		System.out.println("s2=> �迭 ���� ���� == ��Ʈ���� ���� new �Է¹� ");
		System.out.println(s2[0]==s7);
		
		System.out.println("------------------------------------------");

		System.out.println("s4�� ��Ʈ���� ���� ���� �� �ʱ�ȭ");
		System.out.println("s4=> ��Ʈ���� ���� ���� �� �ʱ�ȭ == ��Ʈ���� ���� �Է¹�");
		System.out.println(s4==s5);
		System.out.println("s4=> ��Ʈ���� ���� ���� �� �ʱ�ȭ == ��Ʈ���� ���� new �ʱ�ȭ");
		System.out.println(s4==s6);
		
		System.out.println("------------------------------------------");
		
		System.out.println("s6�� s5");
		System.out.println("s5=> ��Ʈ���� ���� �Է¹� == ��Ʈ���� ���� new �ʱ�ȭ");
		System.out.println(s5==s6);
		
		System.out.println("------------------------------------------");

		
		System.out.println("s6=> ��Ʈ���� ���� new �ʱ�ȭ == ��Ʈ���� ���� new �Է¹� ");
		System.out.println(s6==s7);
		
		System.out.println(s1.hashCode());
		System.out.println(s1[0].hashCode());
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
	}
}
