package setEx;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		Object[] ar = {"1","2","3","4","5", new Integer(6), 7};
		HashSet<Object> set = new HashSet<>();
		for(int i = 0;i<ar.length;i++) {
			set.add(ar[i]);
		}
		System.out.println(set);
		//순차적으로 배열이 출력
		
		//기존에 1~7까지 들어있는데,
		//다시 1,2,3을 추가했습니다.
		set.add("1");
		set.add("2");
		set.add("3");
		//하지만 1,2,3은 중복되기 때문에 추가되지 않습니다.
		System.out.println("1~3까지 추가 후 : "+set);
	}
}
