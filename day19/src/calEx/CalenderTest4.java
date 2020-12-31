package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 클래스
 */
public class CalenderTest4 {
	static String getYoil(int yoil) {
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
		return strYoil;
	}
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.DAY_OF_WEEK);
		String[] yoil = {"","일","월","화","수","목","금","토"};
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)]);
		
		String date1 = "202005";
		String date2 = "201903";
		//두 날자간에 개월수를 계산해 봅니다.
		//1.문자열에서 subString()
		//2.문자열을 int로 파싱해야합니다.
		//3.절대값으로 출력합니다. Math.abs();
		//year1,year2를 각각 개월수로 환산 ( *12)
		//각각 month1, month2에 더해줍니다.
		//그리고 그 값을 빼줍니다.
		int year1 = Integer.parseInt(date1.substring(0, 4));
		int month1 = Integer.parseInt(date1.substring(4));
		int year2 = Integer.parseInt(date2.substring(0, 4));
		int month2 = Integer.parseInt(date2.substring(4));
		int diffMonth = Math.abs(month1 - month2);
		int diffYear = Math.abs(year1 - year2);
		//년과 월을 합쳐서 계산하는것이 정확
		int diffTime = Math.abs(((year1*12)+month1) - ((year2*12)+month2));
		if((year1-year2) == 0) {
			System.out.println("두 날짜는 "+year1+"년으로 같은 년도 입니다.");
		}else {
			System.out.println(year1+"년과 "+year2+"년은 "+diffYear+"년만큼 차이납니다.");
		}
		System.out.println(year1+"년"+month1+"월과 "+year2+"년"+month2+"월은 "+diffTime+"개월 만큼 차이납니다.");
		
		//특정 년도가 윤년인지 판단해 보기
		// 윤년 366일 이라는 뜻 -> 2월 29일
		//leapYear
		//특정 년도가
		//1. 4로 나누어 떨어지는 년도
		//2. 그런데 그 년도 중에서 100으로 나누어 떨어지면 그 년도는 제외해야 합니다.
		//3. 그러면서 동시에 400으로 나누어 떨어지면 그 해는 윤년이 됩니다.
		
		int year = 2020;
		//year는 윤년입니다.
		//if문으로 조건걸기
		//year가 4로 나누어떨어지고 100으로 나누어 떨어지면 안됩니다. 동시에 400으로 나누어 떨어져야합니다.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {		//윤년 구하는 공식
			System.out.println(year +"년은 윤년입니다.");
		}else {
			System.out.println(year +"년은 윤년이 아닙니다.");
		}
	}
}
