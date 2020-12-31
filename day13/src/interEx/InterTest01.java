package interEx;

interface InterA{
	void update();
}
interface InterB{
	void delete();
}
//접미사에 able이 붙어있으면 interface인지를 생각해봐야 합니다.
//public interface controllable extends InterA, InterB{		<--오류 , interface도 class와 동일한 타입이라는 것을 증명
															//한 클래스에서는 public class는 단 한개만 존재해야 합니다.

//interface를 사용하는 이유 : 표준을 정할 수 있음, guide를 정할 수 있음
//모든 클래스가 가져야할 메서드를 지정할 수 있음,
interface Controllable extends InterA, InterB{
	
}
class Control implements Controllable{
	@Override
	public void update() {
		System.out.println("Control 클래스의 update");
	}
	@Override
	public void delete() {
		System.out.println("Control 클래스의 delete");
	}
}
class ControlB implements Controllable{
	@Override
	public void update() {
		System.out.println("ControlB 클래스의 update");
	}
	@Override
	public void delete() {	
		System.out.println("ControlB 클래스의 delete");
	}
}
//제 3의 클래스
class Some2{
	//interface도 결국 타입입니다.
	//다형적 대입이 가능.
	void fct(Controllable obj) {
		obj.update();
		obj.delete();
	}
}
public class InterTest01 {

	public static void main(String[] args) {
		//인스턴스의 타입에 따라서 실행될 메서드가 결정 -> 동적결합
		new Some2().fct(new Control());
		new Some2().fct(new ControlB());

	}

}
