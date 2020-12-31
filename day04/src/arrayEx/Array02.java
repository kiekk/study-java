package arrayEx;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 선언 및 값입력
//		int []ar = new int[5];
//		for(int i = 0;i<ar.length;i++) {
//			System.out.print("ar["+i+"]에 저장할 값을 입력해 주세요 : "); ar[i] = sc.nextInt();
//		}
//		for(int i = 0;i<ar.length;i++) {
//			System.out.println("ar["+i+"]에 저장된 값 : "+ar[i]);
//		}
		//1.원하는 값을 입력받아서 배열에 넣어 봅니다.
		//	출력해 봅니다.
		
		//2.
		String[] arStr = {"이순신","박문수","강감찬","을지문덕"};
		//arStr 선언을 수정하고
		//각각의 요소를 출력하세요.
//		for(int i = 0;i<arStr.length;i++) {
//			System.out.println(arStr[i]);
//		}
		//3.
		arStr = new String[]{"abc","dEf","GHi"};
		for(int i = 0;i<arStr.length;i++) {
			for(int j = 0;j<arStr[i].length();j++) {	
				if(arStr[i].charAt(j) >= 97 && arStr[i].charAt(j) <= 122)
					System.out.print((char)(arStr[i].charAt(j) - 32));
				else
				System.out.print(arStr[i].charAt(j));
			}
			System.out.println();
		}
		//arStr에서 소문자만 대문자로 변경해 봅니다.
		//대문자는 그대로 대문자
		
		
		//string buffer
		//4. 영어단어로 문자열을 입력받은 후
		//	각 단어에 대문자->소문자로 변경해 봅니다.
		System.out.print("영어단어를 입력해 주세요 : "); String word = sc.next();
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i) >= 97 && word.charAt(i) <= 122)
				System.out.print((char)(word.charAt(i) - 32));
			else
				System.out.print(word.charAt(i));
			}
		}
	}
