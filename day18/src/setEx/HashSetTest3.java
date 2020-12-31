package setEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTest3 {

	public static void main(String[] args) {

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();

		setA.add("29");
		setA.add("29");
		setA.add("30");
		setA.add("40");
		setA.add("51");
		setA.add("68");

		setB.add("6");
		setB.add("48");
		setB.add("87");
		setB.add("20");
		setB.add("55");
		setB.add("89");

		//교집합 : 두 집합간에 공통 요소를 모아 놓은 집합	-> 5,6
		//차집합 : A-B B에 없는 것만 추려 놓는 것(공통 요소를 제외하고 A에만 있는 것들) ->1,2,3,4
		//		   B-A A에 없는 것만 추려 놓는 것(공통 요소를 제외하고 B에만 있는 것들) ->7,8,9,0
		//합집합 : A와 B의 요소를 모두 합친 것 ->1,2,3,4,5,6,7,8,9,0

		//		setHap;
		//		setKyo;
		//		setChaA_B;
		//		setChaB_A;
		HashSet setHap = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setChaA_B = new HashSet();
		HashSet setChaB_A = new HashSet();

		//Iterator 등록해서 사용하면 빠릅니다.
		//교집합 : 두 집합 모두 있는 요소만 추가
		Iterator itr = setA.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			if(setB.contains(tmp)) {
				setKyo.add(tmp);
			}
		}//end while
		System.out.println("교집합 : "+setKyo);
		
		//ChaA_B : A에만 있는 요소를 추가합니다.
		itr = setA.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			if(!setB.contains(tmp)) {
				setChaA_B.add(tmp);
			}
		}//end while
		System.out.println("차집합:setChaA_B : "+setChaA_B);
		
		//ChaB_A : B에만 있는 요소를 추가합니다.
		itr = setB.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			if(!setA.contains(tmp)) {
				setChaB_A.add(tmp);
			}
		}//end while
		System.out.println("차집합:setChaB_A : "+setChaB_A);
		//합집합 : A와 B의 요소를 모두 합친 것
		itr = setA.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			setHap.add(tmp);
		}//end while_setA
		itr = setB.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			setHap.add(tmp);
		}//end while_setB
		System.out.println("HashSet으로 출력 : "+setHap);
		
		//ArrayList 이용
		ArrayList arr = new ArrayList();
		itr = setA.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			arr.add(tmp);
		}//end while_setA
		itr = setB.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			arr.add(tmp);
		}//end while_setB
		System.out.println("ArrayList로 출력 (정렬 전): "+arr);
		List tmp = arr;
		Collections.sort(tmp);
		System.out.println("ArrayList로 출력 (정렬 후): "+tmp);
		
	}
}
