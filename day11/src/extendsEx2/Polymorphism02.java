package extendsEx2;
/*
 	�Ű������� ������
 	
 */
class ParentA{
	void fct() {
		System.err.println("�θ�");
	}
}
class ChildA extends ParentA{
	@Override
	void fct() {
		System.out.println("Ŭ����A");
	}
	void printA() {
		System.out.println("printA��");
	}
}
class ChildB extends ParentA{
	@Override
	void fct() {
		System.out.println("Ŭ����B");
	}
	void printB() {
		System.out.println("printB��");
	}
}
class House{
	static void control(ParentA some) {
		some.fct();
		if(some instanceof ChildA) 
			((ChildA)some).printA();
		if(some instanceof ChildB)
			((ChildB)some).printB();
	}
}
public class Polymorphism02 {

	public static void main(String[] args) {
		ChildA aone = new ChildA();
		ChildB bone = new ChildB();
		
		House.control(aone);
		House.control(bone);
		
		
	}
	
}
