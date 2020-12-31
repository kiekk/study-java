package day01;
/*
 	자바의 기본자료형
 	- 변수 : 저장소
 	- 변수 선언 : 타입 변수명
 	- (c언어) 	 : char short int long float double
 	- (java언어) : ★boolean char byte short int long float double
 	
 	byte 자료형 1byte만 저장할 수 있는 정수 저장 자료형
 		byte b = 128;	byte의 범위 -128 ~ 127
 						형변환 해줘야 합니다.
 	자바는 unsigned 명령어가 없습니다.
 	
 	byte는 거의 사용하지 않습니다.(아래 3가지 경우 제외)
 		- 파일 입출력
 		- 이미지 읽어오기 등등..
 		- c언어에서 char자료형과 호환★
 		
*/
public class DataType03 {

	public static void main(String[] args) {
		byte b = (byte)128;
		System.out.println("바이트 변수 b : " + b);
		

	}

}
