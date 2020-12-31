package practice_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_06 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("jsp","java","c","javascript","html","css");
		
		String a = list.stream().collect(Collectors.joining());
		System.out.println(a);
		
		String b = list.stream().collect(Collectors.joining(", "));
		System.out.println(b);
		
		String c = list.stream().collect(Collectors.joining(", ","프로그래밍 언어에는 "," 등이 있습니다."));
		System.out.println(c); 
	}
}
