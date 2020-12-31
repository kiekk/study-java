package mapEx;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
	HashMap<Ű, ���>
		Ű, ���
		put(Ű,���)
		get(Ű)

	entrySet() - Ű, ����� ���ÿ� �����ɴϴ�. Set���·� ����

 */
public class HashMapTest4 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("�ڹ���",100);
		map.put("�̼���",90);
		map.put("ȫ�浿",30);
		map.put("������",70);
		map.put("�Ӳ���",20);
		map.put("������",90);

		//		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();

		//��ü ��� ���
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> tmp = itr.next();
			System.out.println(tmp.getKey() +"\t"+tmp.getValue());
		}


		Collection<Integer> score = map.values();
		Iterator<Integer> iter = score.iterator();
		int sum = 0;
		String avg = "";
		//1. ��� ���� ���
		System.out.println("��ü ���� ���");
//		for(Integer sc : score) {
//			System.out.println(sc+"��");
//			sum += sc;
//		}
		while(iter.hasNext()) {
			Integer tmp = iter.next().intValue();
			System.out.println(tmp);
			sum += tmp;
		}
		//2. ����/���(.1)���
		System.out.println("���� : "+sum+"��");
		avg = String.format("%.1f��", (double)sum / score.size());
		System.out.println("��� : "+ avg);
		//3. �ְ���
		System.out.println(Collections.max(score));
		//4. ������ ���
		System.out.println(Collections.min(score));
	}

}
