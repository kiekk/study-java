package study01;

import java.util.Scanner;

public class MethodTest {
	//5���� ������ �Է¹ް� �ִ밪�� �ּҰ� �����ִ� void�� �޼ҵ�(������ ������� �ʽ��ϴ�)
	int max = 0,min = 0;
	//�������� ������ �޸� ����, �ִ��� �������� ������� �����ϰ� �� ��������
	void maxmin(int[] arNum) {
		max = arNum[0];
		min = arNum[0];
		for(int i = 1;i<5;i++) {
			if(max < arNum[i]) {
				max = arNum[i];
			}
			if (min > arNum[i]) {
				min = arNum[i];
			}
		}
	}
	void maxmin2(int[] arNum,int[] result) {
		result[0] = arNum[0];
		result[1] = arNum[0];
		for(int i = 1;i<5;i++) {
			if(result[0] < arNum[i]) {
				result[0] = arNum[i];
			}
			if (result[1] > arNum[i]) {
				result[1] = arNum[i];
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest m = new MethodTest();
		//���� 5���� �Է¹��� �迭
		int[] arNum = new int[5];
		//�ִ밪,�ּҰ��� �Է¹��� �迭
		int[] result = new int[2];

		//���� 5�� �Է¹ޱ�
		for(int i = 0;i<arNum.length;i++) {
			System.out.print((i+1)+"��° ���� �Է� : ");
			arNum[i] = sc.nextInt();
		}
		
//		m.maxmin(arNum);
//		System.out.println("�ִ밪 : "+m.max);
//		System.out.println("�ּҰ� : "+m.min);
		
		m.maxmin2(arNum,result);
		System.out.println("�ִ밪 : "+result[0]);
		System.out.println("�ּҰ� : "+result[1]);
		
		
	}
}
