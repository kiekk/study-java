package day01;
/*
 	출력문
 	 
 	System.out.printf("%d %s %c\n",인자1, 인자2, 인자3);
	f : format
 	System.out.print(1+2)	->상수
 	System.out.print("")	->문자열
 	System.out.print(' ')	->문자
 	System.out.print(1.2)	->실수
 	System.out.print(변수)	->변수
 	System.out.print(" " + 데이터) -> 최종 문자열로 인식됩니다.
 					문자열 + 데이터 -> +의 의미는 '연결', 앞뒤를 붙입니다. 산술연산자 X
 					print(10+20/3) -> 16  ->정수
 					print("10"+20/3-> 106 ->문자열
  	줄바꿈X
 	System.out.println() == print("\n")     ln -> line skip 개행의 의미를 가집니다.
 	줄바꿈O
 */
public class PrintTest {
	
	public static void main(String[] args) {
		int myAge = 10;
		int jjakAge = 15;
		int sum = myAge + jjakAge;
		System.out.println("내 나이는 " + myAge + "살 이고, 짝 나이는 " + jjakAge + "살 입니다. 둘의 나이는 "+ sum +"살 입니다.");
		
		//System.out.print()	<--파일명 가져올때
		//System.out.printf()	<--실수값 처리할 때, ==>string.format()
		//System.out.println()	<--일반적으로 가장 많이 사용합니다.
		
		//단축키 완성 ctrl + space syso까지 입력후 ctrl+space를 누르면 자동 완성
		
		//소스 이동 alt + 방향키(위,아래)
		
		//소스 복사 ctrl + alt 방향키(위, 아래)
		//인텔 그래픽제어판의 단축키와 겹칠수 있으니, 유의
	}

}
