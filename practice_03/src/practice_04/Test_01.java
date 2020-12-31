package practice_04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test_01 {
	public static void main(String[] args) {
		int[] numbers = IntStream.rangeClosed(1, 100).toArray();
		
		Arrays.stream(numbers).forEach(System.out::println);
	}
}
