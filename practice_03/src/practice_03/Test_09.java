package practice_03;

import java.util.stream.Stream;

public class Test_09 {
	public static void main(String[] args) {
		Stream.of("mouse","cow","horse","cat","dog","monkey")
			  .peek(x -> System.out.println("贸府且 夸家 : " + x))
			  .map(String::toUpperCase)
			  .peek(x -> System.out.println("贸府等 夸家 : " + x))
			  .forEach(System.out::println);
	}
}
