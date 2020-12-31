package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	HashMap<Ű, ���>
		Ű, ���
		put(Ű,���)
		get(Ű)
		
 */
public class HashMapTest2 {

	public static void main(String[] args) {
		String[] cities = {"����","����","�뱸","����","�λ�","���"};
		
		HashMap<Integer, String> mapCity = new HashMap<>();
		
		for(int i = 0;i<cities.length;i++) {			
			mapCity.put(i, cities[i]);
		}
		System.out.println(mapCity);
		
		//�ݺ����� �̿��غ��ϴ�.
		// key�� ����(keySet())�ؼ� �����(Integer -> Set<Integer>)�� ��Ƶ� ����
		// Iterator ������ �����´���
		// get()�޼��忡 ���ڷ� �����մϴ�.
		
		Set<Integer> set = mapCity.keySet();
		for (Integer index : set) 
			System.out.println(mapCity.get(index));

		Iterator<Integer> itr = set.iterator();
//		mapCity.keySet().iterator(); ����
		while(itr.hasNext()) {
			System.out.println(mapCity.get(itr.next()));
			//Integer key = itr.next();
			//int key = itr.next();
//			System.out.println(mapCity.get(key));
		}
		
	}

}
