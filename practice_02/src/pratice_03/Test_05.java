package pratice_03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Test_05 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("dog");
		list1.add("dog");
		list1.add("cat");
		list1.add("cat");
		
		Set<Integer> list2 = new HashSet<Integer>();
		list2.add(3);
		list2.add(4);
		list2.add(4);
		list2.add(5);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(7);
		
		Stream<String> arrStm1 = list1.stream();
		Stream<Integer> arrStm2 = list2.stream();
		
		System.out.println("��Ʈ���� �̿��� ���");
		arrStm1.forEach(System.out::println);
		System.out.println();
		arrStm2.forEach(System.out::println);
		System.out.println();
		System.out.println("�÷��ǿ��� ��Ʈ���� �̿��� ���");
		list1.stream().forEach(System.out::println);
		System.out.println();
		list2.stream().forEach(System.out::println);
	}
}
