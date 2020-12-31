package practice_04;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test_09 {
	public static void main(String[] args) {
		String[] animals = {"토끼","호랑이","강아지","고양이","고양이","돼지","호랑이","토끼"};
		System.out.println("기본 배열 출력");
		System.out.println(Arrays.deepToString(animals));
		System.out.println("List로 변환 후 출력");
		List<String> ani1 = Arrays.stream(animals).collect(toList());
		System.out.println(ani1.toString());
		System.out.println("Set으로 변환 후 출력");
		Set<String> ani2 = Arrays.stream(animals).collect(toSet());
		System.out.println(ani2.toString());
		System.out.println("distinct()로 중복 제거 ");
		List<String> ani3 = Arrays.stream(animals).distinct().collect(toList());
		System.out.println(ani3.toString());
	}
}
