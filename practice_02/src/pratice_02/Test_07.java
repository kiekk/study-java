package pratice_02;

import java.util.function.BiConsumer;

public class Test_07 {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> plus1 = (a,b) -> new Plus(a,b);
		System.out.println("람다식 ");
		plus1.accept(1, 2);
		
		BiConsumer<Integer, Integer> plus2 = Plus::new;
		System.out.println("생성자 참조");
		plus2.accept(3, 4);
	}
}

class Plus {
	public Plus(int a, int b) {
		System.out.println("a + b = " + (a+b));
	}
}
