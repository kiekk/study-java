package day01;
/*
 	자바의 기본자료형
 	- 변수 : 저장소
 	- 변수 선언 : 타입 변수명
 	- (c언어) 	 : char short int long float double
 	- (java언어) : ★boolean char byte short int long float double
 	
 	- boolean : boolean isPass;		is- true(1),false(0)
 	  boolean 타입의 기본값은 false입니다. (전역변수 -> 인스턴스 변수)
 	  모든 함수와 변수는 클래스영역 내부에 존재해야 합니다.
 
 */
class A{				//인스턴스 = 메모리에 실제로 생성, 
	boolean a;			//전역변수(X) -> 인스턴스 변수	-- 기본값으로 초기화(false)
	static boolean b;	//스태틱 변수 = 클래스 변수  (스태틱 변수 보다는 클래스 변수라는 말이 더 적절합니다.)
	void fct() {
		boolean local;		//지역변수(0) -- 쓰레기 값
		A.b = true;
		new A().a = true; 	//인스턴스 변수는 클래스를 인스턴스로 만든 후에 사용할 수 있습니다.
		//new키워드를 사용해 인스턴스 변수를 사용할 수 있습니다.//클래스 챕터에서 다시 공부
		
		local = false;
		System.out.println(local); //실제로 호출해야지만,
	}
}
public class DataType {

	public static void main(String[] args) {
		

	}

}
