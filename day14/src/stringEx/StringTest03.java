package stringEx;
/*
 	문자열
 	
 	문자열 관리하는 메서드들
 	length() -> int
 	charAt(정수==인덱스) -> char
 	equals(Object)
 	equalsIgnoreCase(문자열)	-> 문자열 비교 (대소문자 상관X) 
 	
 	
 	concat(문자열) -> str.concat("bcd") -> str과 "bcd"를 붙여서 새로운 문자열을 return합니다(int)
 				str + "bcd" (동일)
 	contains(CharSequence or 문자,문자열) ->str.contains("bcd"); -> str에 "bcd"가 포함되어 있으면 true,없으면 false를 return합니다(boolean)
 		String s = "abcdef";
 		s.contains("cd");	-> return true;
 		
 	endsWith(문자열)	->str.endWith("txt")	-> str이 "txt"로 끝나면 true, 아니면 false를 return합니다(boolean)
 	
 	indexOf(문자,int(문자의 유니코드))	-> 	int	-> String msg = "Hello";		-> 없으면 -1, 해당 문자가 많을 경우 첫번째 검색되는 문자의 위치를 반환
 							int index = msg.indexOf('o');	-> msg 문자열의 o라는 문자의 인덱스 값을 return합니다(int)
 	indexOf(String)		->	msg.indexOf("el");	-> 찾는 문자열의 시작 위치값을 return합니다(int)
 	lastIndexOf(int)	-> int	-> 뒤에서부터 (오른쪽->왼쪽) 찾고자하는 문자,문자열의 인덱스 값을 return합니다.				
 	lastIndexOf(String)	-> int		
 	replace(char1,char2)	-> String	-> msg.replace('H','C');	-> "Cello"문자열을 return합니다.(String)
 	replace(문자열도가능)
 	char1 -> 기존 문자
 	char2 -> 바꿀 문자	
 	
 	
 	★★
 	문자열.split("문자열 분리자=regex); -> String []
 	
 	문자열.substring(5)	-> 인덱스의 값이 5인 문자부터 시작해서 나머지 문자열을 반환
 	문자열.substring(0,5)	-> 0부터 5전까지의 문자열을 반환	0 <= 문자열 < 5
 	
 	trim()	: 문자열에서 좌우 공백이 있을 경우, 공백을 없애고 실제 문자열만 출력합니다. 처음과 끝의 공백만 제거(문자열 사이는 X)
 	
 */
public class StringTest03 {

	public static void main(String[] args) {
		String msg1 = "abcdef";
		//문자열 길이
		int length = msg1.length();
		System.out.println("문자열 : "+length+"개");
		//문자열 비교
		System.out.println(msg1.equalsIgnoreCase("ABcdEf"));
		//문자열 연결
		System.out.println(msg1.concat("HI"));
		System.out.println(msg1+"HI");
		//문자열 포함여부 구하기
		String msg2 = "Hello";
		System.out.println("Hello에 l이 있습니까? : "+msg2.contains("l"));
		//문자열 변경
		String temp = msg2.replace("ll", "LL");
		System.out.println("ll을 LL로 교체 : "+temp);
		//문자열의 위치 구하기 lastIndexOf, indexOf
		String msg3 = "abcasdferiuijciovjoijiopqklamxcklzvwer";
		System.out.println("i의 lastIndefOf 값 : "+msg3.lastIndexOf('i'));
		System.out.println("iam의 lastIndefOf 값 : "+msg3.lastIndexOf("lam"));
		System.out.println("i의 IndefOf 값 : "+msg3.indexOf('i'));
		//구분자로 문자열 나누기
		String msg4 = "asdv,ccvd:erdfas,dfer:qwersc,xc:dcv,cvnt:awere,yyuas:asd,zxcv";
		String[] arMsg = msg4.split(":");
		System.out.println(": 구분자로 문자열 나누기");
		for(String a : arMsg) 
			System.out.println(a);
		String[] arMsg1 = msg4.split(",");
		System.out.println("---------------");
		System.out.println(", 구분자로 문자열 나누기");
		for(String a : arMsg1)
			System.out.println(a);
		System.out.println("---------------");
		//문자열의 공백 제거
		String msg5 = "  dfdf  ererer   ";
		System.out.println(msg5.trim());
		//문자열의 일부분만 추출
		String msg6 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(msg6.substring(5,10));
		System.out.println(msg6.substring(12));
	}

}
