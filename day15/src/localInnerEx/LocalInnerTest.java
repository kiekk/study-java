package localInnerEx;
/*
 	���� �̳�Ŭ����
 	(���� == �޼��� ����)
 	-> �޼��� ���ο� Ŭ������ ����ϴ�.
 	�׷���, �޼��� ���ο� ���� Ŭ������
 	�ܺο��� �θ� �� �����ϴ�.
 	
 	=> �޼��� ���ο� "�Ǵٸ� �޼��带 ������ �� �ֽ��ϴ�"
 	��, �ݵ�� ���� Ŭ������ ���ؼ��� ������ �� �ֽ��ϴ�. �ܺο� �����Ű�� �ʱ� ���ؼ�(���� ����)
 	�޼��� ���ο� ���� Ŭ������ ���� ����մϴ�.
 */
class Outer{
	void fct() {
		//�޼��� ���ο� Ŭ������ �ϳ� ����ϴ�.
		class Inner{
			void innerFct() {
				System.out.println("���� �̳� Ŭ������ ȣ���߽��ϴ�.");
			}
		}
		//�޼��� �ȿ��� ���� ���� Ŭ������ �ν��Ͻ� ȭ ���Ŀ�
		//�� �ν��Ͻ��� ���� �޼��忡 �����ϵ��� �մϴ�.
		Inner in = new Inner();
		in.innerFct();
		System.out.println("�ܺ� fctȣ��");
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		new Outer().fct();
		

	}

}
