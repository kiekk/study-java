package day01;
/*
 	�ڹ��� �⺻�ڷ���
 	- ���� : �����
 	- ���� ���� : Ÿ�� ������
 	- (c���) 	 : char short int long float double
 	- (java���) : ��boolean char byte short int long float double
 	
 	float(4byte) double(8byte)
 	
 	���� �ڷ���
 		�迭, Ŭ����
 	String(�⺻ �ڷ���ó�� ���� ���̴� ���� �ڷ���)
*/
public class DataType07 {

	public static void main(String[] args) {
		float _f = 1.4f;
		float _f2 = (float)1.4;
		System.out.println(_f);
		System.out.println(_f2);
		
		String msg = "abcd";
		System.out.println(msg);
		String msg2 = "defg";
		//�� ���ڿ� ���ϱ�
		System.out.println(msg+msg2);
		//�� ���� �ڷ����ε� �⺻��ó�� ���ϱ�? �� String msg3 = new String();ó�� �Ⱦ���?��
		
		String msg3 = new String("��Ʈ���Դϴ�");
		
		Imsi p = new Imsi();  //�����ڷ���, ��������(��ü object) p�� ����.
							  //new Imsi();  <--'�ν��Ͻ�'
		//�ν��Ͻ��� ���� ��ü�� ������ ����.
		
		��� �鼺�� = new ���();
		��� ����ȣ = new ���();
		new ���();	//���� �̸��� �����ϴ�. �̸�(��ü)
		
		�鼺��.��Ա�();
		
	}//end main
}//end class
class Imsi{}
class ���{
	void ��Ա�() {
		
	}
}
