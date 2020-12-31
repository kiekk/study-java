package extendsEx2;
/*
 	매개변수의 다형성
 	
 */
class Parent{
	
}
class Child extends Parent{
	void playGround() {
		System.out.println("차일드 - 운동장에서 뛰어 논다.");
	}
	
}
class GrandChild extends Child{
	void kidsCafe() {
		System.out.println("손자 - 키즈카페에서 논다");
	}
}
class Control{
	static void fct(Parent obj) {
//		System.out.println("Parent");
//		System.out.println(obj.toString());
		/*
		 *  instanceof 연산자
		 *  true,false를 반환해주는 연산자
		 *  
		 *  obj instanceof 타입  해당 타입으로 형변환이 가능한지 체크해주는 연산자입니다.
		 */
		if(obj instanceof GrandChild) {
			((GrandChild)obj).kidsCafe();
		}else if(obj instanceof Child) {			//GrandChild 도 Child의 타입중에 하나이기 때문에, 먼저 GrandChild를 비교해줘야합니다.
			((Child)obj).playGround();
		}
//		if(obj instanceof Child) {					//ojb은 GrandChild의 인스턴스인데 Child타입 객체에 대입하고 있습니다. 이를 upCasting이라고 합니다.
//													//																인스턴스가 상위로 변환,java는 허용하지 않습니다.
//			Child some = (Child)obj;				//참조변수 타입은 Parent입니다.
//			some.playGround();						//클래스의 형변환은 인스턴스 타입을 따라가는 것이 아닙니다.
//													//참조변수(객체)의 타입을 따라갑니다.
//													//Parent obj = 자식 인스턴스();
//													//obj를 형변환 하게되면, 다운캐스팅이 됩니다.
//													//obj를 자식 타입인 Child로 다운캐스팅 한 후에
//													//Child의 메서드를 호출 할 수 있게 됩니다.
//		}else if(obj instanceof GrandChild) {	
//			((GrandChild)obj).kidsCafe();
//		}

	}
//	static void fct(Child obj) {
//		System.out.println("Child");
//	}
}
public class Polymorphism {

	public static void main(String[] args) {
//		Parent obj = null;
//		
//		obj = new Child();//다형성

//		obj.메서드(); 만약 이 메서드가 재정의 되었다면, 자식 타입의 메서드를 실행하게 됩니다.
//						이를 동적 결합이라고 합니다.
		Control.fct(new Child());
		Control.fct(new GrandChild());

	}
	
}
