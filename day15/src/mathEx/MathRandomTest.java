package mathEx;

import java.util.Random;

public class MathRandomTest {

	public static void main(String[] args) {
		String[] lucky = {
				"������ �������� ��︳�ϴ�.",
				"����� ���ڴ� 6�Դϴ�",
				"���� �ȴ� Ⱦ����� �ְڳ׿�",
				"���� �Ϸ�� �ǰ��� �Ϸ簡 �� �ſ���"
		};
		//������ �߻�����,
		//������ ��� ����� ���ϴ�.
		int randNum = (int)(Math.random()*4);
		System.out.println(lucky[randNum]);
		//Random Ŭ���� ���
		String[] gift = {
			"TV","Radio","�����","��"	
		};
		//Random Ŭ������ ����ؼ� �����ϳ��� ����� ���ϴ�.
		int rand = new Random().nextInt(4);
		System.out.println(gift[rand]);	
		System.out.println("Math.round() of 9.5 is " + Math.round(9.5));
        System.out.println("Math.round() of 10.5 is " + Math.round(10.5));
        System.out.println("Math.round() of 11.5 is " + Math.round(11.5));
        System.out.println("Math.round() of 12.5 is " + Math.round(12.5));
        System.out.println("Math.rint() of 9.5 is " + Math.rint(9.5));
        System.out.println("Math.rint() of 10.5 is " + Math.rint(10.5));
        System.out.println("Math.rint() of 11.5 is " + Math.rint(11.5));
        System.out.println("Math.rint() of 12.5 is " + Math.rint(12.5));
	}//end main
}//end class

