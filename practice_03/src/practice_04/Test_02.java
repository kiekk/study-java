package practice_04;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test_02 {
	public static void main(String[] args) {
		Stream.of("����","�̸޷�","������","�̼���")
		 	  .forEach(name -> System.out.println(name));
		System.out.println();
		Arrays.asList("����","�̸޷�","������").stream()
			  .forEach(name -> System.out.println(name));
	}
}
