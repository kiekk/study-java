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
		String[] animals = {"토끼","호랑이","고양이","강아지","고양이","호랑이"};
		System.out.println("기본 배열 출력");
		System.out.println(Arrays.deepToString(animals));
		
		System.out.println("List로 변환 후 출력");
		List<String> list = Arrays.stream(animals).collect(toList());
		System.out.println(list.toString());
		System.out.println("Set으로 변환 후 출력(중복 제거)");
		Set<String> set = list.stream().collect(toSet());
		System.out.println(set.toString());
		System.out.println("TreeSet으로 변환 후 출력(중복 제거, 정렬)");
		TreeSet<String> set2 = list.stream().collect(toCollection(TreeSet::new));
		System.out.println(set2.toString());
		System.out.println("HashMap으로 변환 후 출력");
		Map<String,Integer> map = list.stream().collect(toMap(Function.identity(), String::length
				,(x1, x2) -> x1 + x2));
		System.out.println(map.toString());
	}
}
