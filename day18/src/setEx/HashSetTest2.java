package setEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet<String> setA = new HashSet();
		HashSet<String> setB = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		setA.add("6");
		
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		setB.add("9");
		setB.add("0");
		
		System.out.println("setA : "+setA);
		System.out.println("setB : "+setB);
		
		Iterator iter = setA.iterator();
		while(iter.hasNext()){
			Object tmp = iter.next();
			System.out.print(tmp+" ");
			//해당 데이터는 문자열
		}
		System.out.println();
		//setB
		Iterator iter2 = setB.iterator();
		while(iter2.hasNext()){
			Object tmp = iter2.next();
			System.out.print(tmp+" ");
			//해당 데이터는 문자열
		}
		System.out.println();
	}
}
