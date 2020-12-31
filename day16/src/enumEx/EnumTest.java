package enumEx;

import java.util.Enumeration;
import java.util.Vector;

/*
 	Enumeration 인터페이스 : 열거자 (구버전)
 	
 	컬렉션에 접근해서 요소를 찾아갈 때 사용합니다.
 	
 	(컬렉션을 Enumeration에 등록하기)	  : elements()(복수)
 	(컬렉션에서 더 읽어올 요소가 있나요?) : hasMoreElements()(복수) -> true,false 값을 반환합니다.
 	(그럼 그 다음 요소를 읽어와라)		  : nextElement()(단수)
 	enhanced for문의 대체품이라고 봐도 무방
 */
public class EnumTest {

	public static void main(String[] args) {
		String[] arStr = {"안녕","홍길동","이순신","박문수"};
		
		Vector<String> vec = new Vector<String>();
		
		//배열 String == vec<String>의 저장소 타입이 동일하게 됐다
		//동일한 타입으로 맞춰놨기 때문에 raw Type 경고 표시가 뜨지 않습니다.
		
		//vec에다가 add(배열의 요소) 시킬 수 있게 됐습니다.
		for (int i = 0; i < arStr.length; i++) {
			vec.add(arStr[i]);
		}
		System.out.println(vec);
		
		//vec 요소를 Enumeration(열거자)을 이용해서 출력해 봅니다.
		//1. vec을 등록합니다.
		//2. vec의 요소가 있는지 검사합니다.
		//3. vec의 요소를 꺼내옵니다.
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
		}
//		System.out.println(en.nextElement());
//		요소가 더이상 존재하지 않는데도 출력하려고 한다면 NoSuchElementException 예외가 발생합니다.
//		Exception in thread "main" java.util.NoSuchElementException: Vector Enumeration
//		at java.util.Vector$1.nextElement(Vector.java:355)
//		at enumEx.EnumTest.main(EnumTest.java:42)
	}

}
