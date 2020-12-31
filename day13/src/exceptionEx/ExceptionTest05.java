package exceptionEx;

import java.nio.channels.UnresolvedAddressException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	예외 상황을 만들어 봅니다.
 	
 	외부에서 데이터를 넘길 수 있다.
 	c:>java.exe A.java 10 20 30  (엔터) {"10", "20", "30"} => main의 args 매개변수로 전달됩니다.
 	
 	하지만 곡 cmd 창에서만 할 수 있는게 아니라 이클립스 내부에서도 연출할 수 있습니다.
 	
 	argument 넣는 법 : 
 	1. 값을 넣으려는 소스파일을 한번 컴파일 해줘야 합니다.
 	2.자바 소스파일에서 오른쪽 마우스 Run As...선택
 */
public class ExceptionTest05 {

	public static void main(String[] args) {
		int data = 100;
		int temp;
		try {
			temp = Integer.parseInt(args[0]);
			System.out.println(data/temp);
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식이 아닙니다."+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 요소에 값이 없습니다."+e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 계속");
	}
}
