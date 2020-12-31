package anonymousEx;
/*
 	익명 클래스
 	생성할 때만, 생성자에 붙여서 씁니다.
 	이름 없는 1회용 클래스입니다.
 	클래스 body에 재정의할 메서드만 정의하면 됩니다.
 	
 	단순히 메서드 하나만 재정의 해야 할 때는 익명 클래스로 즉시성을 부여할 수 있습니다.
 	(즉시성 - 그 자리에서 바로 재정의해서 씁니다)
 	그런데, 재정의 할 메서드가 많을 경우에는, 익명 클래스로 처리하기에 부담이 됩니다.
 	그래서 상속받아서 관리하는 게 유리할 때가 많습니다.
 */
abstract class Test{		//추상 클래스 - 혼자서 인스턴스를 만들 수 없습니다.
	abstract void fct();	
}
class T extends Test{
	void some(Test t) {		//객체는 생성 가능. 인스턴스만 생성 불가능
		
	}
	@Override
	void fct() {
		
	}
}
public class AnonymousTest2 {
		
	public static void main(String[] args) {
		//익명 클래스를 이용하면,
		//이제 Test라는 추상클래스에도 인스턴스를 만들 수 있다.
		Test t = new Test() {
			@Override
			void fct() {
				System.out.println("익명 클래스를 통해서 추상메서드 또는 인터페이스도 재정의를 통해"
						+ "인스턴스를 만들 수 있습니다.");
			}
		};
		
	}

}
