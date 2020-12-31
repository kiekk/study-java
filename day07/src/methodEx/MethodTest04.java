package methodEx;

import java.util.Scanner;
/*
 	call by value (값 전달)
 	
 	fct(10,20) <-- 기본값을 전달하는 것
 	
 	call by reference (참조값 전달)
 	
 	fct(객체 or 인스턴스) <-- 참조값을 전달하는 것
 	fct(obj)
 	fct(arr)	전달한 객체 or 인스턴스의 값이 동시에 변경됩니다.
 	
 */
public class MethodTest04 {
	static Scanner sc = new Scanner(System.in);
	/**
	 * 여러개의 정수 중에서 최대값과 최소값을 구하는 메서드 입니다.
	 * @param arRand 배열로 된 정수값을 보냅니다.
	 * @param maxMin 최소값과 최대값을 저장시켜 놓을 배열을 보냅니다.
	 */
	
	//return이나 (포인터) 없이도, 타 메서드의 결과값을 변경시킬 수 있습니다.
	//call by reference
	void getMax_minNumber(int []arRand,int []maxMin){
		maxMin[0] = arRand[0];											//최대값
		maxMin[1] = arRand[0];											//최소값
		for(int i = 1;i<arRand.length;i++) {
			if(maxMin[0] < arRand[i]) maxMin[0] = arRand[i];			//최대값 저장
			if(maxMin[1] > arRand[i]) maxMin[1] = arRand[i];			//최소값 저장
		}//end for(i)
	}//end getMax_minNumber
	
	String changeLowerToUpper(String word) {
		String result = "";
		//대문자 변경하는 알고리즘
		for(int i = 0;i<word.length();i++) {						
				if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
				result += (char)(word.charAt(i) - 32);
				else
				result += word.charAt(i);
		}//end for(i)
		return result;
	}
	public static void main(String[] args) {
		int []maxMin= {0,0};
		int []arRand = {2,3,4,2,3,4,2,3,46,7,8,9,2};
		MethodTest04 max_min = new MethodTest04();
		max_min.getMax_minNumber(arRand,maxMin);	//난수들, 최대값과 최소값을 저장할 수 있는 배열
		//최대, 최소값 출력
		System.out.println("최대값 : "+maxMin[0]);
		System.out.println("최소값 : "+maxMin[1]);
		
		System.out.printf("\n\n\n\n\n\n\n\n");
		System.out.print("영어단어를 입력해 주세요 : "); String word = sc.next();
		System.out.println("수정 전 : " + word); 							//수정 전
		String changeAlpha = new MethodTest04().changeLowerToUpper(word);	//대문자 변경
		System.out.println("수정 후 : " + changeAlpha);						//수정 후
		//
	}//end main	
}//end class
