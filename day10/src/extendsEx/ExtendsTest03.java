package extendsEx;
/*
	���
	�������� ���� ����(���ε�)
	
 */


class Animal{
	public void sound() {
		System.out.println("���� ����");
	}
//	public void sound(int count) {
//		System.out.println("������ Ƚ����ŭ ����");
//	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("�۸�");
	}
	public void sound(int count) {
		for(int i = 0;i<count;i++) {			
			System.out.println("�۸�");
		}
	}
}
//class Cat extends Animal{
//	public void sound() {
//		System.out.println("�߿�");
//	}
//}
public class ExtendsTest03 {
	public static void main(String[] args) {

		Animal some = new Animal();
		some.sound();
		some = new Dog();
		((Dog)some).sound(5);		//�۸�
		Dog some2 = new Dog();
		some2.sound(5);
//		some = new Cat();
//		some.sound();		//�߿�
	}//end main
}//end class ExtendsTest01