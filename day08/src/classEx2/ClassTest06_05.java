package classEx2;

import java.util.Arrays;

public class ClassTest06_05 {
	public static void main(String[] args) {
		String a = "Hello World Java";
		System.out.println(a.contains("hello"));
		System.out.println(a.contains("Hello"));
		System.out.println(a.contains("World  "));
		System.out.println(a.contains("World "));
		System.out.println(a.contains("World"));
		System.out.println(a.contains("Java"));		
		System.out.println(a.contains(" Java"));		
		System.out.println(a.contains(" Java "));		
	}//end main
}//end class
