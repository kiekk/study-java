package anonymousEx;
/*
 	�͸� Ŭ����
 	������ ����, �����ڿ� �ٿ��� ���ϴ�.
 	�̸� ���� 1ȸ�� Ŭ�����Դϴ�.
 	Ŭ���� body�� �������� �޼��常 �����ϸ� �˴ϴ�.
 */
class Type{
	void fct() {
		System.out.println("TypeŬ������ fct����");
	}
}
public class AnonymousTest {

	public static void main(String[] args) {
		Type obj = new Type();
		//fct�� �����ϰ� �ʹ�
		new Type() {	//{} ���� Ŭ���� body�� �ش��մϴ�.
			@Override
			void fct() {		//�� �ѹ��� �������ϰ� �������ʹ� �ٽ� ������ �ؾ��մϴ�.
//				super.fct();
				System.out.println("���� ��� �������� �͸� Ŭ������ fct�Դϴ�.");
			}
		}.fct();
		
		Type obj3 = new Type() {
			@Override
			void fct() {
				System.out.println("��� �ٽ� �� ������, obj3�� ����");
			}
		};
		obj3.fct();	//obj3�� �͸�Ŭ������ �������� fct�� ������ �ֽ��ϴ�. 
	}

}
