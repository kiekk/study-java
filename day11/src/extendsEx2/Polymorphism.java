package extendsEx2;
/*
 	�Ű������� ������
 	
 */
class Parent{
	
}
class Child extends Parent{
	void playGround() {
		System.out.println("���ϵ� - ��忡�� �پ� ���.");
	}
	
}
class GrandChild extends Child{
	void kidsCafe() {
		System.out.println("���� - Ű��ī�信�� ���");
	}
}
class Control{
	static void fct(Parent obj) {
//		System.out.println("Parent");
//		System.out.println(obj.toString());
		/*
		 *  instanceof ������
		 *  true,false�� ��ȯ���ִ� ������
		 *  
		 *  obj instanceof Ÿ��  �ش� Ÿ������ ����ȯ�� �������� üũ���ִ� �������Դϴ�.
		 */
		if(obj instanceof GrandChild) {
			((GrandChild)obj).kidsCafe();
		}else if(obj instanceof Child) {			//GrandChild �� Child�� Ÿ���߿� �ϳ��̱� ������, ���� GrandChild�� ��������մϴ�.
			((Child)obj).playGround();
		}
//		if(obj instanceof Child) {					//ojb�� GrandChild�� �ν��Ͻ��ε� ChildŸ�� ��ü�� �����ϰ� �ֽ��ϴ�. �̸� upCasting�̶�� �մϴ�.
//													//																�ν��Ͻ��� ������ ��ȯ,java�� ������� �ʽ��ϴ�.
//			Child some = (Child)obj;				//�������� Ÿ���� Parent�Դϴ�.
//			some.playGround();						//Ŭ������ ����ȯ�� �ν��Ͻ� Ÿ���� ���󰡴� ���� �ƴմϴ�.
//													//��������(��ü)�� Ÿ���� ���󰩴ϴ�.
//													//Parent obj = �ڽ� �ν��Ͻ�();
//													//obj�� ����ȯ �ϰԵǸ�, �ٿ�ĳ������ �˴ϴ�.
//													//obj�� �ڽ� Ÿ���� Child�� �ٿ�ĳ���� �� �Ŀ�
//													//Child�� �޼��带 ȣ�� �� �� �ְ� �˴ϴ�.
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
//		obj = new Child();//������

//		obj.�޼���(); ���� �� �޼��尡 ������ �Ǿ��ٸ�, �ڽ� Ÿ���� �޼��带 �����ϰ� �˴ϴ�.
//						�̸� ���� �����̶�� �մϴ�.
		Control.fct(new Child());
		Control.fct(new GrandChild());

	}
	
}
