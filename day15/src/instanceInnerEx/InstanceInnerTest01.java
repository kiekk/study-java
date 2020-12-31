package instanceInnerEx;
/*
 	이너클래스
 	-인스턴스 이너 클래스
 	-이너(내부) 클래스가 잇는데, 그 이너 클래스도 멤버입니다.
 	-그 멤버는 필드나 메서드가 아니라, 클래스인 멤버입니다.
 	-따라서 클래스인 멤버(이너 클래스)는 인스턴스를 만든 후, 내부 클래스의 필드에 접근해야 합니다.
 */
class Outer{
	int x = 10;		//outer의 x
	void fct() {	//outer의 fct()
		System.out.println(x);
	}
	class Inner{
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("외부 클래스 x : " +x);
		}
	}
	//Inner클래스에서 Outer의 멤버들에 직접 접근이 가능합니다.
}
public class InstanceInnerTest01 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner innerObj = out.new Inner();
		//내부 클래스 타입 선언은 .을 통해서 구체화 되어야 합니다.
		//이름이 같은 일반 클래스와 중복될 수 있기 때문
		System.out.println(innerObj.y);
		innerObj.fct_y();

	}

}
