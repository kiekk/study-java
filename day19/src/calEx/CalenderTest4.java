package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar Ŭ����
 */
public class CalenderTest4 {
	static String getYoil(int yoil) {
		String strYoil = "";
		switch(yoil){
			case 1: strYoil = "�Ͽ���"; break;
			case 2: strYoil = "������"; break;
			case 3: strYoil = "ȭ����"; break;
			case 4: strYoil = "������"; break;
			case 5: strYoil = "�����"; break;
			case 6: strYoil = "�ݿ���"; break;
			case 7: strYoil = "�����"; break;
		}
		return strYoil;
	}
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.DAY_OF_WEEK);
		String[] yoil = {"","��","��","ȭ","��","��","��","��"};
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)]);
		
		String date1 = "202005";
		String date2 = "201903";
		//�� ���ڰ��� �������� ����� ���ϴ�.
		//1.���ڿ����� subString()
		//2.���ڿ��� int�� �Ľ��ؾ��մϴ�.
		//3.���밪���� ����մϴ�. Math.abs();
		//year1,year2�� ���� �������� ȯ�� ( *12)
		//���� month1, month2�� �����ݴϴ�.
		//�׸��� �� ���� ���ݴϴ�.
		int year1 = Integer.parseInt(date1.substring(0, 4));
		int month1 = Integer.parseInt(date1.substring(4));
		int year2 = Integer.parseInt(date2.substring(0, 4));
		int month2 = Integer.parseInt(date2.substring(4));
		int diffMonth = Math.abs(month1 - month2);
		int diffYear = Math.abs(year1 - year2);
		//��� ���� ���ļ� ����ϴ°��� ��Ȯ
		int diffTime = Math.abs(((year1*12)+month1) - ((year2*12)+month2));
		if((year1-year2) == 0) {
			System.out.println("�� ��¥�� "+year1+"������ ���� �⵵ �Դϴ�.");
		}else {
			System.out.println(year1+"��� "+year2+"���� "+diffYear+"�⸸ŭ ���̳��ϴ�.");
		}
		System.out.println(year1+"��"+month1+"���� "+year2+"��"+month2+"���� "+diffTime+"���� ��ŭ ���̳��ϴ�.");
		
		//Ư�� �⵵�� �������� �Ǵ��� ����
		// ���� 366�� �̶�� �� -> 2�� 29��
		//leapYear
		//Ư�� �⵵��
		//1. 4�� ������ �������� �⵵
		//2. �׷��� �� �⵵ �߿��� 100���� ������ �������� �� �⵵�� �����ؾ� �մϴ�.
		//3. �׷��鼭 ���ÿ� 400���� ������ �������� �� �ش� ������ �˴ϴ�.
		
		int year = 2020;
		//year�� �����Դϴ�.
		//if������ ���ǰɱ�
		//year�� 4�� ����������� 100���� ������ �������� �ȵ˴ϴ�. ���ÿ� 400���� ������ ���������մϴ�.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {		//���� ���ϴ� ����
			System.out.println(year +"���� �����Դϴ�.");
		}else {
			System.out.println(year +"���� ������ �ƴմϴ�.");
		}
	}
}
