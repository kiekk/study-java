package instanceInnerEx;

class Outer3{
	int x = 11;
	Inner inner = new Inner();
	class Inner{
		int x = 22;
		void fct() {
			int x = 33;
			System.out.println("fct()의 x : " + x);
			System.out.println("Inner의 x : " + this.x);
			System.out.println("Outer3의 x : "+ Outer3.this.x);
			//변수명이 다를 경우 자동적으로 해당 변수에 찾아가지만,
			//위와 같이 변수명이 같을 경우에는 구체적으로 변수의 위치를 알려줘야 합니다.+
		}
	}
}
public class InstanceInnerTest04 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.inner.fct();
	
		
	}

}








