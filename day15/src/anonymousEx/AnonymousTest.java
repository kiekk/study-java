package anonymousEx;
/*
 	익명 클래스
 	생성할 때만, 생성자에 붙여서 씁니다.
 	이름 없는 1회용 클래스입니다.
 	클래스 body에 재정의할 메서드만 정의하면 됩니다.
 */
class Type{
	void fct() {
		System.out.println("Type클래스의 fct예요");
	}
}
public class AnonymousTest {

	public static void main(String[] args) {
		Type obj = new Type();
		//fct를 변경하고 싶다
		new Type() {	//{} 블럭이 클래스 body에 해당합니다.
			@Override
			void fct() {		//단 한번만 재정의하고 다음부터는 다시 재정의 해야합니다.
//				super.fct();
				System.out.println("내가 방금 재정의한 익명 클래스의 fct입니다.");
			}
		}.fct();
		
		Type obj3 = new Type() {
			@Override
			void fct() {
				System.out.println("방금 다시 또 재정의, obj3에 대입");
			}
		};
		obj3.fct();	//obj3는 익명클래스로 재정의한 fct를 가지고 있습니다. 
	}

}
