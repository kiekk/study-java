package mathEx;

import java.util.Random;

public class MathRandomTest {

	public static void main(String[] args) {
		String[] lucky = {
				"오늘은 빨강색이 어울립니다.",
				"행운의 숫자는 6입니다",
				"길을 걷다 횡재수가 있겠네요",
				"오늘 하루는 피곤한 하루가 될 거에요"
		};
		//난수를 발생시켜,
		//오늘의 운세를 출력해 봅니다.
		int randNum = (int)(Math.random()*4);
		System.out.println(lucky[randNum]);
		//Random 클래스 사용
		String[] gift = {
			"TV","Radio","냉장고","꽝"	
		};
		//Random 클래스를 사용해서 선물하나를 출력해 봅니다.
		int rand = new Random().nextInt(4);
		System.out.println(gift[rand]);	
		System.out.println("Math.round() of 9.5 is " + Math.round(9.5));
        System.out.println("Math.round() of 10.5 is " + Math.round(10.5));
        System.out.println("Math.round() of 11.5 is " + Math.round(11.5));
        System.out.println("Math.round() of 12.5 is " + Math.round(12.5));
        System.out.println("Math.rint() of 9.5 is " + Math.rint(9.5));
        System.out.println("Math.rint() of 10.5 is " + Math.rint(10.5));
        System.out.println("Math.rint() of 11.5 is " + Math.rint(11.5));
        System.out.println("Math.rint() of 12.5 is " + Math.rint(12.5));
	}//end main
}//end class

