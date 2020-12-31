package practice_04;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test_02 {
	public static void main(String[] args) {
		Stream.of("±è»ç°ú","ÀÌ¸Þ·Ð","¿À·»Áö","ÀÌ¼ö¹Ú")
		 	  .forEach(name -> System.out.println(name));
		System.out.println();
		Arrays.asList("±è»ç°ú","ÀÌ¸Þ·Ð","¿À·»Áö").stream()
			  .forEach(name -> System.out.println(name));
	}
}
