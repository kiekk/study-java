package stringEx;
/*
 	문자열
 	100, 200, 1.1, 'A' 	<--리터럴 상수 (리터럴 : 데이터 자체에 형과 크기가 이미 결정되어 있는 값)
 	
 	매크로 상수 #define PI 3.14 
 	심볼릭 상수 const int MAX = 5;
 	->java에서는 final int MAX = 5;
 	"abc"	<--상수, 형과 크기가 결정되어 있지 않았기 때문에 리터럴은 아닙니다.
 			->인스턴스로 처리하는 상수
 	그러다보니, "객체"가 필요해집니다.
 	String msg = "abc";		<--class
 	-----
 	String msg = new String("abc");	그런데, 오로지 String만 생성자 없이 인스턴스를 대입받을 수 있습니다.
 	이유
 	1) 간략화, 간소화(를 할 수 있었던 이유는 "abc"를 인스턴스로 만들었기 때문에.. 간소화를 할 수 있었습니다)
 	그래서 문자열은 리터럴상수에 비해 특별 대우★를 받습니다.
 	문자열은 데이터 영역에 만들어지는데, 만들어진 문자열을 공유합니다. 
 	 특별 대우 : 하나만 만들어서 '공유'합니다. 데이터 크기를 알수 없기 때문입니다.(큰 데이터가 올수도있기때문에)
 	2) 상수이므로, 기존의 데이터를 변경할 수 없습니다.
 	"100"이라는 문자열이 있다고 가정할 경우, "100"+"A"의 연산은 기존의 "100"에 "A"를 추가하는 것이 아니라
 	새로 인스턴스를 만들고 문자열을 연결한 "100A"를 저장합니다.
 	3)
 */
public class StringTest01 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		//str1과 str2는 같을까?
		System.out.println(str1==str2?"같다":"다르다");
		System.out.println(str1==str3?"같다":"다르다");
		System.out.println(str2==str3?"같다":"다르다");
		System.out.println(str1.equals(str2)?"같다":"다르다");
		System.out.println(str1.equals(str3)?"같다":"다르다");
		System.out.println(str2.equals(str3)?"같다":"다르다");
	}

}
