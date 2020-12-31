package foreachEx;
/*
 	빠른 for문(foreach문) - 컬렉션에서만 사용 가능합니다.
 	for(A : B){		B는 컬렉션(배열, List, Set, Map)... 데이터 모음
 					A는 컬렉션에서 요소 하나씩 가져올 때 저장해야할 임시 변수
 					
 	}
 */
public class ForEachTest {

	public static void main(String[] args) {
		int []ar = {10,20,30};
		for (int a : ar) {
			System.out.println(a);
		}
		String []arName = {"이순신","박문수","홍길동"};
		for (String a : arName) {
			System.out.println(a);
		}
	}

}
