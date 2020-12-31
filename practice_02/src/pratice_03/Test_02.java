package pratice_03;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test_02 {
	public static void main(String[] args) {
		String[] strArr = {"±è»ç°ú","ÀÌ¸Þ·Ð","¿À·»Áö"};
		int[] intArr = {3,4,5,6,7};
		double[] floatArr = {3.1, 3.5, 3.7, 5.4};
		
		Stream<String> strStm = Arrays.stream(strArr);
		IntStream intStm = Arrays.stream(intArr);
		DoubleStream floatStm = Arrays.stream(floatArr);
		
		strStm.forEach(System.out::println);
		intStm.forEach(System.out::println);
		floatStm.forEach(System.out::println);
	}
}
