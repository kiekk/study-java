package instanceInnerEx;


/*
 	이너클래스
 	-인스턴스 이너 클래스
 	-이너(내부) 클래스가 잇는데, 그 이너 클래스도 멤버입니다.
 	-그 멤버는 필드나 메서드가 아니라, 클래스인 멤버입니다.
 	-따라서 클래스인 멤버(이너 클래스)는 인스턴스를 만든 후, 내부 클래스의 필드에 접근해야 합니다.
 */
class Outer2{
	int x = 10;		//outer의 x
	Inner myInner = new Inner();	//내부 클래스의 인스턴스를 미리 생성해 놨습니다.
	static Inner2 out = new Inner2();	//Inner 클래스는 일반 인스턴스 클래스입니다.
	//out이라는 참조변수를 미리 만들어 놓고(static)
	//인스턴스 이너클래스하고 연결 시키려고 했는데, "대입 불가"
	//Inner2를 static으로 선언하면, out 객체의 static과 일치하기 때문에, "대입 가능"
	//out을 미리 만들어 놓고 바로 바로 불러서 쓰고 싶어서 static으로 선언했는데,
	//내부 클래스가 instance 내부 클래스라서 out하고 연결이 안된 것입니다.
	//따라서 내부클래스도 static화가 필요할 수 있습니다.
	
	void fct() {	//outer의 fct()
		System.out.println(x);
	}
	static class Inner2{
		void print() {
			System.out.println("print메서드");
		}
	}
	class Inner{	//인스턴스 내부 클래스
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("외부 클래스 x : " +x);
		}
	}
	//Inner클래스에서 Outer의 멤버들에 직접 접근이 가능합니다.
}
public class InstanceInnerTest02 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Outer2.Inner innerObj = out.new Inner();
		Outer2.Inner innerObj2 = out.myInner;
		//내부 클래스 타입 선언은 .을 통해서 구체화 되어야 합니다.
		//이름이 같은 일반 클래스와 중복될 수 있기 때문
//		System.out.println(innerObj.y);
		innerObj.fct_y();
		System.out.println(out.myInner.y);
		out.myInner.fct_y();
		out.out.print();
	}

}
