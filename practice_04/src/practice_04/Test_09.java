package practice_04;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test_09 {
	public static void main(String[] args) {
		String[] animals = {"�䳢","ȣ����","������","�����","�����","����","ȣ����","�䳢"};
		System.out.println("�⺻ �迭 ���");
		System.out.println(Arrays.deepToString(animals));
		System.out.println("List�� ��ȯ �� ���");
		List<String> ani1 = Arrays.stream(animals).collect(toList());
		System.out.println(ani1.toString());
		System.out.println("Set���� ��ȯ �� ���");
		Set<String> ani2 = Arrays.stream(animals).collect(toSet());
		System.out.println(ani2.toString());
		System.out.println("distinct()�� �ߺ� ���� ");
		List<String> ani3 = Arrays.stream(animals).distinct().collect(toList());
		System.out.println(ani3.toString());
	}
}
