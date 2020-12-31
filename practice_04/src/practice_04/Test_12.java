package practice_04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test_12 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 6, 2, 8, 10);
		list.stream().findAny().ifPresent(System.out::println);
		
		list.stream().findFirst().ifPresent(System.out::println);
		
		list.stream()
			.filter(x -> x > 2)
			.findAny()
			.ifPresent(System.out::println);
		list.parallelStream()
			.filter(x -> x > 2)
			.findAny()
			.ifPresent(System.out::println);
		list.stream()
			.filter(x -> x > 2)
			.findFirst()
			.ifPresent(System.out::println);
		list.parallelStream()
			.filter(x -> x > 2)
			.findFirst()
			.ifPresent(System.out::println);
	}
}
