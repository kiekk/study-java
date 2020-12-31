package practice;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String [] s1 = new String[1];
		
		String [] s2 = new String[1];
		
		String [] s3 = {"안녕"};
		
		String s6 = new String("안녕");
		String s7 = new String();
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		String s4 = "안녕";
		String s5 = "";
		System.out.println("s1 배열 문자 입력");
		s1[0] = input.next();
		
		System.out.println("s5 스트링형 변수 입력");
		s5 = input.next();
		
		System.out.println("new s7 스트링형 변수 입력");
		s7 = input.next();
		
		s2[0] = "안녕";
		
		if(s1[0]=="안녕") {
			System.out.println("s1의 안녕");
		}
		if(s2[0]=="안녕") {
			System.out.println("s2의 안녕"); // 얘만 입력문이 아님
		}
		if(s5=="안녕") {
			System.out.println("s5의 안녕");
		}
		if(s7=="안녕") {
			System.out.println("s7의 안녕");
		}
		
		System.out.println();
		
		// == 위치를 찾아가는 것. 같은 영역 안에서는 문단의 끝 null값 때문에 못 찾아가고
		// 다른 영역에서는 서로 같은 메모리가 아니라 못 찾아간다. 같은 영역 내의 주소를 찾아가기 때문에 String pool 참조
		// 
		System.out.println("s1=> 배열 문자 입력문 == 배열 문자 대입");
		System.out.println(s1[0]==s2[0]); // 문단의 끝 null값 때문에 못 찾아감.
		System.out.println("s1=> 배열 문자 입력문 == 배열 문자 초기화");
		System.out.println(s1[0]==s3[0]); // 문단의 끝 null값 때문에 못 찾아감.
		System.out.println("s1=> 배열 문자 입력문 == 스트링형 변수 선언 및 초기화");
		System.out.println(s1[0]==s4); // 
		System.out.println("s1=> 배열 문자 입력문 == 스트링형 변수 입력문");
		System.out.println(s1[0]==s5);
		System.out.println("s1=> 배열 문자 입력문 == 스트링형 변수 new 초기화");
		System.out.println(s1[0]==s6); // 
		System.out.println("s2=> 배열 문자 입력문 == 스트링형 변수 new 입력문 ");
		System.out.println(s1[0]==s7); // 
		
		System.out.println("------------------------------------------");
		// s2와 s3는 같은 메모리 안에서 문단의 끝 null값이 없기 때문에 찾아갈 수 있다.
		// s2와 s4는 문단의 끝 null값이 없고 
		System.out.println("s2=> 배열 문자 대입 == 배열 문자 초기화");
		System.out.println(s2[0]==s3[0]);
		System.out.println("s2=> 배열 문자 대입 == 스트링형 변수 선언 및 초기화");
		System.out.println(s2[0]==s4);
		System.out.println("s2=> 배열 문자 대입 == 스트링형 변수 입력문");
		System.out.println(s2[0]==s5);
		System.out.println("s2=> 배열 문자 대입 == 스트링형 변수 new 초기화");
		System.out.println(s2[0]==s6);
		System.out.println("s2=> 배열 문자 대입 == 스트링형 변수 new 입력문 ");
		System.out.println(s2[0]==s7);
		
		System.out.println("------------------------------------------");

		System.out.println("s4는 스트링형 변수 선언 및 초기화");
		System.out.println("s4=> 스트링형 변수 선언 및 초기화 == 스트링형 변수 입력문");
		System.out.println(s4==s5);
		System.out.println("s4=> 스트링형 변수 선언 및 초기화 == 스트링형 변수 new 초기화");
		System.out.println(s4==s6);
		
		System.out.println("------------------------------------------");
		
		System.out.println("s6과 s5");
		System.out.println("s5=> 스트링형 변수 입력문 == 스트링형 변수 new 초기화");
		System.out.println(s5==s6);
		
		System.out.println("------------------------------------------");

		
		System.out.println("s6=> 스트링형 변수 new 초기화 == 스트링형 변수 new 입력문 ");
		System.out.println(s6==s7);
		
		System.out.println(s1.hashCode());
		System.out.println(s1[0].hashCode());
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
	}
}
