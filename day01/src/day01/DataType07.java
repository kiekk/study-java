package day01;
/*
 	자바의 기본자료형
 	- 변수 : 저장소
 	- 변수 선언 : 타입 변수명
 	- (c언어) 	 : char short int long float double
 	- (java언어) : ★boolean char byte short int long float double
 	
 	float(4byte) double(8byte)
 	
 	참조 자료형
 		배열, 클래스
 	String(기본 자료형처럼 자주 쓰이는 참조 자료형)
*/
public class DataType07 {

	public static void main(String[] args) {
		float _f = 1.4f;
		float _f2 = (float)1.4;
		System.out.println(_f);
		System.out.println(_f2);
		
		String msg = "abcd";
		System.out.println(msg);
		String msg2 = "defg";
		//두 문자열 더하기
		System.out.println(msg+msg2);
		//왜 참조 자료형인데 기본형처럼 쓰일까? 왜 String msg3 = new String();처럼 안쓸까?★
		
		String msg3 = new String("스트링입니다");
		
		Imsi p = new Imsi();  //참조자료형, 참조변수(객체 object) p를 생성.
							  //new Imsi();  <--'인스턴스'
		//인스턴스를 만들어서 객체에 저장해 놓자.
		
		사람 백성민 = new 사람();
		사람 윤순호 = new 사람();
		new 사람();	//아직 이름이 없습니다. 이름(객체)
		
		백성민.밥먹기();
		
	}//end main
}//end class
class Imsi{}
class 사람{
	void 밥먹기() {
		
	}
}
