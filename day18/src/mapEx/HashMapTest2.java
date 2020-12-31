package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	HashMap<키, 밸류>
		키, 밸류
		put(키,밸류)
		get(키)
		
 */
public class HashMapTest2 {

	public static void main(String[] args) {
		String[] cities = {"서울","강남","대구","전주","부산","울산"};
		
		HashMap<Integer, String> mapCity = new HashMap<>();
		
		for(int i = 0;i<cities.length;i++) {			
			mapCity.put(i, cities[i]);
		}
		System.out.println(mapCity);
		
		//반복문을 이용해봅니다.
		// key만 추출(keySet())해서 저장소(Integer -> Set<Integer>)에 담아둔 다음
		// Iterator 등으로 꺼내온다음
		// get()메서드에 인자로 전달합니다.
		
		Set<Integer> set = mapCity.keySet();
		for (Integer index : set) 
			System.out.println(mapCity.get(index));

		Iterator<Integer> itr = set.iterator();
//		mapCity.keySet().iterator(); 동일
		while(itr.hasNext()) {
			System.out.println(mapCity.get(itr.next()));
			//Integer key = itr.next();
			//int key = itr.next();
//			System.out.println(mapCity.get(key));
		}
		
	}

}
