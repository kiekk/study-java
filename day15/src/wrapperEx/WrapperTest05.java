package wrapperEx;

public class WrapperTest05 {

	public static void main(String[] args) {
		//jdk 버전 1.5 이상부터만 가능한 기능입니다.
		
		//wrapper는 기본형 변수에 직접 대입가능합니다.
		//기본형도 wrapper 에 직접 대입가능합니다.(생성자 등이 필요하지 않습니다.)
		
		int var = new Integer(100);				//인스턴스를 기본형 변수에 직접 대입하고 있습니다. 현재 wrapper만 가능합니다.
		int var2 = new Integer(100).intValue();	//intValue()메서드가 생략되어 있습니다.
		
		//이와 같은 기능을 "자동 포장", "auto boxing"이라고 합니다.
		Integer obj = 100;			//기본형을 객체에 직접 대입 하는 것도 가능합니다.
									//인스턴스 과정이 생략되었음에도 대입이 되고 있습니다.
		//기본형과 인스턴스간의 연산도 가능합니다.
		System.out.println("기본형 + 객체 : "+(var + obj));
							//obj.intValue() -> "unboxing"이라고 합니다.
							//자동으로 값을 추출해주는 기능
		
	}

}
