package extendsEx;
/*
	惑加
	促屈己苞 悼利 搬钦(官牢爹)
	
 */


class Animal{
	public void sound() {
		System.out.println("悼拱 匡澜");
	}
//	public void sound(int count) {
//		System.out.println("瘤沥茄 冉荐父怒 匡澜");
//	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("港港");
	}
	public void sound(int count) {
		for(int i = 0;i<count;i++) {			
			System.out.println("港港");
		}
	}
}
//class Cat extends Animal{
//	public void sound() {
//		System.out.println("具克");
//	}
//}
public class ExtendsTest03 {
	public static void main(String[] args) {

		Animal some = new Animal();
		some.sound();
		some = new Dog();
		((Dog)some).sound(5);		//港港
		Dog some2 = new Dog();
		some2.sound(5);
//		some = new Cat();
//		some.sound();		//具克
	}//end main
}//end class ExtendsTest01