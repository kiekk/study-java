package exceptionEx;

import java.nio.channels.UnresolvedAddressException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 	���� ��Ȳ�� ����� ���ϴ�.
 	
 	�ܺο��� �����͸� �ѱ� �� �ִ�.
 	c:>java.exe A.java 10 20 30  (����) {"10", "20", "30"} => main�� args �Ű������� ���޵˴ϴ�.
 	
 	������ �� cmd â������ �� �� �ִ°� �ƴ϶� ��Ŭ���� ���ο����� ������ �� �ֽ��ϴ�.
 	
 	argument �ִ� �� : 
 	1. ���� �������� �ҽ������� �ѹ� ������ ����� �մϴ�.
 	2.�ڹ� �ҽ����Ͽ��� ������ ���콺 Run As...����
 */
public class ExceptionTest05 {

	public static void main(String[] args) {
		int data = 100;
		int temp;
		try {
			temp = Integer.parseInt(args[0]);
			System.out.println(data/temp);
		} catch (NumberFormatException e) {
			System.out.println("���� ������ �ƴմϴ�."+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ��ҿ� ���� �����ϴ�."+e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�."+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ���");
	}
}
