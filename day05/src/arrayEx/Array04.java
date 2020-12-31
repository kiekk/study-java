package arrayEx;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		//문5) 정수 4자리를 입력받습니다.
		//	한글로 변경해봅니다.
		//	1024 -> 일공이사
		// 비밀번호 4 정수 -> 한글로 풀어봅니다.
		
		Scanner sc = new Scanner(System.in);
		//1번방법
//		String[] arName = {"공","일","이","삼","사","오","육","칠","팔","구"};
//		String changeNum = "";
//		System.out.print("정수 입력 : "); String inputNum = sc.next();
//		for(int i = 0;i<inputNum.length();i++) {
//			//System.out.println(arName[(int)(inputNum.charAt(i))]);
//			int index = (inputNum.charAt(i)) - 48;			//inputNum에서 입력받은 문자열을 숫자로 치환,
//															//inputNum.charAt(i) char형이므로 -48을 진행시, 자동형변환으로 연산 진행
//			changeNum += arName[index];
//		}
//		System.out.println(changeNum);
		
		//2번방법
		String arName = "공일이삼사오육칠팔구";    
		String changeNum = "";
		System.out.print("정수 입력 : "); String inputNum = sc.next();
		for(int i = 0;i<inputNum.length();i++) {
			int index = (inputNum.charAt(i)) - 48;
			changeNum += arName.charAt(index);
		}
		System.out.println(changeNum);
		sc.close();
	}//end main
}//end class
