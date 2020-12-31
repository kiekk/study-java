package pratice_03;

import java.util.stream.IntStream;

public class Test_07 {
	public static void main(String[] args) {
		System.out.println("반복문 사용");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("스트림 사용");
		IntStream.range(1, 11).forEach(System.out::println);
		//IntStream.rangeClosed(1,10).forEach(System.out::println);
	}
}
