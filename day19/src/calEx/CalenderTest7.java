package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 달력만들기
 	- 년도와 월을 입력받으면 그 달의 달력을 출력합니다.
 	입력 예)
 	년도 : 2020
 	월   :  5

 	일 월 화 수 목 금 토

 	1.시작 요일을 알아야 합니다.  수요일에 1이 시작된다면 일월화 까지 공백을 출력해야 합니다.
 	2.마지막날을 알아야합니다. getActual~
 	3.날짜는 오른쪽 정렬해야합니다.
 */
public class CalenderTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int year = 2020, month = 6-1;
		cal.set(year, month, 1);
		System.out.println("     ["+year+"년 "+month+"월]");
		System.out.println(" 일 월 화 수 목 금 토");
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
		//한글이 2칸, 공백이 1칸으로 총 3칸씩 간격을 맞춰야합니다.

	}
}
