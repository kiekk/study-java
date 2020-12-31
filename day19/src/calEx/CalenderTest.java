package calEx;

import java.util.Calendar;

/*
 	Calendar 클래스
 */
class PrintCalender{
	static void printCalendar(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) +"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DAY_OF_MONTH)+"일 "
				+cal.get(Calendar.HOUR)+"시 "+cal.get(Calendar.MINUTE)+"분 "+cal.get(Calendar.SECOND)+"초");
	}
}
public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
//		System.out.println(cal);
		//Date 형식처럼 년-월-일 시-분-초를 
		//Calendar의 상수를 이용해 출력해 봅니다.
		//cal.YEAR, cal.MONTH도 되지만 명시적으로 Calendar로 작성해 주도록 합니다.
		PrintCalender.printCalendar(cal);
		
	}
	

}
