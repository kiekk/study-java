package enumEx;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/*
 	Iterator 인터페이스 : 반복자 (신버전)
 	ArrayList는 Enumaration 지원을 못 받습니다.
 	Vector는 Enumaration, Iterator 모두 지원 받습니다.
 	
 	컬렉션에 접근해서 요소를 찾아갈 때 사용합니다.
 	
 	(컬렉션을 Iterator에 등록하기)	  : iterator()(복수)
 	(컬렉션에서 더 읽어올 요소가 있나요?) : hasNext()(복수) -> true,false 값을 반환합니다.
 	(그럼 그 다음 요소를 읽어와라)		  : next()(단수)
 */
public class IterTest {

	public static void main(String[] args) {
		String[] arStr = {"안녕","홍길동","이순신","박문수"};
		
		Vector<String> vec = new Vector<String>();
		
		for (int i = 0; i < arStr.length; i++) {
			vec.add(arStr[i]);
		}
		System.out.println(vec);
		
		//Iterator로 접근해서 출력해 봅니다.
		//객체 = vec.iterator();
		Iterator<String> itr = vec.iterator();
		//객체.요소가 있니?
		while(itr.hasNext()) {
			//객체에서 꺼내와서 출력문에 넣어
			System.out.println(itr.next());
			//Object obj = iter.next();	Object 타입 변수에 저장하고 출력할 수도 있습니다.
			//next() 메서드는 컬렉션에서 다음 요소로 커서를 옮기는 기능을 합니다.
			//next()를 사용할 때마다 요소의 위치가 변경되기 때문에, 한 번에 한 칸씩 이동되도록 조건식을 작성해야 오류가 발생하지 않습니다.
		}
		//next()를 통해 끝까지 갔으면, 더이상 요소를 가리킬 수 없습니다.
		//그래서 반복자를 사용하고 싶다면, 다시 등록(초기화)시켜야 합니다.
		itr = vec.iterator();			//재등록이 없다면 NoSuch..예외가 발생합니다.
		System.out.println(itr.next());
		
	}

}
