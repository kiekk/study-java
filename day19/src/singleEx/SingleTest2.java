package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	싱글턴 패턴
 	인스턴스를 하나만 만들어서 사용해야 할 때 적용하는 ★
 	"인스턴스 생성방법"
 	- 생성자는 외부에 노출시키면 안됩니다.
 	 	Type type = new Type();	에러
 	 	-private 접근 지정자로 생성자를 만들어야 합니다.
 	- 동일타입의 인스턴스 객체를 static으로 만들어야 합니다.
 	- 내부 메서드를 static public으로 노출시켜야 합니다.
 	- 내부 메서드는(클래스 메서드, 스태틱 메서드)에서
 			객체의 인스턴스 여부를 판단 한 후
 			인스턴스가 있으면 기존 인스턴스를 리턴시키고,
 			인스턴스가 없으면(null) 생성자를 통해
 			생성한 인스턴스를 리턴시켜 주면 됩니다.
 */
public class SingleTest2 {

	public static void main(String[] args) {
		//new Toolkit();   //인스턴스를 생성하지 못하도록 생성자를 막아놓습니다.
						   //abstract 또는 생성자를 private등으로 막아놓습니다.
						   //대신, 특정 메서드 하나를 만들어서
						   //인스턴스를 생성할 수 있도록 합니다.
		Toolkit tool = Toolkit.getDefaultToolkit();
		//getDefaultToolkit() 메서드르 통해, 인스턴스를 만들어 냈고,
		//tool 객체를 통해, Toolkit 클래스의 메서드를 사용할 수 있게 됐습니다.
		Calendar cal = Calendar.getInstance();

	}

}
