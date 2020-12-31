package staticInnerEx;
class Outer{
	
	Outer.Inner in = new Inner();
	class Inner{		//�ν��Ͻ� �̳�	
		int num = 99;
//		static int stNum = 11;	//static ������ ������ ����? InnerŬ������ �ν��Ͻ��̱� ������
								//Inner��� Ŭ������ �ν��Ͻ��� ������� �Ŀ� Ȱ���� �� �ֽ��ϴ�.
								//Outer�� ���� instance�� �ȵ� ��Ȳ
	}
	static class StaticInner{	//����ƽ �̳�
								//static ������ ������ �ش� ���� Ŭ������ static�̾�� �մϴ�.
		static int stNum = 11;	//�� ��� Outer���� ȣ���ؼ� ����� �� �ֽ��ϴ�.
		int value = 9999;
	}
}
public class StaticInnerText {

	public static void main(String[] args) {
		//num ����غ���
		Outer out = new Outer();
		System.out.println(out.in.num);
		//stNum ����غ���
		System.out.println(Outer.StaticInner.stNum);
		//value ����غ���
//		System.out.println(new StaticInner().value);
//		System.out.println(new Outer.StaticInner().value);
		//value�� �ν��Ͻ� �����̱� ������ Ŭ������ �ν��Ͻ�ȭ ��Ų �Ŀ��� ����� �����մϴ�.
//		Outer.StaticInner obj = new Outer.StaticInner();
//		System.out.println(obj.value);
	}

}
