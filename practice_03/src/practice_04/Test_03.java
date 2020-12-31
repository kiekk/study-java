package practice_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test_03 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		
		System.out.println("���� ��Ʈ������ forEach()");
		IntStream.rangeClosed(65, 70)
				 .forEach(x -> System.out.println((char)x));
		System.out.println("���� ��Ʈ������ forEach()");
		IntStream.rangeClosed(65, 70).parallel()
				 .forEach(x -> System.out.println((char)x));
		System.out.println("���� ��Ʈ������ forEachOrdered()");
		IntStream.rangeClosed(65, 70).parallel()
				 .forEachOrdered(x -> System.out.println((char)x));
	}
}
