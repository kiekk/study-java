package calEx;

import java.util.Calendar;

/*
 	Calendar 클래스
 */
public class CalenderTest2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
//		System.out.println(cal);
		//Date 형식처럼 년-월-일 시-분-초를 
		//Calendar의 상수를 이용해 출력해 봅니다.
		//cal.YEAR, cal.MONTH도 되지만 명시적으로 Calendar로 작성해 주도록 합니다.
		PrintCalender.printCalendar(cal);
		//요일 : 주단위, int 리턴값 -> 일요일 : 1, 토요일 : 7
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(일요일 1) : "+yoil);
		String strYoil = "";
		switch(yoil){
			case 1: strYoil = "일요일"; break;
			case 2: strYoil = "월요일"; break;
			case 3: strYoil = "화요일"; break;
			case 4: strYoil = "수요일"; break;
			case 5: strYoil = "목요일"; break;
			case 6: strYoil = "금요일"; break;
			case 7: strYoil = "토요일"; break;
		}
		System.out.println(yoil +" : "+strYoil);
		
		//이번달 : 6월 실제값은 5
		//그 달의 마지막 일
		//1월 31일
		//2월 28일(29)
		//3월 31일
		//4월 30일
		int lastDate = cal.getActualMaximum(Calendar.DATE);	//그 달의 마지막 일이 며칠인지 알려줍니다.
		System.out.println((cal.get(Calendar.MONTH)+1) +"월의 마지막 일 : " + lastDate);
		
	}
	

}
