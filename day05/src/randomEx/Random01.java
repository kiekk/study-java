package randomEx;

import java.util.Random;

/*
 	난수 만들기
 	1) Random 클래스
 		nextInt(범위값) : 인스턴스 메서드
 		
 		객체 rand 로 만듭니다.
 		
 	2) 난수의  범위값 주기
 		범위값은 항상 0부터 시작합니다.
 		10 : 0~9 까지 10개
 		 8 : 0~7 까지  8개
 		 
 */
public class Random01 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			//0~9까지 10개중에 난수 하나를 출력합니다.
			int randNum = rand.nextInt(10);
			System.out.println(randNum);
		} 
		
		//0~9까지 난수 하나 출력하기
		System.out.println(new Random().nextInt(10));
		//	System.out.println(rand.nextInt(10));
		
		System.out.println("1 ~ 100까지 난수 출력");
		for (int i = 0; i < 50; i++) {
			//난수 가져오기
			int randNum = rand.nextInt(100) + 1; //1부터라는 뜻, 원래 0~99였지만, 0~99에서 + 1하므로 1~100의 범위값으로 변경되었습니다.
			System.out.println(randNum);
		}
		
		
		
	}//end main
}//end class
