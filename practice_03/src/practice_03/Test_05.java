package practice_03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test_05 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("RED", "bad", "Bed", "Wed", "rad");
		list.stream()
			.filter(x -> 0 < x.toUpperCase().indexOf("ED"))
			.forEach(System.out::println);
		
		System.out.println();
		System.out.println("ED가 포함된 단어");
		Predicate<String> condition1 = x -> 0 < x.toUpperCase().indexOf("ED");
		list.stream().filter(condition1).forEach(System.out::println);
		System.out.println();
		System.out.println("ED가 포함되지 않은 단어");
		Predicate<String> condition2 = condition1.negate();
		
		list.stream().filter(condition2).forEach(System.out::println);
	}
}
