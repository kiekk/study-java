package practice;

public class Annotation {
	public static void main(String[] args) {
		int num = new Integer(10);
		Integer num2 = new Integer(20);
		int num3 = num2;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num == num2.intValue());
	}
	
}
