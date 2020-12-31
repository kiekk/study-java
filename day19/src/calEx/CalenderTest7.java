package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar �޷¸����
 	- �⵵�� ���� �Է¹����� �� ���� �޷��� ����մϴ�.
 	�Է� ��)
 	�⵵ : 2020
 	��   :  5

 	�� �� ȭ �� �� �� ��

 	1.���� ������ �˾ƾ� �մϴ�.  �����Ͽ� 1�� ���۵ȴٸ� �Ͽ�ȭ ���� ������ ����ؾ� �մϴ�.
 	2.���������� �˾ƾ��մϴ�. getActual~
 	3.��¥�� ������ �����ؾ��մϴ�.
 */
public class CalenderTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int year = 2020, month = 6-1;
		cal.set(year, month, 1);
		System.out.println("     ["+year+"�� "+month+"��]");
		System.out.println(" �� �� ȭ �� �� �� ��");
		int startDay = cal.get(cal.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		for(int i = 1;i<startDay;i++) {
			System.out.print("   ");
		}
		for(int i = 1;i <= lastDay;i++) {
			System.out.print((i < 10) ? "  "+i : " "+i);
			if((startDay % 7) == 0) 
				System.out.println();
			startDay++;
		}
		//�ѱ��� 2ĭ, ������ 1ĭ���� �� 3ĭ�� ������ ������մϴ�.

	}
}
