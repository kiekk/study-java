package calEx;

import java.util.Calendar;

/*
 	Calendar Ŭ����
 */
class PrintCalender{
	static void printCalendar(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) +"�� "+(cal.get(Calendar.MONTH)+1)+"�� "+cal.get(Calendar.DAY_OF_MONTH)+"�� "
				+cal.get(Calendar.HOUR)+"�� "+cal.get(Calendar.MINUTE)+"�� "+cal.get(Calendar.SECOND)+"��");
	}
}
public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
//		System.out.println(cal);
		//Date ����ó�� ��-��-�� ��-��-�ʸ� 
		//Calendar�� ����� �̿��� ����� ���ϴ�.
		//cal.YEAR, cal.MONTH�� ������ ��������� Calendar�� �ۼ��� �ֵ��� �մϴ�.
		PrintCalender.printCalendar(cal);
		
	}
	

}
