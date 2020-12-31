package wrapperEx;

public class WrapperTest03 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		//wrapper 객체에서 기본자료형의 값을 추출해봅니다.
		int var1 = i1.intValue();
		int var2 = i2.intValue();
		System.out.println(var1);
		System.out.println(var2);
		
		//intValue메서드를 통해 기본자료형의 값을 추출했기 때문에 var1, var2는 변수입니다,
		//따라서 var1, var2는 객체가 아니기 때문에 equals메서드로 비교가 불가능합니다.
		System.out.println(var1==var2?"같다":"다르다");
		
	}

}
