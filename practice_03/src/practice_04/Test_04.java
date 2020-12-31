package practice_04;

import java.util.stream.IntStream;

public class Test_04 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("for문으로 sum 구하기");
		for(int i=0;i<=10;i++) {
			sum1 += i;
		}
		System.out.println("sum1 : " + sum1);
		System.out.println("reduce()로 sum 구하기");
		sum2 = IntStream.rangeClosed(0, 10).reduce(0, Integer::sum);
		System.out.println("sum2 : " + sum2);
	}
}
