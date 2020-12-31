package classEx2;
/*
	������ (contsructor)
	1. �޼��� 
	2. ��ü�� ���� �� �ν��Ͻ��� �ʿ��մϴ�.
		�� ��, �ν��Ͻ��� �־��ִ� �� == �ʱⰪ
		*setter�� �־��ִ� �� == ���԰�
		
		int num = 0; <--�ʱⰪ
		num = 20	 <--���԰�
		
		obj = new Type(); <-- obj��ü (default ������)�ʱ�ȭ
		Type2 obj = new Type(10, 5.5,"�ȳ�");	obj��ü �ʱ�ȭ
	3. ������ ����� ��
		1)�����ڴ� �⺻ �޼��������� ����Ÿ���� ���� �ʽ��ϴ�.(�����մϴ�.)
			void �޼���(){}���� void�� ������ �մϴ�.
				 �޼����(){} �̷��� ����մϴ�.
		2)�޼������ �ݵ�� Ŭ������ �̸��� �״�� ��� �մϴ�.
			Type2(){}	������ �Ϸ�	<-- default constructor, �⺻ ������, ����Ʈ ������
			
	4. ������ Ư¡
		�ν��Ͻ��� ���� ��, ������ �ҷ��� �մϴ�.
		�⺻ �����ڴ� �����Ϸ��� �ڵ����� ������ ����� �ݴϴ�.
		��, �ٸ� �����ڰ� ���� ���� �ڵ����� ����� �ݴϴ�.
		
		�޼��� �̸��� �Ȱ��� �� �� �ֽ��ϴ�. ��, �Ű������� Ÿ�԰� ������ �޶�� �մϴ�.
		�̷��� �Ȱ��� �޼��� �̸����� �����ؼ� ����ϸ�, �޼��带 ����Ҷ� ���մϴ�.
		
		�����ε� - overloading
 */
class Type2{
	private int num;
	private double d;
	//Type2 Ŭ������ �����ڸ� ����� ���ϴ�.
	//�Ű������� �ٸ��� �Ͽ� �����ڸ� ������ ���� �� �ֽ��ϴ�.
	//�������� ���������ڴ� public�� �⺻, ��Ȳ�� ���󼭴� private�� ���� ���� �ֽ��ϴ�.(�̱��� ����)
	public Type2(){	//������
		System.out.println();
	}//constructor Type2
	public Type2(int num) {
		super();
		this.num = num;
	}
	public Type2(double d) {
		super();
		this.d = d;
	}
	public Type2(int num, double d) {
//		super(); 			<--������,  == ���� �θ� Ŭ������ �����ڷ� ����.
		this.num = num;
		this.d = d;
	}
	public Type2(double num, double d) {
		this.num = (int)num;
		this.d = d;
	}
}//end class Type
/*
 	setter : ����
 	������ : �ʱ�ȭ
 		�⺻������ : defa ult������ �ʱ�ȭ 
 		�μ��ִ� ������
 		�����ڴ� ��κ� public������,private ���������ڷ� �����ڸ� ����⵵ �մϴ�.(�̱��� ���� - �ν��Ͻ��� �Ѱ��� ������ �� ��)
 	�����ε�
 		�޼��带 �����̸����� ������ �ߺ���ų �� �ִµ�, �Ű������� Ÿ�԰� ������ �޶�� ������ �� �ֽ��ϴ�.
 		(����ڰ� ���ϰ� ����ϱ� ���ؼ� �����ε� ����� ����մϴ�.)
 	
 */
public class ClassTest05 {

	public static void main(String[] args) {
		Type2 obj = new Type2();
		Type2 obj1 = new Type2(10);
		Type2 obj2 = new Type2(1.2);
		Type2 obj3 = new Type2(10,1.2);
		Type2 obj4 = new Type2(10.5,1);
	}//end main
}//end class
class Animal{
	Animal(){
	
	}//constructor Animal
}//end class Animal
class Car{
	Car(){

	}//constructor Car
}//end class Car
class Train{
	Train(){
		
	}//constructor Train
}//end class Train