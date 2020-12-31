package setEx;

import java.util.HashSet;

public class HashSetTest4 {

	public static void main(String[] args) {
		//총 6개의 요소가 있습니다.
		String[] str = {"C언어","자바","XML","C언어","HTML","자바"};
		
		//이중, C언어,자바가 겹치는 요소입니다.
		HashSet hs1 = new HashSet<>();
		HashSet hs2 = new HashSet<>();
		
		//hs1 에는 중복배제된 모든 요소를 넣습니다.
		//hs2 에는 중복된 요소만 모아 놓습니다.
		for (String tmp : str) {
			if(!hs1.add(tmp)) {		//hs1.add(tmp)가 이미 실행되고 난 뒤 결과값을 true,false로 반환하기 때문에
									//hs1.add(tmp)가 true이면 hs1.add(tmp)를 진행
				hs2.add(tmp);		//hs1.add(tmp) 가 false인 경우에 hs2.add(tmp)를 진행
			}
		}
		System.out.println("중복 배제된 모든 요소 hs1 : "+hs1);
		System.out.println("중복된 모든 요소 hs2 : "+hs2);
		//removeAll 메서드 - 겹치는 요소를 지움
		hs1.removeAll(hs2);
		System.out.println("hs2랑 겹치는 요소를 hs1에서 지움 : "+hs1);
		System.out.println("set에 있는 요소가 비어있습니까? : "+hs1.isEmpty());
		hs1.clear();
		System.out.println("set에 있는 요소가 비어 있습니까? : "+hs1.isEmpty());
		
	}
}
