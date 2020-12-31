package study03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrytTest {

	public static void main(String[] args) {
		//5칸 배열 선언,
		//정수 5개만 입력받기
		//입력은 무제한
		Scanner sc = new Scanner(System.in);
		int[] arNum = new int[5];
		
		int cnt = 0;
		while(true) {
			System.err.println(++cnt +"번째 정수입력[q는 종료]");
			String temp = sc.next();
			
			if(temp.equals("q")) {break;}
			
			try {
				arNum[cnt-1] = Integer.parseInt(temp);
			}catch (NumberFormatException e) {
				System.out.println("정수만 입력");
				cnt--;
			}catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("5개를 다 입력했습니다.");
				break;
			}
		}
//		int i = 0;
//		while(true) {
//			try {
//				System.out.println(("정수 입력");
//				arNum[i] = sc.nextInt();
//
//				i++;
//
//			} catch(InputMismatchException e) {
//				System.out.println("정수를 입력하세요");
//				sc.nextLine();
//			} catch(ArrayIndexOutOfBoundsException e1) {
//				System.out.println("5개를 다 입력했습니다.");
//				break;
//			}
//		}
//
//		for (int j = 0; j < arNum.length; j++) {
//			System.out.println(arNum[j]);
//		}
	}

}
