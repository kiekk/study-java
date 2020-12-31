package practice_03;

import java.util.Arrays;
import java.util.List;

public class Test_08 {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,1,2,3,5,6,7,8);
		
		numberList.stream()
				  .distinct()
				  .sorted()
				  .forEach(System.out::println);
	}
}
