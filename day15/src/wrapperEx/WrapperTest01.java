package wrapperEx;

public class WrapperTest01 {

	public static void main(String[] args) {
		//100, 'A', true	기본 자료형의 리터럴 상수들
		//기본 자료형을 객체화 시킬 때 사용하는 클래스들을 wrapper클래스라고 합니다.
		
		Boolean b = new Boolean(true);
		Boolean b2 = new Boolean("true");		//문자열 true도 가능합니다.
		System.out.println(b);					//toString()이 생략되어 있습니다.
		System.out.println(b2);
		System.out.println(b.toString());		//toString()이 오버라이딩 되어있습니다.
		System.out.println(b2.toString());
		
		Byte byte1 = new Byte((byte) 10);
		Byte byte2 = new Byte("10");
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte1.toString());
		System.out.println(byte2.toString());
		
		Float f1 = new Float(10.1F);
		Float f2 = new Float(10.1);		//int형과 달리 접두사F를 붙이지 않아도 자동형변환이 되게 끔 생성자가 오버로딩되어있습니다.
		Float f3 = new Float("10.1");
		System.out.println(f1);
		System.out.println(f2);
		
		//기본형들을 객체로 변환시키는 것을 "wrapping", "boxing"이라고 합니다.
	}

}
