package calEx;

import java.util.Calendar;
import java.util.Scanner;

/*
 	Calendar 클래스
 */
public class CalenderTest5 {
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
		//두 날짜간의 차이를 구해봅니다.	
		Calendar today = Calendar.getInstance();		//현재날짜
		Calendar inputDate = Calendar.getInstance();	//입력날짜
		int year = 0,month = 0,day = 0;
		System.out.print("년도 입력 : "); year = sc.nextInt();
		System.out.print("월 입력 : "); month = sc.nextInt()-1;	//항상 월은 -1로 입력, 잊지 말기
		System.out.print("일 입력 : "); day = sc.nextInt();
		inputDate.set(year, month, day); //month는 -1
		//today - inputDate : 두 날짜간의 epochtime이 계산됩니다.
		//그 값을 1000으로 나누면 초
		//1000*60으로 나누면 분
		//1000*60*60으로 나누면 시
		long diffTime = today.getTimeInMillis() - inputDate.getTimeInMillis();
		int diffYear = (int)(diffTime/(1000L*60*60*24*30*12));	//계속 연산이 진행될 경우 int범위를 넘을 수 있기 때문에
		int diffMonth = (int)(diffTime/(1000L*60*60*24*30));//명시적으로 L(long타입)을 선언해줍니다.
		int diffDay = (int)(diffTime/(1000L*60*60*24));
		int diffHour = (int)(diffTime/(1000L*60*60));
		int diffMin = (int)(diffTime/(1000L*60));
		int diffSec = (int)(diffTime/1000);
		
		System.out.println("입력한 날로부터 현재까지");
		System.out.println(diffYear+"년이 지났습니다.");
		System.out.println(diffMonth+"월이 지났습니다.");
		System.out.println(diffDay+"일이 지났습니다.");
		System.out.println(diffHour+"시간이 지났습니다.");
		System.out.println(diffMin+"분이 지났습니다.");
		System.out.println(diffSec+"초가 지났습니다.");
		
	}
}
