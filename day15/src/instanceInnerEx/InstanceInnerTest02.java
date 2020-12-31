package instanceInnerEx;


/*
 	�̳�Ŭ����
 	-�ν��Ͻ� �̳� Ŭ����
 	-�̳�(����) Ŭ������ �մµ�, �� �̳� Ŭ������ ����Դϴ�.
 	-�� ����� �ʵ峪 �޼��尡 �ƴ϶�, Ŭ������ ����Դϴ�.
 	-���� Ŭ������ ���(�̳� Ŭ����)�� �ν��Ͻ��� ���� ��, ���� Ŭ������ �ʵ忡 �����ؾ� �մϴ�.
 */
class Outer2{
	int x = 10;		//outer�� x
	Inner myInner = new Inner();	//���� Ŭ������ �ν��Ͻ��� �̸� ������ �����ϴ�.
	static Inner2 out = new Inner2();	//Inner Ŭ������ �Ϲ� �ν��Ͻ� Ŭ�����Դϴ�.
	//out�̶�� ���������� �̸� ����� ����(static)
	//�ν��Ͻ� �̳�Ŭ�����ϰ� ���� ��Ű���� �ߴµ�, "���� �Ұ�"
	//Inner2�� static���� �����ϸ�, out ��ü�� static�� ��ġ�ϱ� ������, "���� ����"
	//out�� �̸� ����� ���� �ٷ� �ٷ� �ҷ��� ���� �; static���� �����ߴµ�,
	//���� Ŭ������ instance ���� Ŭ������ out�ϰ� ������ �ȵ� ���Դϴ�.
	//���� ����Ŭ������ staticȭ�� �ʿ��� �� �ֽ��ϴ�.
	
	void fct() {	//outer�� fct()
		System.out.println(x);
	}
	static class Inner2{
		void print() {
			System.out.println("print�޼���");
		}
	}
	class Inner{	//�ν��Ͻ� ���� Ŭ����
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("�ܺ� Ŭ���� x : " +x);
		}
	}
	//InnerŬ�������� Outer�� ����鿡 ���� ������ �����մϴ�.
}
public class InstanceInnerTest02 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Outer2.Inner innerObj = out.new Inner();
		Outer2.Inner innerObj2 = out.myInner;
		//���� Ŭ���� Ÿ�� ������ .�� ���ؼ� ��üȭ �Ǿ�� �մϴ�.
		//�̸��� ���� �Ϲ� Ŭ������ �ߺ��� �� �ֱ� ����
//		System.out.println(innerObj.y);
		innerObj.fct_y();
		System.out.println(out.myInner.y);
		out.myInner.fct_y();
		out.out.print();
	}

}
