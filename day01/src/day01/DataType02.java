package day01;
/*
 	�ڹ��� �⺻�ڷ���
 	- ���� : �����
 	- ���� ���� : Ÿ�� ������
 	- (c���) 	 : char short int long float double
 	- (java���) : ��boolean char byte short int long float double
 	
 	char : ���ڸ� �����ϴ� �ڷ���	c - 1byte, java - 2byte�� �Ҵ�
 		
 		char ch = '��'; �ڹٿ����� ����������, c������ ������ �߻��մϴ�.
 		ch = 'ab';		�α��ڸ� �Է��ϸ�, ������ �߻��մϴ�.
 		ch = '10' 		����	
 		ch = '';		���� (������ �ּ� �ѱ��ڴ� ���� �մϴ�.)
 		
 	���ں����� �ν��Ͻ� ������ ����Ǹ�, �ڵ� �ʱ�ȭ�� �˴ϴ�.
 	�̶��� '\u0000' (u�� �����ڵ�) �̶�� ����(�ʱⰪ, ��)�� ���ϴ�.
 	������,
 		char ch = ' '; ���鹮�ڷ� �ʱ�ȭ�ϴ°� �� �����մϴ�.
 
 */
//class A1{				//�ν��Ͻ� = �޸𸮿� ������ ����, 
//	boolean a;			//��������(X) -> �ν��Ͻ� ����	-- �⺻������ �ʱ�ȭ(false)
//	static boolean b;	//����ƽ ���� = Ŭ���� ����  (����ƽ ���� ���ٴ� Ŭ���� ������� ���� �� �����մϴ�.)
//	void fct() {
//		boolean local;			//��������(0) -- ������ ��
//		A.b = true;				//19,20�� �� ������ �ȳ���?
//		new A().a = true; 		//class A1���� ������, ���� ��Ű�� �ȿ� class A�� �ֱ� ������ ���������� �۵��մϴ�.
//								//���⼭ A�� DataType�� Ŭ���� A�� �ǹ��մϴ�.
//		local = false;
//		System.out.println(local); //������ ȣ���ؾ�����,
//	}
//}
class A1{
	char ch = 'b';
	void fct() {
		System.out.println(ch);
	}
}
public class DataType02 {

	public static void main(String[] args) {
		new A1().fct();
		//new ������ class ������ () == �ν��Ͻ��� .�� �ٿ��� ����, �޼ҵ带 ȣ���� �� �ֽ��ϴ�.

	}

}
