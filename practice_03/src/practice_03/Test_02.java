package practice_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_02 {
	public static void main(String[] args) {
		String[] str1 = {"����","�̸޷�","���ϳ�"};
		String[] str2 = {"������","������"};
		
		Stream<String[]> stm = Stream.of(str1, str2);
		List<String> list = stm.flatMap(x -> Arrays.stream(x))
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
}
