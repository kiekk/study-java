package listEx;

import java.util.Vector;

/*
 	ArrayList Vector LinkedList Stack 등의 클래스가 존재...=>List 인터페이스 소속
 	
 		List 인터페이스 => Collection 인터페이스 소속입니다.
 	List 인터페이스의 특징
 		-반드시 순서가 지정되어 있습니다.(배열의 인덱스 번호를 가지고 있습니다.)
 		-일괄적인 정렬형태 (sequence)
 		-배열은 고정, 요소가 변하지 않습니다.
 		-하지만 List는 요소의 개수를 변경시킬 수 있습니다.
 		
 	Vector 		ArrayList
 	(구버전)	(신버전)
 	
 	공통으로 사용하는 메서드
 	요소의 타입이 달라도 대입이 가능합니다. 따라서 파라미터의 타입은 Object여야 합니다.
 		add(요소) 					: 요소를 추가합니다. 
 		equals(요소) 				: 비교하고자 하는 요소의 동일 여부를 확인합니다.
 		get(정수) 					: 해당 정수의 위치(index)에 해당하는 요소를 가져옵니다.(배열과 순서가 같습니다.0번 부터 시작)
 		indexOf(요소) 				: 해당 요소의 위치(index)를 반환합니다.
 		size() 						: 배열의 length와 동일합니다. 요소의 개수를 반환합니다.
 		capacity() 					: 배열의 용량,크기를 반환합니다.	-> Vector 클래스에만 존재합니다.(ArrayList에는 없습니다.)
 		remove(정수) 				: 해당 정수의 위치(index)에 해당하는 요소를 삭제합니다.
 		remove(요소) 				: 해당 요소를 찾아서 삭제합니다.
 		set(정수,요소)  			: 해당 정수의 위치(index)에 요소를 삽입합니다.
 		isEmpty()					: 해당 요소가 비었는지의 여부를 반환합니다.
 		trimToSize()				: capacity의 빈 데이터를 삭제합니다. size와 동일하게 조절합니다.
 		subList(int from,int to)	: from부터 to-1까지 저장된 객체를 반환합니다. 
 									이때 반환 타입은 List타입으로 반환합니다.
 								이유 -> Vector, ArrayList 모두 List인터페이스에 속해있기 때문에 List 타입으로 
 										Vector, ArrayList 모두 대입 받을 수 있습니다.
 		toArray()					: 지정된 컬렉션을 배열로 반환합니다. Object 배열로 반환합니다.
 		removeAllElements()			: clear()메서드와 동일합니다. 모든 요소를 삭제합니다. 		
 										
 */
public class ListTest01 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		System.out.println("총 용량 : "+vec.capacity());		//용량은 10으로 초기화됩니다.		
		vec = new Vector(5);									//용량을  5로 초기화합니다.
		System.out.println("총 용량 : "+vec.capacity());		
		//요소 추가
		vec.add(10);
		vec.add("안녕");
		vec.add(1.1);
		vec.add(true);
		vec.add('A');
		System.out.println("총 용량 : "+vec.capacity());	
		vec.add(20);											//총용량 5 중, 5번째 데이터를 넣었습니다.
		System.out.println("총 용량 : "+vec.capacity());		//용량이 초과할 경우 자동으로 ★초기값만큼★ 추가합니다.
		vec.trimToSize();										//빈 데이터를 삭제하여 용량을 size와 동일하게 맞춰줍니다.
																//이때 vec용량의 초기값은 trimToSize의 값으로 초기화됩니다.
		System.out.println("총 용량 : "+vec.capacity());		//용량이 초과할 경우 자동으로 ★초기값만큼★ 추가합니다.
		vec.add(30);
		System.out.println("총 용량 : "+vec.capacity());		//용량이 초과할 경우 자동으로 ★초기값만큼★ 추가합니다.
		//요소의 개수
		System.out.println("총 개수 : "+vec.size());
		System.out.println(vec.contains(1.1));
		System.out.println(vec.contains("안녕"));
		
		System.out.println(vec);
		//요소 출력하기 - 1
		System.out.println("요소 출력하기 - 1");
		for(int i = 0;i<vec.size();i++) {
			System.out.println((i+1)+"번 "+vec.get(i));
		}
		//요소 출력하기 - 2
		System.out.println("요소 출력하기 - 2");
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
		//요소 초기화
		vec.clear();
		System.out.println("vec.clear()후 요소 출력하기 - 3");
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
	}

}
