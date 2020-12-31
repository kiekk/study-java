package pratice_03;

import java.util.stream.Stream;

public class Test_06 {
	public static void main(String[] args) {
		String[] arrStr = null;
		Stream<Object> stream = Stream.of((arrStr == null) ? Stream.empty() : arrStr);
	}
}
