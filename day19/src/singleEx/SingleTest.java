package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	싱글턴 패턴
 	1. 생성자는 private
 	2. static 필드 객체를 만듭니다.
 	3. 내부 메서드 하나를 static public 으로 만듭니다.
 */
class Singleton {
	private static Singleton single;	//이 변수를 통해 getInstance 메서드에서 객체 유무를 판단하게 됩니다.
	private Singleton() {};
	public static Singleton getInstance() {
		//single에 있는 값이 null 이라면, 한번도 인스턴스를 생성한 적이 없습니다.
		//그래서 생성자를 통해 인스턴스를 대입시켜 줍니다.
		//그런데 그 이후에 다시 getInstance()를 호출하게 되면, 
		//더이상 single은 널이 아니게 될 것입니다(처음 만들어 놨기 때문)
		//그래서 처음 만들어 놓은 single을 그대로 return시킵니다.
		if(single == null) {
			return single = new Singleton();
		}
		return single;
	}
}
public class SingleTest {

	public static void main(String[] args) {
//		new Singleton();	//에러
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		//한번 객체가 생성되었기 때문에 새로 인스턴스를 생성하더라도,
		//인스턴스는 무조건 하나만 존재해야 하기 때문에
		//처음 만들었던 인스턴스를 return받게 됩니다.
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
	}

}
