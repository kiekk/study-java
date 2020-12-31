package listEx;

import java.util.ArrayList;
import java.util.List;

/*	
 	ArrayList
 		- Vector의 메서드들을 거의 승계해서 사용합니다.
 		- capacity와 size가 동일하기 때문에, capacity()와 trimToSize()가 없습니다.

 	List계열의 특징 
 	1. 같은 요소가 이미 들어 있어도 중복해서 계속 데이터를 입력할 수 있습니다.
 	2. 항상 순서가 존재합니다(index)

 	set계열의 특징 -- List와 반대  
 	1. 같은 요소가 있으면 입력 할 수 없습니다.
 	2. 순서가 없습니다.
 */
public class ListTest02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		int sum = 0;
		//요소 출력하기  - 1
		System.out.println("요소 출력하기 - 1");
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
			sum += (int)list.get(i);		//list.get(i)가 Object이기 때문에 Integet로 형변환 해줘야 하지만 
			//sum += (Integer)list.get(i);	//autoUnboxing으로 인해서 int형으로 형변환 해도 정상적으로 작동합니다.
		}
		System.out.println("요소 출력하기 - 1의 sum :"+sum);
		sum = 0;
		//요소 출력하기 - 2
		System.out.println("요소 출력하기 - 2");
		for (Object tmp : list) {
			System.out.println(tmp);
			sum += (int)tmp;				//list.get(i)가 Object이기 때문에 Integet로 형변환 해줘야 하지만 
			//sum += (Integer)tmp;			//autoUnboxing으로 인해서 int형으로 형변환 해도 정상적으로 작동합니다.
		}
		System.out.println("요소 출력하기 - 2의 sum :"+sum);

		//30점을 찾아서 300점으로 변경해 봅니다.
		//1번 방법
//		for(int i = 0;i<list.size();i++) {
//			if(list.contains(30)) {
//				if(list.get(i) == (Object)30) {
//					list.set(i, 300);
//				}
//			}//end if
//		}//end for
		//출력하기
//		System.out.println(list);
		//2번 방법
//		if(list.contains(30)) {
//			list.set(list.indexOf(30), 300);
//		}else {
//			System.out.println("찾는 요소가 없습니다.");
//		}
//		System.out.println(list);
		
		//10점과 20점 사이에 15점을 삽입해봅니다.
		//오버로딩된 add메서드 사용해보기
		list.add(1, 15);
		System.out.println(list);
		//40점과 50점만 추출해서 출력해봅니다.
		//subList메서드 사용해보기
//		System.out.println(list.subList(4, 6));  //index 값을 직접 입력하는 것보다 자동으로 계산되도록 메서드를 이용하도록 합니다.
//		System.out.println(list.subList(list.indexOf(40), list.indexOf(50)+1));
		List list2 = list.subList(list.indexOf(40), list.indexOf(50)+1);
		//list.subList(list.indexOf(40), list.indexOf(50)+1)는 list로 반환하기 때문에 타입을 List로 형변환 해줘야 합니다.
		//만약 ArrayList로 형변환 하게 될경우 ClassCastException 예외가 발생합니다.
		//Exception in thread "main" java.lang.ClassCastException: java.util.ArrayList$SubList cannot be cast to java.util.ArrayList
		ArrayList list3 = new ArrayList(list.subList(list.indexOf(40), list.indexOf(50)+1));
		//ArrayList로 사용하고 싶다면, 형변환을 하는 것이 아니라 ArrayList생성자를 이용합니다.
		System.out.println(list2);
		System.out.println(list3);
		
		//50점을 삭제해봅니다.
		//remove는 반드시 그 요소가 존재하는 경우에만 사용해야 하기 때문에
		//조건식을 이용해 먼저 해당 요소가 있는지 확인해야 합니다.
		int num = 50;
		if(list.contains(num)) {
			int idx = list.indexOf(num);
			list.remove(idx);			
			System.out.println(list);
		}else {
			System.out.println("삭제하려는 요소가 존재하지 않습니다.");
		}
	}

} 
