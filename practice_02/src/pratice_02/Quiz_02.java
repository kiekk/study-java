package pratice_02;

import java.util.function.Consumer;

public class Quiz_02 {
	public static void main(String[] args) {
		Consumer<Integer> gugudan = (num) -> {
			for(int i=1;i<=9;i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		};
		
		for(int i=2;i<=9;i++) {
			gugudan.accept(i);
		}
	}
}
