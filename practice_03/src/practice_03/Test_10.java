package practice_03;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_10 {
	public static void main(String[] args) {
		Stream.of("����","���ϳ�","�̸޷�","������","�̼���")
			  .limit(3)
			  .forEach(System.out::println);
		Map<String, Long> info = Stream.of("��","��","��","��","��","��")
									   .skip(2)
									   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(info);
	}
}
