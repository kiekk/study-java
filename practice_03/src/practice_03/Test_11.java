package practice_03;

import java.util.stream.Stream;

public class Test_11 {
	public static void main(String[] args) {
		Stream.generate(Math::random)
			  .map(n -> (n * 9) + 1)
			  .map(Math::round)
			  .limit(10)
			  .sorted()
			  .forEach(System.out::println);
	}
}
