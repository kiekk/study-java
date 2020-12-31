package pratice_02;

import java.util.function.BiFunction;

public class Test_04 {
	public static void main(String[] args) {
		Math math = new Math();
		BiFunction<Integer, Integer, Integer> minus1 = (a,b) -> math.minus(a, b);
		BiFunction<Integer, Integer, Integer> minus2 = math::minus;
		
		System.out.println("람다식 - " + minus1.apply(10, 2));
		System.out.println("메소드 참조 - " + minus2.apply(8, 3));
	}
}
class Math{
	public int minus(int a, int b) {
		return a - b;
	}
}