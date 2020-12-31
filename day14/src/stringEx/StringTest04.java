package stringEx;
/*
 	
 */
public class StringTest04 {

	public static void main(String[] args) {
		//100 문자열로 만들고 싶다
		//1) String tmp = 100+"";		//연산자 중복정의(java는 X)
		//2) String temp = String.valueOf(100);	명시적으로 수행해야 할 메서드를 기재했기 때문에 
												//1)보다는 더 빠르게 수행합니다.
		
		String tmp = String.valueOf(100);
		System.out.println(tmp);
		
	}

}
