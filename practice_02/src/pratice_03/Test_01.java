package pratice_03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test_01 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,1,2,3,5);
		System.out.println(list.toString());
		
		System.out.println("HashSet�� �̿��� �ߺ� ����");
		List<Integer> list2 = new ArrayList<>(new HashSet<Integer>(list));
		list2.forEach(System.out::println);
		
		System.out.println("stream�� �̿��� �ߺ� ����");
		list.stream().distinct().forEach(System.out::println);
	}
}
