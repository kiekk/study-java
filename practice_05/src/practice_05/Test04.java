package practice_05;

import java.util.Arrays;

/*
 * "온라인 결제시스템을 개발하는 개발자가 여러 종류의 신용카드를 지원하고 싶어한다. 하지만 카드번호가 길어서 입력하다 실수하는 경우가 잦으므로 사용자가 입력한 번호를 확인할 방법이 필요하다.

개발자는 다음과 같은 "룬 알고리즘"이 모든 카드에 적용됨을 알고 있다.
먼저 각 신용카드의 각 숫자를 쪼갠다. 예를 들어서, 21378은
2 1 3 7 8

만약 짝수 개수의 숫자가 존재한다면 홀수의 위치에 있는 숫자에 2를 곱한다. 반대로 홀수 개수의 숫자가 존재한다면 짝수의 위치에 있는 숫자에 2를 곱한다. 위치를 구할 때는 첫번째 숫자를 1로 지정한다. 위에 예시로 든 번호는 홀수 개수의 숫자가 있으므로 짝수의 위치에 있는 숫자에 2를 곱한다:

2 1 3 7 8 은
2 2 3 14 8 이 된다.

이 때, 짝수의 위치에 있는 숫자는 고유한 숫자이므로 2자리 수가 나타나더라도 변형해서는 안 된다는 것을 유의한다.

마지막으로 모든 숫자를 쪼개어 합을 구한다 (2자리 숫자인 경우에는 각 자리의 숫자를 다른 수로 취급하여 합에 더해야 한다):

2 + 2 + 3 + 1 + 4 + 8 = 20

합이 10의 배수라면 이는 유효한 번호이다. 그렇지 않다면 유효하지 않은 번호이다.

신용카드번호 String cardNumber에 대하여 카드번호가 유효하다면 "VALID", 그렇지 않다면 "INVALID"를 반환하라. (따옴표는 문자열을 나타내기 위함일 뿐이며 결과값에는 포함되지 않는다)"
 * 
 */
public class Test04 {
	public String solution(String cardNumber){
		int index = 0;
		int result = 0;
		int[] arr = new int[cardNumber.length()];
		for(int i=0;i<cardNumber.length();i++) {
			arr[i] = Integer.parseInt(cardNumber.charAt(i) + "");
 		}
		//홀수개의 카드넘버
		if(cardNumber.length() % 2 == 1)
			index = 1;
		//홀수개, 짝수개의 경우를 나누어 각 자리의 숫자에 2를 곱합니다.
		for(;index<cardNumber.length();index+=2) {
			arr[index] *= 2;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int a : arr) {
			result += a;
			//숫자가 2자리라면 각 자리의 숫자를 더하도록 연산하여 결과를 저장합니다.
			if(a >= 10)
				result -= 9;
		}
		//결과가 10의 배수라면
		System.out.println(result);
		if(result % 10 == 0)
			return "VALID";
		else 
			return "INVALID";
    }
	public static void main(String[] args) {
		Test04 test = new Test04();
		String cardNumber = "31378";
		String result = test.solution(cardNumber);
		System.out.println(result);
	}
}
