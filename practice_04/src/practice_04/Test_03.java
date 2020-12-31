package practice_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_03 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,100,88,32,36,87);
		System.out.println("ЦђБе : " + list.stream().collect(Collectors.averagingInt(i -> i)));
		List<Double> list2 = Arrays.asList(100.0,100.0,83.0,23.7,34.8,22.3);
		System.out.println("ЦђБе : " + list2.stream().collect(Collectors.averagingDouble(i -> i)));
		List<Long> list3 = Arrays.asList(100L,100L,38L,32L,22L,38L,88L);
		System.out.println("ЦђБе : " + list3.stream().collect(Collectors.averagingLong(i -> i)));
	}
}
