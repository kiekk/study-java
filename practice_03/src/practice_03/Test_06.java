package practice_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_06 {
	public static void main(String[] args) {
		Integer[] int1 = {1, 3, 5, 7, 9};
		Integer[] int2 = {2, 4, 6, 8, 10};
		
		Stream<Integer[]> stm1= Stream.of(int1, int2);
		List<Integer> list1 = stm1.flatMap(x -> Arrays.stream(x))
				 				  .sorted()
				 				  .collect(Collectors.toList());
		System.out.println(list1.toString());
	}
}
