package practice_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_02 {
	public static void main(String[] args) {
		String[] str1 = {"김사과","이메론","반하나"};
		String[] str2 = {"오렌지","이참외"};
		
		Stream<String[]> stm = Stream.of(str1, str2);
		List<String> list = stm.flatMap(x -> Arrays.stream(x))
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
}
