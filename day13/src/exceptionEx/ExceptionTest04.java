package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	예외 상황을 만들어 봅니다.
 	이 소스에서 num/num2를 할건데
 	발생할 수 있는 예외를 모두 찾아서,
 	Exception 처리를 해줍니다.
 */
public class ExceptionTest04 {

	public static void main(String[] args) {

		int num = 100;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		try {
			num2 = sc.nextInt();
		}catch(Exception e) {
			System.out.println("정수 입력 오류입니다. 다시 입력 : ");
			sc.nextLine();
			num2 = sc.nextInt();
		}
		System.out.println("프로그램이 계속 됩니다.");
		
		//상황마다 다를 경우 각각의 Exception catch문을 작성해주고,
		//하나로 통합해서 관리할 경우 대표 Exception catch문을 작성해줍니다.
	}
}
