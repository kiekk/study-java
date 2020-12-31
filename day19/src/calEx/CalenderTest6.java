package calEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 	Calendar <-> Date �����ϰ� ��ȯ���� ���ϴ�.
 	
 	Calendar �� ��¥�� set�ϱ� ���ϰ�
 	Date�� ��¥�� ���ϴ� �������� format�ϰ� ����ϱ� ���մϴ�. 
 	������ ������ �̿��մϴ�.
 	
 	������ ��¥ ����
 	Calendar : setTime(Date)	
 	Date : ������(long �и�������)
 */
public class CalenderTest6 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, Calendar.AUGUST, 15); 	//8.15
		Date date = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		System.out.println(sdf.format(date));
		
//		Date�� ������ ��¥�� cal ��ü�� ���Խ�Ű��
		date = new Date();
		cal.setTime(date);
		
	}
}
