package anonymousEx;
/*
 	�͸� Ŭ���� -  �����ϱ� 1

 	1) �߻� �޼��� 1�� �ִ� �߻� Ŭ������ �����Ͻÿ�.
 	2) ���ο��� �ν��Ͻ� ������, �͸�Ŭ������ ������ �ϰ�,
 		��ü�� ���� ������ �� �޼��带 ����ϼ���.

 	�͸� Ŭ���� - �����ϱ� 2
 	1) �������̽� - �߻�޼��� 5�� �ִ� �������̽� ����
 	2) ���� ��Ӱ� �͸�Ŭ������ �̿��� ������ ����, ���ϴ� �޼��带 ȣ���� ������.
 */
abstract class TestA{
	abstract void fct();
}
interface InterA{
	void fct1();
	void fct2();
	void fct3();
	void fct4();
	void fct5();
}
class TestB implements InterA{
	@Override
	public void fct1() {	
		System.out.println("����� ���� �������� fct1�޼��� �Դϴ�.");
	}
	@Override
	public void fct2() {	
		System.out.println("����� ���� �������� fct2�޼��� �Դϴ�.");
	}
	@Override
	public void fct3() {	
		System.out.println("����� ���� �������� fct3�޼��� �Դϴ�.");
	}
	@Override
	public void fct4() {	
		System.out.println("����� ���� �������� fct4�޼��� �Դϴ�.");
	}
	@Override
	public void fct5() {
		System.out.println("����� ���� �������� fct5�޼��� �Դϴ�.");
	}
}
public class AnonymousTest3 {

	public static void main(String[] args) {
		TestA obj = new TestA() {
			@Override
			void fct() {
				System.out.println("�͸�Ŭ������ �������� �޼����Դϴ�.");
			}
		};
		obj.fct();

		TestB obj2 = new TestB();
		obj2.fct2();

		new InterA() {
			@Override
			public void fct1() {
				System.out.println("�͸�Ŭ������ ���� �������� fct1�޼��� �Դϴ�.");
			}
			@Override
			public void fct2() {
				System.out.println("�͸�Ŭ������ ���� �������� fct2�޼��� �Դϴ�.");		
			}
			@Override
			public void fct3() {
				System.out.println("�͸�Ŭ������ ���� �������� fct3�޼��� �Դϴ�.");
			}
			@Override
			public void fct4() {
				System.out.println("�͸�Ŭ������ ���� �������� fct4�޼��� �Դϴ�.");				
			}
			@Override
			public void fct5() {
				System.out.println("�͸�Ŭ������ ���� �������� fct5�޼��� �Դϴ�.");
			}
		}.fct2();
		
	}//end main
}//end class
