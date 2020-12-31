package calEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 	Calendar <-> Date 간단하게 변환시켜 봅니다.
 	
 	Calendar 는 날짜를 set하기 편리하고
 	Date는 날짜를 원하는 형식으로 format하고 출력하기 편리합니다. 
 	서로의 장점을 이용합니다.
 	
 	서로의 날짜 대입
 	Calendar : setTime(Date)	
 	Date : 생성자(long 밀리세컨즈)
 */
public class CalenderTest6 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, Calendar.AUGUST, 15); 	//8.15
		Date date = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		System.out.println(sdf.format(date));
		
//		Date로 생성한 날짜를 cal 객체에 대입시키기
		date = new Date();
		cal.setTime(date);
		
	}
}
