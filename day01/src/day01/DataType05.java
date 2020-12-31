package day01;
/*
 	자바의 기본자료형
 	- 변수 : 저장소
 	- 변수 선언 : 타입 변수명
 	- (c언어) 	 : char short int long float double
 	- (java언어) : ★boolean char byte short int long float double
 	
 	long : 정수형중 가장 큰 자료형 8byte 약 ±920경
 	
 	
 		
*/
public class DataType05 {

	public static void main(String[] args) {
		long _longNum = 99999999999L;		//L을 붙여줘야 long타입으로 인식합니다. 
											//소문자 l을 쓰면 가독성이 떨어집니다.
		System.out.println("long 타입 : "+ _longNum);
		System.out.println("(int)long 타입 : "+ (int)_longNum);
	}

}
 