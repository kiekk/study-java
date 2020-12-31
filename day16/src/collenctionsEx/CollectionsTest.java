package collenctionsEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*
 	Collections : 클래스	(Collection 은 인터페이스)
 	- 컬렉션을 사용할 수 있는 메서드들을 가지고 있는 클래스입니다.
 */
public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);
		//1뒤에 0을 넣고 싶다
		//list.add(0) -> 0이 제일 마지막에 추가됩니다.
		list.add(list.indexOf(1)+1,0);		//+1은 그 다음 번째를 의미합니다.
		System.out.println(list);
		
		//이번에는 1이 마지막방
		//그래서, 그냥 1을 찾으면 1의 자리에 0이 들어가고,
		//1이 뒤로 밀리게 됩니다.
		//그래서 indexOf(1)+1  그 다음 요소를 알려준 뒤에 삽입했습니다.
		
		//Collections : 스태틱 메서드들을 가지고 있습니다.
		System.out.println(Collections.max(list));
		ArrayList<Integer> cpyList = list;
		Collections.sort(cpyList);		//오름차순으로 list자체가 변경
		System.out.println("원본 : "+list);
		System.out.println("오름차순 정렬 : "+cpyList);
		
		Collections.shuffle(cpyList);
		System.out.println("cpyList 셔플 : "+cpyList);
		
		//sort : 오름차순
		//cpyList를 내림차순으로 변경하고 싶다
		//reverse()
		//내림차순 메서드는 없기 때문에, 먼저 오름차순 정렬한 후 reverse해줍니다.
		Collections.sort(cpyList);
		Collections.reverse(cpyList);
		System.out.println("내림차순 정렬 : "+cpyList);
		
		
	}

}
