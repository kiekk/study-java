package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar Ŭ����
 */
public class CalenderTest3 {
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
		Calendar cal1 = Calendar.getInstance();
		//���ϴ� ��¥�� �Է��ϸ� �ش� ������ ����� �ݴϴ�.
		int year = 0,month = 0,day = 0;
		System.out.print("�⵵ �Է� : "); year = sc.nextInt();
		System.out.print("�� �Է� : "); month = sc.nextInt()-1;	//�׻� ���� -1�� �Է�, ���� ����
		System.out.print("�� �Է� : "); day = sc.nextInt();
		//������ 1990�� 2�� 21�� �� �Դϴ�.
		cal1.set(year, month, day); //month�� -1

		
		//���� ���Ͽ� �¾���ϱ�
		int yoil = cal1.get(Calendar.DAY_OF_WEEK);
		System.out.println(yoil +" : "+getYoil(yoil));
		
	}
}
