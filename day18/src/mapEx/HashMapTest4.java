package mapEx;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
	HashMap<키, 밸류>
		키, 밸류
		put(키,밸류)
		get(키)

	entrySet() - 키, 밸류를 동시에 가져옵니다. Set형태로 리턴

 */
public class HashMapTest4 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("박문수",100);
		map.put("이순신",90);
		map.put("홍길동",30);
		map.put("유관순",70);
		map.put("임꺽정",20);
		map.put("김정수",90);

		//		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();

		//전체 요소 출력
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> tmp = itr.next();
			System.out.println(tmp.getKey() +"\t"+tmp.getValue());
		}


		Collection<Integer> score = map.values();
		Iterator<Integer> iter = score.iterator();
		int sum = 0;
		String avg = "";
		//1. 모든 점수 출력
		System.out.println("전체 점수 출력");
//		for(Integer sc : score) {
//			System.out.println(sc+"점");
//			sum += sc;
//		}
		while(iter.hasNext()) {
			Integer tmp = iter.next().intValue();
			System.out.println(tmp);
			sum += tmp;
		}
		//2. 총점/평균(.1)출력
		System.out.println("총점 : "+sum+"점");
		avg = String.format("%.1f점", (double)sum / score.size());
		System.out.println("평균 : "+ avg);
		//3. 최고점
		System.out.println(Collections.max(score));
		//4. 최저점 출력
		System.out.println(Collections.min(score));
	}

}
