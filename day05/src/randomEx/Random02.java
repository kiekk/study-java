package randomEx;

import java.util.Random;

/*
	난수 만들기
	1) Math 클래스
		random() 이라는 클래스메서드(스태틱메서드)를 이용합니다.
		100번 실행해서 출력되는 난수의 형태를 확인해 봅니다.
 */
public class Random02 {

	public static void main(String[] args) {
		
		for(int i = 0;i<100;i++) {
			System.out.println(Math.random());	
		}
		
	}//end main
}//end class
