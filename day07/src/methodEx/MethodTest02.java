package methodEx;

import java.util.Scanner;

public class MethodTest02 {
	int num;
	int num2;
	//private는 같은 클래스인 경우에는 사용이 가능합니다.
	//다른 클래스에서는 사용이 불가능합니다.
	private int add() {										//더하기
		return this.num + this.num2; 
	}
	private int sub() {										//빼기
		return this.num - this.num2; 
	}
	private double div() {									//나누기
		return (double)num / num2; 
	}
	private int mul() {										//곱하기
		return this.num * this.num2;
	}
	public void printCalcResult() {			//연산 결과
		System.out.println("덧셈 결과 : " + this.add());
		System.out.println("뺄셈 결과 : " + this.sub());
		System.out.println("나눗셈 결과 : "+ this.div());
		System.out.println("곱셈 결과 : " + this.mul());
	}
	public static void main(String[] args) {
		//인스턴스 변수 num, num2 에 값을 입력받은 후,
		//printCalc 메서드를 이용해 사칙연산 결과값을 출력해봅니다.
		//printCalc 메서드 내부에서는 각각 add()~mul()을 이용해야 합니다.
		Scanner sc = new Scanner(System.in);
		for(;;) {
			MethodTest02 calc = new MethodTest02();
			System.out.println("-----계산기 프로그램-----");
			System.out.print("첫번째 정수를 입력하세요 : "); calc.num = sc.nextInt();
			System.out.print("두번째 정수를 입력하세요 : "); calc.num2 = sc.nextInt();
			int inputNum = 0;
			System.out.println("-----메뉴-----\n1.더하기\n2.빼기\n3.나누기\n4.곱하기\n5.전체보기\n0.종료하기"); inputNum = sc.nextInt();
			if(inputNum == 0)break;
			switch(inputNum) {
				//원래는 private니까 호출이 안되지만, 같은클래스니까 가능하므로..만들어봤습니다.
				case 1: System.out.println(calc.add());break;
				case 2: System.out.println(calc.sub());break;
				case 3: System.out.println(calc.div());break;
				case 4: System.out.println(calc.mul());break;
				case 5: calc.printCalcResult(); break;
			}
			System.out.println();
		}//end for
	}//end main
}//end class