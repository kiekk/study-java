package day01;
/*
 	자바의 기본자료형
 	- 변수 : 저장소
 	- 변수 선언 : 타입 변수명
 	- (c언어) 	 : char short int long float double
 	- (java언어) : ★boolean char byte short int long float double
 	
 	char : 문자를 저장하는 자료형	c - 1byte, java - 2byte로 할당
 		
 		char ch = '강'; 자바에서는 가능하지만, c에서는 오류가 발생합니다.
 		ch = 'ab';		두글자를 입력하면, 오류가 발생합니다.
 		ch = '10' 		에러	
 		ch = '';		에러 (공백이 최소 한글자는 들어가야 합니다.)
 		
 	문자변수가 인스턴스 변수로 선언되면, 자동 초기화가 됩니다.
 	이때는 '\u0000' (u는 유니코드) 이라는 문자(초기값, 널)가 들어갑니다.
 	하지만,
 		char ch = ' '; 공백문자로 초기화하는게 더 유리합니다.
 
 */
//class A1{				//인스턴스 = 메모리에 실제로 생성, 
//	boolean a;			//전역변수(X) -> 인스턴스 변수	-- 기본값으로 초기화(false)
//	static boolean b;	//스태틱 변수 = 클래스 변수  (스태틱 변수 보다는 클래스 변수라는 말이 더 적절합니다.)
//	void fct() {
//		boolean local;			//지역변수(0) -- 쓰레기 값
//		A.b = true;				//19,20은 왜 오류가 안날까?
//		new A().a = true; 		//class A1내에 있지만, 같은 패키지 안에 class A가 있기 때문에 정상적으로 작동합니다.
//								//여기서 A는 DataType의 클래스 A를 의미합니다.
//		local = false;
//		System.out.println(local); //실제로 호출해야지만,
//	}
//}
class A1{
	char ch = 'b';
	void fct() {
		System.out.println(ch);
	}
}
public class DataType02 {

	public static void main(String[] args) {
		new A1().fct();
		//new 다음에 class 다음에 () == 인스턴스에 .을 붙여서 변수, 메소드를 호출할 수 있습니다.

	}

}
