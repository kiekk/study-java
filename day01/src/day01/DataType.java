package day01;
/*
 	�ڹ��� �⺻�ڷ���
 	- ���� : �����
 	- ���� ���� : Ÿ�� ������
 	- (c���) 	 : char short int long float double
 	- (java���) : ��boolean char byte short int long float double
 	
 	- boolean : boolean isPass;		is- true(1),false(0)
 	  boolean Ÿ���� �⺻���� false�Դϴ�. (�������� -> �ν��Ͻ� ����)
 	  ��� �Լ��� ������ Ŭ�������� ���ο� �����ؾ� �մϴ�.
 
 */
class A{				//�ν��Ͻ� = �޸𸮿� ������ ����, 
	boolean a;			//��������(X) -> �ν��Ͻ� ����	-- �⺻������ �ʱ�ȭ(false)
	static boolean b;	//����ƽ ���� = Ŭ���� ����  (����ƽ ���� ���ٴ� Ŭ���� ������� ���� �� �����մϴ�.)
	void fct() {
		boolean local;		//��������(0) -- ������ ��
		A.b = true;
		new A().a = true; 	//�ν��Ͻ� ������ Ŭ������ �ν��Ͻ��� ���� �Ŀ� ����� �� �ֽ��ϴ�.
		//newŰ���带 ����� �ν��Ͻ� ������ ����� �� �ֽ��ϴ�.//Ŭ���� é�Ϳ��� �ٽ� ����
		
		local = false;
		System.out.println(local); //������ ȣ���ؾ�����,
	}
}
public class DataType {

	public static void main(String[] args) {
		

	}

}
