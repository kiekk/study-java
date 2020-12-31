package wrapperEx;

public class WrapperTest02 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2?"같다":"다르다");				//인스턴스의 주소값을 비교하기 때문에 "다르다"가 출력됩니다.
		//wrapper 클래스에는 equals메서드가 재정의 되어 있습니다.
		System.out.println(i1.equals(i2) ? "같다":"다르다");	//equals메서드를 통해서 값을 비교합니다.
		
	}

}
