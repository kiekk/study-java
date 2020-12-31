package anonymousEx;
/*
 	익명 클래스 -  연습하기 1

 	1) 추상 메서드 1개 있는 추상 클래스를 정의하시오.
 	2) 메인에서 인스턴스 생성시, 익명클래스로 재정의 하고,
 		객체를 통해 재정의 한 메서드를 출력하세요.

 	익명 클래스 - 연습하기 2
 	1) 인터페이스 - 추상메서드 5개 있는 인터페이스 정의
 	2) 각각 상속과 익명클래스를 이용해 재정의 한후, 원하는 메서드를 호출해 보세요.
 */
abstract class TestA{
	abstract void fct();
}
interface InterA{
	void fct1();
	void fct2();
	void fct3();
	void fct4();
	void fct5();
}
class TestB implements InterA{
	@Override
	public void fct1() {	
		System.out.println("상속을 통해 재정의한 fct1메서드 입니다.");
	}
	@Override
	public void fct2() {	
		System.out.println("상속을 통해 재정의한 fct2메서드 입니다.");
	}
	@Override
	public void fct3() {	
		System.out.println("상속을 통해 재정의한 fct3메서드 입니다.");
	}
	@Override
	public void fct4() {	
		System.out.println("상속을 통해 재정의한 fct4메서드 입니다.");
	}
	@Override
	public void fct5() {
		System.out.println("상속을 통해 재정의한 fct5메서드 입니다.");
	}
}
public class AnonymousTest3 {

	public static void main(String[] args) {
		TestA obj = new TestA() {
			@Override
			void fct() {
				System.out.println("익명클래스로 재정의한 메서드입니다.");
			}
		};
		obj.fct();

		TestB obj2 = new TestB();
		obj2.fct2();

		new InterA() {
			@Override
			public void fct1() {
				System.out.println("익명클래스를 통해 재정의한 fct1메서드 입니다.");
			}
			@Override
			public void fct2() {
				System.out.println("익명클래스를 통해 재정의한 fct2메서드 입니다.");		
			}
			@Override
			public void fct3() {
				System.out.println("익명클래스를 통해 재정의한 fct3메서드 입니다.");
			}
			@Override
			public void fct4() {
				System.out.println("익명클래스를 통해 재정의한 fct4메서드 입니다.");				
			}
			@Override
			public void fct5() {
				System.out.println("익명클래스를 통해 재정의한 fct5메서드 입니다.");
			}
		}.fct2();
		
	}//end main
}//end class
