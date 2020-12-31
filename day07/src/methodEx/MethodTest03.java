package methodEx;

import java.util.Scanner;
/*
 	call by value (값 전달)
 	
 	fct(10,20) <-- 기본값을 전달하는 것
 	
 	call by reference (참조값 전달)
 	
 	fct(객체 or 인스턴스) <-- 참조값을 전달하는 것
 	fct(obj)
 	fct(arr)	전달한 객체 or 인스턴스의 값이 동시에 변경됩니다.
 	
 */
public class MethodTest03 {
	void changeArray(int []ar) {
		//ar 참조변수엔 arScore의 (데이터와) 참조값이 모두 전달됩니다.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		//값 변경
		ar[0] = 100;
		ar[1] = 200;
	}
	public static void main(String[] args) {
		int []arScore = {10, 20};
		new MethodTest03().changeArray(arScore);
		System.out.println(arScore[0]);
		System.out.println(arScore[1]);
		
	}//end main
}//end class
