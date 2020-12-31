package wrapperEx;

public class WrapperTest04 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		//문자열 "100"이 있는데, 객체 i3에 담고자 합니다.
		
		Integer i3 = new Integer("100");
		int var = Integer.parseInt("100");
		Integer i4 = Integer.valueOf(100);
		i4 = Integer.valueOf("111");			//valueOf메서드가 오버로딩되어있어 문자열도 처리 가능
		var = Integer.valueOf("111").intValue();
		
		
		//진법과 관련된 내용
		//두 인자 중
		//앞에 있는 인자를 뒤에 있는 인자가 설명하고 있습니다.
		//앞에 있는 인자가 어떤 진법인지를 파악하고 십진수로 변환합니다.
		int var3 = Integer.parseInt("100", 2);	//100은 2진수-> 10진수로 변환
		System.out.println(var3);				// 0B10100 -> 접두사 0B
		var3 = Integer.parseInt("100", 8);		//100은 8진수-> 10진수로 변환
		System.out.println(var3);				// 012345  -> 접두사 0
		var3 = Integer.parseInt("100", 16);		//100은 16진수-> 10진수로 변환
		System.out.println(var3);				//0x3456   -> 접두사 0x
		var3 = Integer.parseInt("FF", 16);		//100은 16진수-> 10진수로 변환
		System.out.println(var3);
		
	}

}
