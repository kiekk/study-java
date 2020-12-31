package pratice_02;

import java.util.function.Function;

public class Test_02 {
	public static void main(String[] args) {
		Function<String, String> helloLambda = (name) -> HelloTo.hello(name);
		Function<String, String> helloStatic = HelloTo::hello;
		
		System.out.println(helloLambda.apply("김사과"));
		System.out.println(helloStatic.apply("이메론"));
	}
}

class HelloTo{
	public static String hello(String name) {
		return "Hello " + name;
	}
}
