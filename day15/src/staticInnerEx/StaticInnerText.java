package staticInnerEx;
class Outer{
	
	Outer.Inner in = new Inner();
	class Inner{		//인스턴스 이너	
		int num = 99;
//		static int stNum = 11;	//static 변수가 에러난 이유? Inner클래스가 인스턴스이기 때문에
								//Inner라는 클래스는 인스턴스가 만들어진 후에 활동할 수 있습니다.
								//Outer도 아직 instance가 안된 상황
	}
	static class StaticInner{	//스태틱 이너
								//static 변수를 선언한 해당 내부 클래스도 static이어야 합니다.
		static int stNum = 11;	//그 결과 Outer에서 호출해서 사용할 수 있습니다.
		int value = 9999;
	}
}
public class StaticInnerText {

	public static void main(String[] args) {
		//num 출력해보기
		Outer out = new Outer();
		System.out.println(out.in.num);
		//stNum 출력해보기
		System.out.println(Outer.StaticInner.stNum);
		//value 출력해보기
//		System.out.println(new StaticInner().value);
//		System.out.println(new Outer.StaticInner().value);
		//value는 인스턴스 변수이기 때문에 클래스를 인스턴스화 시킨 후에만 사용이 가능합니다.
//		Outer.StaticInner obj = new Outer.StaticInner();
//		System.out.println(obj.value);
	}

}
