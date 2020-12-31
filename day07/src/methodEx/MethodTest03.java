package methodEx;

import java.util.Scanner;
/*
 	call by value (�� ����)
 	
 	fct(10,20) <-- �⺻���� �����ϴ� ��
 	
 	call by reference (������ ����)
 	
 	fct(��ü or �ν��Ͻ�) <-- �������� �����ϴ� ��
 	fct(obj)
 	fct(arr)	������ ��ü or �ν��Ͻ��� ���� ���ÿ� ����˴ϴ�.
 	
 */
public class MethodTest03 {
	void changeArray(int []ar) {
		//ar ���������� arScore�� (�����Ϳ�) �������� ��� ���޵˴ϴ�.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		//�� ����
		ar[0] = 100;
		ar[1] = 200;
	}
	public static void main(String[] args) {
		int []arScore = {10, 20};
		new MethodTest03().changeArray(arScore);
		System.out.println(arScore[0]);
		System.out.println(arScore[1]);
		
	}//end main
}//end class
