package instanceInnerEx;
/*
 	�̳�Ŭ����
 	-�ν��Ͻ� �̳� Ŭ����
 	-�̳�(����) Ŭ������ �մµ�, �� �̳� Ŭ������ ����Դϴ�.
 	-�� ����� �ʵ峪 �޼��尡 �ƴ϶�, Ŭ������ ����Դϴ�.
 	-���� Ŭ������ ���(�̳� Ŭ����)�� �ν��Ͻ��� ���� ��, ���� Ŭ������ �ʵ忡 �����ؾ� �մϴ�.
 */
class Outer{
	int x = 10;		//outer�� x
	void fct() {	//outer�� fct()
		System.out.println(x);
	}
	class Inner{
		int y = 10;
		void fct_y() {
			System.out.println(y);
			System.out.println("�ܺ� Ŭ���� x : " +x);
		}
	}
	//InnerŬ�������� Outer�� ����鿡 ���� ������ �����մϴ�.
}
public class InstanceInnerTest01 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner innerObj = out.new Inner();
		//���� Ŭ���� Ÿ�� ������ .�� ���ؼ� ��üȭ �Ǿ�� �մϴ�.
		//�̸��� ���� �Ϲ� Ŭ������ �ߺ��� �� �ֱ� ����
		System.out.println(innerObj.y);
		innerObj.fct_y();

	}

}
