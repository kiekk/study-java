package instanceInnerEx;

class Outer3{
	int x = 11;
	Inner inner = new Inner();
	class Inner{
		int x = 22;
		void fct() {
			int x = 33;
			System.out.println("fct()�� x : " + x);
			System.out.println("Inner�� x : " + this.x);
			System.out.println("Outer3�� x : "+ Outer3.this.x);
			//�������� �ٸ� ��� �ڵ������� �ش� ������ ã�ư�����,
			//���� ���� �������� ���� ��쿡�� ��ü������ ������ ��ġ�� �˷���� �մϴ�.+
		}
	}
}
public class InstanceInnerTest04 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.inner.fct();
	
		
	}

}








