package practice_04;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
public class Test_05 {
	public static void main(String[] args) {
		String[] animals = {"�䳢","ȣ����","�����","������","�����","ȣ����"};
		System.out.println("�⺻ �迭 ���");
		System.out.println(Arrays.deepToString(animals));
		
		System.out.println("List�� ��ȯ �� ���");
		List<String> list = Arrays.stream(animals).collect(toList());
		System.out.println(list.toString());
		System.out.println("Set���� ��ȯ �� ���(�ߺ� ����)");
		Set<String> set = list.stream().collect(toSet());
		System.out.println(set.toString());
		System.out.println("TreeSet���� ��ȯ �� ���(�ߺ� ����, ����)");
		TreeSet<String> set2 = list.stream().collect(toCollection(TreeSet::new));
		System.out.println(set2.toString());
		System.out.println("HashMap���� ��ȯ �� ���");
		Map<String,Integer> map = list.stream().collect(toMap(Function.identity(), String::length
				,(x1, x2) -> x1 + x2));
		System.out.println(map.toString());
	}
}
