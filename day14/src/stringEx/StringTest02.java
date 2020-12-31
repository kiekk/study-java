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
 */
public class StringTest02 {

	public static void main(String[] args) {
	
	}

}
