package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar Ŭ����
 */
public class CalenderTest5 {
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
		Scanner sc = new Scanner(System.in);
		//�� ��¥���� ���̸� ���غ��ϴ�.	
		Calendar today = Calendar.getInstance();		//���糯¥
		Calendar inputDate = Calendar.getInstance();	//�Է³�¥
		int year = 0,month = 0,day = 0;
		System.out.print("�⵵ �Է� : "); year = sc.nextInt();
		System.out.print("�� �Է� : "); month = sc.nextInt()-1;	//�׻� ���� -1�� �Է�, ���� ����
		System.out.print("�� �Է� : "); day = sc.nextInt();
		inputDate.set(year, month, day); //month�� -1
		//today - inputDate : �� ��¥���� epochtime�� ���˴ϴ�.
		//�� ���� 1000���� ������ ��
		//1000*60���� ������ ��
		//1000*60*60���� ������ ��
		long diffTime = today.getTimeInMillis() - inputDate.getTimeInMillis();
		int diffYear = (int)(diffTime/(1000L*60*60*24*30*12));	//��� ������ ����� ��� int������ ���� �� �ֱ� ������
		int diffMonth = (int)(diffTime/(1000L*60*60*24*30));//��������� L(longŸ��)�� �������ݴϴ�.
		int diffDay = (int)(diffTime/(1000L*60*60*24));
		int diffHour = (int)(diffTime/(1000L*60*60));
		int diffMin = (int)(diffTime/(1000L*60));
		int diffSec = (int)(diffTime/1000);
		
		System.out.println("�Է��� ���κ��� �������");
		System.out.println(diffYear+"���� �������ϴ�.");
		System.out.println(diffMonth+"���� �������ϴ�.");
		System.out.println(diffDay+"���� �������ϴ�.");
		System.out.println(diffHour+"�ð��� �������ϴ�.");
		System.out.println(diffMin+"���� �������ϴ�.");
		System.out.println(diffSec+"�ʰ� �������ϴ�.");
		
	}
}
