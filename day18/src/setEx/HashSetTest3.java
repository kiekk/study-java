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

		//������ : �� ���հ��� ���� ��Ҹ� ��� ���� ����	-> 5,6
		//������ : A-B B�� ���� �͸� �߷� ���� ��(���� ��Ҹ� �����ϰ� A���� �ִ� �͵�) ->1,2,3,4
		//		   B-A A�� ���� �͸� �߷� ���� ��(���� ��Ҹ� �����ϰ� B���� �ִ� �͵�) ->7,8,9,0
		//������ : A�� B�� ��Ҹ� ��� ��ģ �� ->1,2,3,4,5,6,7,8,9,0

		//		setHap;
		//		setKyo;
		//		setChaA_B;
		//		setChaB_A;
		HashSet setHap = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setChaA_B = new HashSet();
		HashSet setChaB_A = new HashSet();

		//Iterator ����ؼ� ����ϸ� �����ϴ�.
		//������ : �� ���� ��� �ִ� ��Ҹ� �߰�
		Iterator itr = setA.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			if(setB.contains(tmp)) {
				setKyo.add(tmp);
			}
		}//end while
		System.out.println("������ : "+setKyo);
		
		//ChaA_B : A���� �ִ� ��Ҹ� �߰��մϴ�.
		itr = setA.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			if(!setB.contains(tmp)) {
				setChaA_B.add(tmp);
			}
		}//end while
		System.out.println("������:setChaA_B : "+setChaA_B);
		
		//ChaB_A : B���� �ִ� ��Ҹ� �߰��մϴ�.
		itr = setB.iterator();
		while(itr.hasNext()) {
			Object tmp = itr.next();
			if(!setA.contains(tmp)) {
				setChaB_A.add(tmp);
			}
		}//end while
		System.out.println("������:setChaB_A : "+setChaB_A);
		//������ : A�� B�� ��Ҹ� ��� ��ģ ��
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
		System.out.println("HashSet���� ��� : "+setHap);
		
		//ArrayList �̿�
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
		System.out.println("ArrayList�� ��� (���� ��): "+arr);
		List tmp = arr;
		Collections.sort(tmp);
		System.out.println("ArrayList�� ��� (���� ��): "+tmp);
		
	}
}
