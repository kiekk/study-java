package practice_03;

import java.util.stream.Stream;

public class Test_09 {
	public static void main(String[] args) {
		Stream.of("mouse","cow","horse","cat","dog","monkey")
			  .peek(x -> System.out.println("ó���� ��� : " + x))
			  .map(String::toUpperCase)
			  .peek(x -> System.out.println("ó���� ��� : " + x))
			  .forEach(System.out::println);
	}
}
