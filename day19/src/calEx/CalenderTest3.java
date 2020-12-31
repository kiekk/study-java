package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 클래스
 */
public class CalenderTest3 {
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
		Scanner sc = new Scanner(System.in);
		Calendar cal1 = Calendar.getInstance();
		//원하는 날짜를 입력하면 해당 요일을 출력해 줍니다.
		int year = 0,month = 0,day = 0;
		System.out.print("년도 입력 : "); year = sc.nextInt();
		System.out.print("월 입력 : "); month = sc.nextInt()-1;	//항상 월은 -1로 입력, 잊지 말기
		System.out.print("일 입력 : "); day = sc.nextInt();
		//생일은 1990년 2월 21일 생 입니다.
		cal1.set(year, month, day); //month는 -1

		
		//무슨 요일에 태어났습니까
		int yoil = cal1.get(Calendar.DAY_OF_WEEK);
		System.out.println(yoil +" : "+getYoil(yoil));
		
	}
}
