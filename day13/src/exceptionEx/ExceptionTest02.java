package exceptionEx;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
//		System.out.println(10/0);
		int num = 100;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		try {
			System.out.println(num/num2);
		}catch(ArithmeticException e){
//			System.out.println("예외가 발생되면 이 영역(catch()블럭) 으로 들어옵니다.");
//			System.out.println(e.getClass().getName());
//			System.err.println(e.getMessage());			//out대신 error의 약자인 err로 작성하면 문구가 빨간색으로 강조되어 출력됩니다.
			System.out.print("0이외의 수를 입력해 주세요\n정수 입력 : ");
			num2 = sc.nextInt();
			System.out.println(num/num2);
		}finally {
			System.out.println("이 블럭은 finally 블럭입니다.");
			System.out.println("catch블럭은 여러개 중 하나만 실행하고, try~catch를 빠져나가는데,");
			System.out.println("finally 블럭은 반드시 실행해야 하는 블럭입니다.");
		}
		System.out.println("그 다음 소스");
		System.out.println("그 다음 소스2");
		System.out.println("그 다음 소스3");
		System.out.println("그 다음 소스4");
	}

}
