package practice_04;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_02 {
	public static void main(String[] args) {
		List<String> G7 = Stream.of("�̱�","����","������","����","��Ż����","ĳ����","�Ϻ�")
								.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		System.out.println(G7);
		G7.add("�ѱ�");
	}
}
