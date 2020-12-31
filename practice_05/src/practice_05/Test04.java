package practice_05;

import java.util.Arrays;

/*
 * "�¶��� �����ý����� �����ϴ� �����ڰ� ���� ������ �ſ�ī�带 �����ϰ� �;��Ѵ�. ������ ī���ȣ�� �� �Է��ϴ� �Ǽ��ϴ� ��찡 �����Ƿ� ����ڰ� �Է��� ��ȣ�� Ȯ���� ����� �ʿ��ϴ�.

�����ڴ� ������ ���� "�� �˰���"�� ��� ī�忡 ������� �˰� �ִ�.
���� �� �ſ�ī���� �� ���ڸ� �ɰ���. ���� ��, 21378��
2 1 3 7 8

���� ¦�� ������ ���ڰ� �����Ѵٸ� Ȧ���� ��ġ�� �ִ� ���ڿ� 2�� ���Ѵ�. �ݴ�� Ȧ�� ������ ���ڰ� �����Ѵٸ� ¦���� ��ġ�� �ִ� ���ڿ� 2�� ���Ѵ�. ��ġ�� ���� ���� ù��° ���ڸ� 1�� �����Ѵ�. ���� ���÷� �� ��ȣ�� Ȧ�� ������ ���ڰ� �����Ƿ� ¦���� ��ġ�� �ִ� ���ڿ� 2�� ���Ѵ�:

2 1 3 7 8 ��
2 2 3 14 8 �� �ȴ�.

�� ��, ¦���� ��ġ�� �ִ� ���ڴ� ������ �����̹Ƿ� 2�ڸ� ���� ��Ÿ������ �����ؼ��� �� �ȴٴ� ���� �����Ѵ�.

���������� ��� ���ڸ� �ɰ��� ���� ���Ѵ� (2�ڸ� ������ ��쿡�� �� �ڸ��� ���ڸ� �ٸ� ���� ����Ͽ� �տ� ���ؾ� �Ѵ�):

2 + 2 + 3 + 1 + 4 + 8 = 20

���� 10�� ������ �̴� ��ȿ�� ��ȣ�̴�. �׷��� �ʴٸ� ��ȿ���� ���� ��ȣ�̴�.

�ſ�ī���ȣ String cardNumber�� ���Ͽ� ī���ȣ�� ��ȿ�ϴٸ� "VALID", �׷��� �ʴٸ� "INVALID"�� ��ȯ�϶�. (����ǥ�� ���ڿ��� ��Ÿ���� ������ ���̸� ��������� ���Ե��� �ʴ´�)"
 * 
 */
public class Test04 {
	public String solution(String cardNumber){
		int index = 0;
		int result = 0;
		int[] arr = new int[cardNumber.length()];
		for(int i=0;i<cardNumber.length();i++) {
			arr[i] = Integer.parseInt(cardNumber.charAt(i) + "");
 		}
		//Ȧ������ ī��ѹ�
		if(cardNumber.length() % 2 == 1)
			index = 1;
		//Ȧ����, ¦������ ��츦 ������ �� �ڸ��� ���ڿ� 2�� ���մϴ�.
		for(;index<cardNumber.length();index+=2) {
			arr[index] *= 2;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int a : arr) {
			result += a;
			//���ڰ� 2�ڸ���� �� �ڸ��� ���ڸ� ���ϵ��� �����Ͽ� ����� �����մϴ�.
			if(a >= 10)
				result -= 9;
		}
		//����� 10�� ������
		System.out.println(result);
		if(result % 10 == 0)
			return "VALID";
		else 
			return "INVALID";
    }
	public static void main(String[] args) {
		Test04 test = new Test04();
		String cardNumber = "31378";
		String result = test.solution(cardNumber);
		System.out.println(result);
	}
}
