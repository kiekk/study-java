package study01;

import java.util.Scanner;

public class MethodTest2 {
	//1. �޼ҵ� �̸��� ���ݴ� ��ü������ �ۼ�
	//ex) evencount -> getEvenCountFrom1
	//ex) sum -> getSumFrom1
	
	//2. ������̼����� �޼ҵ带 ��ü������ �������ֱ�
	//1~n���� �� ¦���� ������ �����ִ� �޼ҵ�
	int evenCount(int select) {
		//���ο��� ���� ������ üũ�ϴ� �� ���� �޼ҵ忡�� üũ�ϴ� ���� ȿ������
		if(select < 1) {return -1;}
		int count = 0;
		for(int i = 1; i <= select;i++) {
			if(i % 2 == 0) {count++;}
		}
		return count;
	}
	//1~n������ ���� �����ִ� �޼ҵ�
	int sum(int select) {
		int result = 0;
		for(int i = 1;i <= select;i++) {
			result += i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest2 m = new MethodTest2();

		int select = 0, count = 0,result = 0;

		while(true) {
			System.out.println("���ڸ� �Է����ּ���\n1���� ū ���� �Է����ּ���");
			select = sc.nextInt();
			if(select < 1) {System.out.println("1���� ū ���� �Է����ּ���");}
			else {break;} 
		}
		//¦�� ����
		count = m.evenCount(select);
		//�� ��
		result = m.sum(select);

		System.out.println("1���� "+select+"������ ¦�� ���� : "+count);
		System.out.println("1���� "+select+"������ �� �� : "+result);

	}
}
